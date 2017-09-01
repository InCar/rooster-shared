package com.incarcloud.rooster.datapack;

import java.util.Arrays;

/**
 * RSA数据
 *
 * @author Aaric, created on 2017-09-01T14:40.
 * @since 2.0
 */
public class DataPackRsa extends DataPackObject {

    /**
     * 平台 RSA 公钥{e,n}中的 e
     */
    private Long e;
    /**
     * RSA 公钥{e,n}中的 n
     */
    private byte[] n;

    public DataPackRsa(DataPackObject object) {
        super(object);
    }

    public Long getE() {
        return e;
    }

    public void setE(Long e) {
        this.e = e;
    }

    public byte[] getN() {
        return n;
    }

    public void setN(byte[] n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "DataPackRsa{" +
                "e=" + e +
                ", n=" + Arrays.toString(n) +
                '}';
    }
}
