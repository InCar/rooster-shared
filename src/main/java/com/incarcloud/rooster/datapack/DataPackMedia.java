package com.incarcloud.rooster.datapack;

/**
 * 多媒体数据
 *
 * @author Aaric, created on 2017-09-01T14:11.
 * @since 2.0
 */
public class DataPackMedia extends DataPackObject {

    /**
     * 多媒体数据 ID
     */
    private Long mId;
    /**
     * 多媒体类型：0：图像；1：音频；2：视频；
     */
    private Integer type;
    /**
     * 多媒体格式编码：0：JPEG；1：TIF；2：MP3；3：WAV；4：WMV；
     */
    private Integer format;
    /**
     * 事件项编码: 0：平台下发指令；1：定时动作；2：抢劫报警触发；3：碰撞侧翻报警触发；4：门开拍照；
     *           5：门关拍照；6：车门由开变关，时速从＜20公里到超过20公里；7：定距拍照；
     */
    private Integer eventCode;
    /**
     * 通道 ID
     */
    private Integer channelId;
    /**
     * 多媒体分包数据，多个分包的data合并媒体文件<br>
     * 数据存储为Base64加密后的字符串
     */
    private String data;
    /**
     * 位置数据
     */
    private DataPackPosition position;

    public DataPackMedia(DataPackObject object) {
        super(object);
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public Integer getEventCode() {
        return eventCode;
    }

    public void setEventCode(Integer eventCode) {
        this.eventCode = eventCode;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DataPackPosition getPosition() {
        return position;
    }

    public void setPosition(DataPackPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "DataPackMedia{" +
                "mId=" + mId +
                ", type=" + type +
                ", format=" + format +
                ", eventCode=" + eventCode +
                ", channelId=" + channelId +
                ", data='" + data + '\'' +
                ", position=" + position +
                '}';
    }
}
