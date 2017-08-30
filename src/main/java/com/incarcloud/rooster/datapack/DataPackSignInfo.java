package com.incarcloud.rooster.datapack;/**
 * Created by fanbeibei on 2017/8/30.
 */

/**
 * TODO
 * @author Fan Beibei
 * @Description: 标识牌识别
 * @date 2017/8/30 15:14
 */
public class DataPackSignInfo extends  DataPackObject{

    private int signType;
    private int supplementarySignType;
    private int signPosX;
    private int signPosY;
    private int signPosZ;

    private int filterType;


    public DataPackSignInfo(DataPackObject object) {
        super(object);
    }

    public void setSignType(int signType) {
        this.signType = signType;
    }

    public void setSupplementarySignType(int supplementarySignType) {
        this.supplementarySignType = supplementarySignType;
    }

    public void setSignPosX(int signPosX) {
        this.signPosX = signPosX;
    }

    public void setSignPosY(int signPosY) {
        this.signPosY = signPosY;
    }

    public void setSignPosZ(int signPosZ) {
        this.signPosZ = signPosZ;
    }

    public void setFilterType(int filterType) {
        this.filterType = filterType;
    }

    public int getSignType() {
        return signType;
    }

    public int getSupplementarySignType() {
        return supplementarySignType;
    }

    public int getSignPosX() {
        return signPosX;
    }

    public int getSignPosY() {
        return signPosY;
    }

    public int getSignPosZ() {
        return signPosZ;
    }

    public int getFilterType() {
        return filterType;
    }
}
