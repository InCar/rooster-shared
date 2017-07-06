package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;

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

    public String getMark(){
        return String.format("%s-%s-%s", _group, _name, _version);
    }

    public String getDataB64(){
        if(_buf == null) return null;
        byte[] dst = new byte[_buf.readableBytes()];
        _buf.getBytes(0, dst);
        return Base64.getEncoder().encodeToString(dst);
    }

    public byte[] getBytes(){
        if(_buf == null) return null;
        byte[] dst = new byte[_buf.readableBytes()];
        _buf.getBytes(0, dst);
        return dst;
    }

    public void setBuf(ByteBuf buf){
        // free previous buf
        freeBuf();

        _buf = buf;
        _buf.retain();
    }

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
                ", _buf=" + _buf +
                '}';
    }
}
