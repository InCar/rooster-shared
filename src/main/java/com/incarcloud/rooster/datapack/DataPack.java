package com.incarcloud.rooster.datapack;

import com.incarcloud.rooster.util.DataTool;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @author Xiong Guanghua
 * @ClassName: DataPackWrap
 * @Description: gather解析出来的包
 * @date 2017-06-07 17:34
 */
public class DataPack {
    final protected String _group;
    final protected String _name;
    final protected String _version; // like 1.2.3
    // 务必小心处理_buf, 它需要手动释放freeBuffer() http://netty.io/wiki/reference-counted-objects.html#derived-buffers
    private ByteBuf _buf;

    public DataPack(String group, String name, String version){
        if(group == null || name == null || version == null)
            throw new IllegalArgumentException();
        if(group.isEmpty() || name.isEmpty() || version.isEmpty())
            throw new IllegalArgumentException();
        if(group.contains("-") || name.contains("-") || version.contains("-"))
            throw new IllegalArgumentException("group, name and version can not contain character \"-\" ");

        _group = group;
        _name = name;
        _version = version;
    }

    /**
     * 获取包标签
     * @return
     */
    public String getMark(){
        return String.format("%s-%s-%s", _group, _name, _version);
    }

    /**
     * 获取数据Base64加密后的字符串
     * @return
     */
    public String getDataB64(){
        return Base64.getEncoder().encodeToString(getDataBytes());
    }




    /**
     * 获取数据字节数组
     * @return
     */
    public byte[] getDataBytes(){
        if(_buf == null) return null;
        byte[] dst = new byte[_buf.readableBytes()];
        _buf.getBytes(0, dst);
        return dst;
    }


    /**
     * 序列化为字节数组
     * @return
     */
    public byte[] serializeToBytes() throws UnsupportedEncodingException{
        return  (getMark()+"->"+getDataB64()).getBytes("UTF-8");
    }


    /**
     * 反序列化为DataPack对象
     * @param bytes
     * @return
     * @throws UnsupportedEncodingException
     */
    public static DataPack deserializeFromBytes(byte [] bytes) throws UnsupportedEncodingException{

        String s = new String(bytes,"UTF-8");
        if(!s.contains("->")){
            return null;
        }

        String mark = s.split("\\->")[0];
        String dataB64 = s.split("\\->")[1];
        DataPack dataPack = new DataPack(mark.split("\\-")[0], mark.split("\\-")[1], mark.split("\\-")[2]);

        byte[] data = Base64.getDecoder().decode(dataB64);
        ByteBuf buf = Unpooled.buffer(data.length);
        buf.writeBytes(data);

        dataPack.setBuf(buf);
        return dataPack;
    }





    public void setBuf(ByteBuf buf){
        // free previous buf
        freeBuf();

        _buf = buf;
        _buf.retain();
    }

    /**
     * 释放数据
     */
    public void freeBuf(){
        if(_buf != null) {
            _buf.release();
            _buf = null;
        }
    }




    @Override
    public String toString() {
        return "DataPack{" +
                "_group='" + _group + '\'' +
                ", _name='" + _name + '\'' +
                ", _version='" + _version + '\'' +
                ", _buf=" + DataTool.bytes2hex(getDataBytes()) +
                '}';
    }
}
