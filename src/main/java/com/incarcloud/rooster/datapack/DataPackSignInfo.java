package com.incarcloud.rooster.datapack;/**
 * Created by fanbeibei on 2017/8/30.
 */

/**
 * @author Fan Beibei
 * @Description: 标识牌识别
 * @date 2017/8/30 15:14
 */
public class DataPackSignInfo extends DataPackObject {

    /**
     * signType
     */
    private Integer signType;
    /**
     * supplementarySignType
     */
    private Integer supplementarySignType;
    /**
     * signPosX
     */
    private Integer signPosX;
    /**
     * signPosY
     */
    private Integer signPosY;
    /**
     * signPosZ
     */
    private Integer signPosZ;
    /**
     * filterType
     */
    private Integer filterType;

    public DataPackSignInfo(DataPackObject object) {
        super(object);
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    public Integer getSupplementarySignType() {
        return supplementarySignType;
    }

    public void setSupplementarySignType(Integer supplementarySignType) {
        this.supplementarySignType = supplementarySignType;
    }

    public Integer getSignPosX() {
        return signPosX;
    }

    public void setSignPosX(Integer signPosX) {
        this.signPosX = signPosX;
    }

    public Integer getSignPosY() {
        return signPosY;
    }

    public void setSignPosY(Integer signPosY) {
        this.signPosY = signPosY;
    }

    public Integer getSignPosZ() {
        return signPosZ;
    }

    public void setSignPosZ(Integer signPosZ) {
        this.signPosZ = signPosZ;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    @Override
    public String toString() {
        return "DataPackSignInfo{" +
                "signType=" + signType +
                ", supplementarySignType=" + supplementarySignType +
                ", signPosX=" + signPosX +
                ", signPosY=" + signPosY +
                ", signPosZ=" + signPosZ +
                ", filterType=" + filterType +
                '}';
    }
}
