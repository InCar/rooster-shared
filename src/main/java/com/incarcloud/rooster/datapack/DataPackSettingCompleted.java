package com.incarcloud.rooster.datapack;

/**
 * 参数设置完成
 *
 * @author Kong, created on 2018-06-15T13:53.
 * @since 1.2.0-SNAPSHOT
 */
public class DataPackSettingCompleted extends DataPackObject{

    private String version ;

    public DataPackSettingCompleted(DataPackObject object){
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
