package com.incarcloud.rooster.datapack;

/**
 * 设备回复下行命令执行结果
 *
 * @author sunjun, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataPackResult extends DataPackObject {

    /**
     * 经度
     */
    private Integer resultCode;

    public DataPackResult(DataPackObject object) {
        super(object);
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "DataPackResult{" +
                "resultCode=" + resultCode +
                ", id='" + id + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", packId=" + packId +
                ", protocolName='" + protocolName + '\'' +
                ", protocolVersion='" + protocolVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", tripId=" + tripId +
                ", vid='" + vid + '\'' +
                ", vin='" + vin + '\'' +
                ", detectionDate=" + detectionDate +
                ", _group='" + _group + '\'' +
                ", _name='" + _name + '\'' +
                ", _version='" + _version + '\'' +
                '}';
    }
}
