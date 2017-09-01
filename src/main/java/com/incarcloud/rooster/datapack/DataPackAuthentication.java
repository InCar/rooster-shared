package com.incarcloud.rooster.datapack;

/**
 * 终端鉴权数据
 *
 * @author Aaric, created on 2017-09-01T10:51.
 * @since 2.0
 */
public class DataPackAuthentication extends DataPackObject {

    /**
     * 鉴权码
     */
    private String authCode;

    public DataPackAuthentication(DataPackObject object) {
        super(object);
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @Override
    public String toString() {
        return "DataPackAuthentication{" +
                "authCode='" + authCode + '\'' +
                '}';
    }
}
