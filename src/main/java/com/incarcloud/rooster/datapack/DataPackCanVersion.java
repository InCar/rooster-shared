package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanVersion
 * @Description: can 模块版本版本信息
 * @date 2017-09-11 14:19
 */
public class DataPackCanVersion extends DataPackObject {


    //模块名称
    private String canModelName;
    //ID
    private Integer canId;
    //版本信息
    private String version;

    public String getCanModelName() {
        return canModelName;
    }

    public void setCanModelName(String canModelName) {
        this.canModelName = canModelName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getCanId() {
        return canId;
    }

    public void setCanId(Integer canId) {
        this.canId = canId;
    }

    public DataPackCanVersion(DataPackObject dataPack) {
        super(dataPack);
    }

    @Override
    public String toString() {
        return "DataPackCanVersion{" +
                "canModelName='" + canModelName + '\'' +
                ", canId=" + canId +
                ", version='" + version + '\'' +
                ", id='" + id + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", packId=" + packId +
                ", protocolName='" + protocolName + '\'' +
                ", protocolVersion='" + protocolVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", tripId=" + tripId +
                ", vid='" + vid + '\'' +
                ", vin='" + vin + '\'' +
                ", license='" + license + '\'' +
                ", subPackTotal=" + subPackTotal +
                ", subPackIndex=" + subPackIndex +
                ", encryptName='" + encryptName + '\'' +
                ", detectionTime=" + detectionTime +
                ", _group='" + _group + '\'' +
                ", _name='" + _name + '\'' +
                ", _version='" + _version + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
