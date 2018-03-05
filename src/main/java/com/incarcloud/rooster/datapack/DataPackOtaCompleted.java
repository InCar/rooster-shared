package com.incarcloud.rooster.datapack;

/**
 * OTA升级完成
 * Created by Kong on 2018/3/5.
 */
public class DataPackOtaCompleted extends DataPackObject {

    private String version ;

    public DataPackOtaCompleted(DataPackObject object){
        super(object);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "DataPackOtaCompleted{" +
                "version='" + version + '\'' +
                '}';
    }
}
