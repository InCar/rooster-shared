package com.incarcloud.rooster.datapack;

import com.incarcloud.rooster.share.Constants;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Date;

/**
 * @author Xiong Guanghua
 * @ClassName: DataPackWrap
 * @Description: gather解析出来的包
 * @date 2017-06-07 17:34
 */
public class DataPack {

    // 协议组织、名称和版本
    final protected String _group;
    final protected String _name;
    final protected String _version; // like 1.2.3

    // 务必小心处理_buf, 它需要手动释放freeBuffer() http://netty.io/wiki/reference-counted-objects.html#derived-buffers
    private ByteBuf _buf;

    /**
     * 数据包接收时间
     */
    protected Date receiveTime;

    /**
     * 默认构造函数
     *
     * @param group   协议所属组织
     * @param name    协议名称
     * @param version 协议版本
     */
    public DataPack(String group, String name, String version) {
        if (group == null || name == null || version == null)
            throw new IllegalArgumentException();
        if (group.isEmpty() || name.isEmpty() || version.isEmpty())
            throw new IllegalArgumentException();
        if (group.contains("-") || name.contains("-") || version.contains("-"))
            throw new IllegalArgumentException("group, name and version can not contain character \"-\" ");

        _group = group;
        _name = name;
        _version = version;
    }

    /**
     * 获取包标签(实际上是设备的完整的协议信息)
     *
     * @return
     */
    public String getMark() {
        return String.format("%s-%s-%s", _group, _name, _version);
    }

    /**
     * 获取数据Base64加密后的字符串
     *
     * @return
     */
    public String getDataB64() {
        return Base64.getEncoder().encodeToString(getDataBytes());
    }

    /**
     * 获取设备当前使用的协议
     *
     * @return
     */
    public String getProtocol() {
        return getMark();
    }

    /**
     * 获取数据字节数组
     *
     * @return
     */
    public byte[] getDataBytes() {
        if (_buf == null) return null;
        byte[] dst = new byte[_buf.readableBytes()];
        _buf.getBytes(0, dst);
        return dst;
    }

    /**
     * 序列化为字节流
     *
     * @return
     */
    public byte[] serializeToBytes() throws UnsupportedEncodingException {
        // 校验参数合法性
        if (null == receiveTime) {
            throw new IllegalArgumentException("receiveTime is null");
        }

        // 规则：协议标签#接收时间戳#报文数据
        return (getMark() + "#" + getReceiveTime().getTime() + "#" + getDataB64()).getBytes(Constants.DEFAULT_CHARSET);
    }

    /**
     * 反序列化为DataPack对象
     *
     * @param bytes DataPack对象序列化字节流
     * @return
     * @throws UnsupportedEncodingException
     */
    public static DataPack deserializeFromBytes(byte[] bytes) throws UnsupportedEncodingException {
        // 校验参数合法性
        String content = new String(bytes, Constants.DEFAULT_CHARSET);
        if (!content.contains("#")) {
            return null;
        }

        // 字符串转对象
        String[] dataStrings = content.split("#");
        String mark = dataStrings[0];
        String receiveTimeMillis = dataStrings[1];
        String dataB64 = dataStrings[2];

        // 设置报文数据
        byte[] data = Base64.getDecoder().decode(dataB64);
        ByteBuf buf = Unpooled.buffer(data.length);
        buf.writeBytes(data);

        // 组装DataPack对象数据
        String[] markStrings = mark.split("\\-"); //协议标签："协议组织-协议名称-协议版本"
        DataPack dataPack = new DataPack(markStrings[0], markStrings[1], markStrings[2]);
        dataPack.setReceiveTime(new Date(Long.parseLong(receiveTimeMillis)));
        dataPack.setBuf(buf);

        return dataPack;
    }

    /**
     * 设置数据流信息
     *
     * @param buf 字节流
     */
    public void setBuf(ByteBuf buf) {
        // free previous buf
        freeBuf();

        _buf = buf;
        _buf.retain();
    }

    /**
     * 释放数据
     */
    public void freeBuf() {
        if (_buf != null) {
            _buf.release();
            _buf = null;
        }
    }

    /**
     * 获得网关接收时间
     *
     * @return
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置网关接收时间
     *
     * @param receiveTime 接收时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "DataPack{" +
                "_group='" + _group + '\'' +
                ", _name='" + _name + '\'' +
                ", _version='" + _version + '\'' +
                ", _buf=" + _buf +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
