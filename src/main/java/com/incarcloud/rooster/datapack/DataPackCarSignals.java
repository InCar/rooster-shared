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
    private Integer hightBeam;
    /**
     * 近光灯
     */
    private Integer lowBeam;
    /**
     * 雨刮
     */
    private Integer wipers;
    /**
     * 右转向灯
     */
    private Integer rightSignal;
    /**
     * 左转向灯
     */
    private Integer leftSignal;
    /**
     * 刹车灯
     */
    private Integer brakeSignal;
    /**
     * 车速
     */
    private Integer speend;
    /**
     * wipersAvailable
     */
    private Integer wipersAvailable;
    /**
     * hightBeamAvailable
     */
    private Integer hightBeamAvailable;
    /**
     * lowBeamAvailable
     */
    private Integer lowBeamAvailable;
    /**
     * speendAvailable
     */
    private Integer speendAvailable;

    public DataPackCarSignals(DataPackObject object) {
        super(object);
    }

    public Integer getHightBeam() {
        return hightBeam;
    }

    public void setHightBeam(Integer hightBeam) {
        this.hightBeam = hightBeam;
    }

    public Integer getLowBeam() {
        return lowBeam;
    }

    public void setLowBeam(Integer lowBeam) {
        this.lowBeam = lowBeam;
    }

    public Integer getWipers() {
        return wipers;
    }

    public void setWipers(Integer wipers) {
        this.wipers = wipers;
    }

    public Integer getRightSignal() {
        return rightSignal;
    }

    public void setRightSignal(Integer rightSignal) {
        this.rightSignal = rightSignal;
    }

    public Integer getLeftSignal() {
        return leftSignal;
    }

    public void setLeftSignal(Integer leftSignal) {
        this.leftSignal = leftSignal;
    }

    public Integer getBrakeSignal() {
        return brakeSignal;
    }

    public void setBrakeSignal(Integer brakeSignal) {
        this.brakeSignal = brakeSignal;
    }

    public Integer getSpeend() {
        return speend;
    }

    public void setSpeend(Integer speend) {
        this.speend = speend;
    }

    public Integer getWipersAvailable() {
        return wipersAvailable;
    }

    public void setWipersAvailable(Integer wipersAvailable) {
        this.wipersAvailable = wipersAvailable;
    }

    public Integer getHightBeamAvailable() {
        return hightBeamAvailable;
    }

    public void setHightBeamAvailable(Integer hightBeamAvailable) {
        this.hightBeamAvailable = hightBeamAvailable;
    }

    public Integer getLowBeamAvailable() {
        return lowBeamAvailable;
    }

    public void setLowBeamAvailable(Integer lowBeamAvailable) {
        this.lowBeamAvailable = lowBeamAvailable;
    }

    public Integer getSpeendAvailable() {
        return speendAvailable;
    }

    public void setSpeendAvailable(Integer speendAvailable) {
        this.speendAvailable = speendAvailable;
    }

    @Override
    public String toString() {
        return "DataPackCarSignals{" +
                "hightBeam=" + hightBeam +
                ", lowBeam=" + lowBeam +
                ", wipers=" + wipers +
                ", rightSignal=" + rightSignal +
                ", leftSignal=" + leftSignal +
                ", brakeSignal=" + brakeSignal +
                ", speend=" + speend +
                ", wipersAvailable=" + wipersAvailable +
                ", hightBeamAvailable=" + hightBeamAvailable +
                ", lowBeamAvailable=" + lowBeamAvailable +
                ", speendAvailable=" + speendAvailable +
                '}';
    }
}
