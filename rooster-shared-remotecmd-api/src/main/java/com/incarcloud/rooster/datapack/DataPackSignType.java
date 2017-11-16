package com.incarcloud.rooster.datapack;/**
 * Created by fanbeibei on 2017/8/30.
 */

/**
 * @author Fan Beibei
 * @Description: 标识牌类型
 * @date 2017/8/30 15:15
 */
public class DataPackSignType extends DataPackObject {

    /**
     * signTypeD1
     */
    private Integer signTypeD1;
    /**
     * supplementarySignTypeD1
     */
    private Integer supplementarySignTypeD1;
    /**
     * signTypeD2
     */
    private Integer signTypeD2;
    /**
     * supplementarySignTypeD2
     */
    private Integer supplementarySignTypeD2;
    /**
     * signTypeD3
     */
    private Integer signTypeD3;
    /**
     * supplementarySignTypeD3
     */
    private Integer supplementarySignTypeD3;
    /**
     * signTypeD4
     */
    private Integer signTypeD4;
    /**
     * supplementarySignTypeD4
     */
    private Integer supplementarySignTypeD4;

    public DataPackSignType(DataPackObject object) {
        super(object);
    }

    public Integer getSignTypeD1() {
        return signTypeD1;
    }

    public void setSignTypeD1(Integer signTypeD1) {
        this.signTypeD1 = signTypeD1;
    }

    public Integer getSupplementarySignTypeD1() {
        return supplementarySignTypeD1;
    }

    public void setSupplementarySignTypeD1(Integer supplementarySignTypeD1) {
        this.supplementarySignTypeD1 = supplementarySignTypeD1;
    }

    public Integer getSignTypeD2() {
        return signTypeD2;
    }

    public void setSignTypeD2(Integer signTypeD2) {
        this.signTypeD2 = signTypeD2;
    }

    public Integer getSupplementarySignTypeD2() {
        return supplementarySignTypeD2;
    }

    public void setSupplementarySignTypeD2(Integer supplementarySignTypeD2) {
        this.supplementarySignTypeD2 = supplementarySignTypeD2;
    }

    public Integer getSignTypeD3() {
        return signTypeD3;
    }

    public void setSignTypeD3(Integer signTypeD3) {
        this.signTypeD3 = signTypeD3;
    }

    public Integer getSupplementarySignTypeD3() {
        return supplementarySignTypeD3;
    }

    public void setSupplementarySignTypeD3(Integer supplementarySignTypeD3) {
        this.supplementarySignTypeD3 = supplementarySignTypeD3;
    }

    public Integer getSignTypeD4() {
        return signTypeD4;
    }

    public void setSignTypeD4(Integer signTypeD4) {
        this.signTypeD4 = signTypeD4;
    }

    public Integer getSupplementarySignTypeD4() {
        return supplementarySignTypeD4;
    }

    public void setSupplementarySignTypeD4(Integer supplementarySignTypeD4) {
        this.supplementarySignTypeD4 = supplementarySignTypeD4;
    }

    @Override
    public String toString() {
        return "DataPackSignType{" +
                "signTypeD1=" + signTypeD1 +
                ", supplementarySignTypeD1=" + supplementarySignTypeD1 +
                ", signTypeD2=" + signTypeD2 +
                ", supplementarySignTypeD2=" + supplementarySignTypeD2 +
                ", signTypeD3=" + signTypeD3 +
                ", supplementarySignTypeD3=" + supplementarySignTypeD3 +
                ", signTypeD4=" + signTypeD4 +
                ", supplementarySignTypeD4=" + supplementarySignTypeD4 +
                '}';
    }
}
