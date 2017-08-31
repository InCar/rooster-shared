package com.incarcloud.rooster.datapack;/**
 * Created by fanbeibei on 2017/8/30.
 */

/**
 * @author Fan Beibei
 * @Description: 车信号
 * @date 2017/8/30 15:13
 */
public class DataPackCarSignals extends DataPackObject {

    /**
     * 远光灯
     */
    private int hightBeam;

    /**
     * 近光灯
     */
    private int lowBeam;


    /**
     * 雨刮
     */
    private int wipers;

    /**
     * 右转向灯
     */
    private int  rightSignal;
    /**
     * 左转向灯
     */
    private int leftSignal;

    /**
     * 刹车灯
     */
    private int  brakeSignal;
    /**
     * 车速
     */
    private int speend;


    private int wipersAvailable;

    private int hightBeamAvailable;


    private int lowBeamAvailable;

    private int speendAvailable;




    public DataPackCarSignals(DataPackObject object) {
        super(object);
    }

    public void setHightBeam(int hightBeam) {
        this.hightBeam = hightBeam;
    }

    public void setLowBeam(int lowBeam) {
        this.lowBeam = lowBeam;
    }

    public void setWipers(int wipers) {
        this.wipers = wipers;
    }

    public void setRightSignal(int rightSignal) {
        this.rightSignal = rightSignal;
    }

    public void setLeftSignal(int leftSignal) {
        this.leftSignal = leftSignal;
    }

    public void setBrakeSignal(int brakeSignal) {
        this.brakeSignal = brakeSignal;
    }

    public void setSpeend(int speend) {
        this.speend = speend;
    }

    public void setWipersAvailable(int wipersAvailable) {
        this.wipersAvailable = wipersAvailable;
    }

    public void setHightBeamAvailable(int hightBeamAvailable) {
        this.hightBeamAvailable = hightBeamAvailable;
    }

    public void setLowBeamAvailable(int lowBeamAvailable) {
        this.lowBeamAvailable = lowBeamAvailable;
    }

    public void setSpeendAvailable(int speendAvailable) {
        this.speendAvailable = speendAvailable;
    }

    public int getHightBeam() {
        return hightBeam;
    }

    public int getLowBeam() {
        return lowBeam;
    }

    public int getWipers() {
        return wipers;
    }

    public int getRightSignal() {
        return rightSignal;
    }

    public int getLeftSignal() {
        return leftSignal;
    }

    public int getBrakeSignal() {
        return brakeSignal;
    }

    public int getSpeend() {
        return speend;
    }

    public int getWipersAvailable() {
        return wipersAvailable;
    }

    public int getHightBeamAvailable() {
        return hightBeamAvailable;
    }

    public int getLowBeamAvailable() {
        return lowBeamAvailable;
    }

    public int getSpeendAvailable() {
        return speendAvailable;
    }
}
