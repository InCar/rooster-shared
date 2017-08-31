package com.incarcloud.rooster.datapack;/**
 * Created by fanbeibei on 2017/8/30.
 */

/**
 * @author Fan Beibei
 * @Description: 标识牌类型
 * @date 2017/8/30 15:15
 */
public class DataPackSignType extends  DataPackObject{

    private int signTypeD1;
    private int supplementarySignTypeD1;
    private int signTypeD2;
    private int supplementarySignTypeD2;
    private int signTypeD3;
    private int supplementarySignTypeD3;
    private int signTypeD4;
    private int supplementarySignTypeD4;

    public DataPackSignType(DataPackObject object) {
        super(object);
    }

    public void setSignTypeD1(int signTypeD1) {
        this.signTypeD1 = signTypeD1;
    }

    public void setSupplementarySignTypeD1(int supplementarySignTypeD1) {
        this.supplementarySignTypeD1 = supplementarySignTypeD1;
    }

    public void setSignTypeD2(int signTypeD2) {
        this.signTypeD2 = signTypeD2;
    }

    public void setSupplementarySignTypeD2(int supplementarySignTypeD2) {
        this.supplementarySignTypeD2 = supplementarySignTypeD2;
    }

    public void setSignTypeD3(int signTypeD3) {
        this.signTypeD3 = signTypeD3;
    }

    public void setSupplementarySignTypeD3(int supplementarySignTypeD3) {
        this.supplementarySignTypeD3 = supplementarySignTypeD3;
    }

    public void setSignTypeD4(int signTypeD4) {
        this.signTypeD4 = signTypeD4;
    }

    public void setSupplementarySignTypeD4(int supplementarySignTypeD4) {
        this.supplementarySignTypeD4 = supplementarySignTypeD4;
    }

    public int getSignTypeD1() {
        return signTypeD1;
    }

    public int getSupplementarySignTypeD1() {
        return supplementarySignTypeD1;
    }

    public int getSignTypeD2() {
        return signTypeD2;
    }

    public int getSupplementarySignTypeD2() {
        return supplementarySignTypeD2;
    }

    public int getSignTypeD3() {
        return signTypeD3;
    }

    public int getSupplementarySignTypeD3() {
        return supplementarySignTypeD3;
    }

    public int getSignTypeD4() {
        return signTypeD4;
    }

    public int getSupplementarySignTypeD4() {
        return supplementarySignTypeD4;
    }
}
