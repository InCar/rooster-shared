package com.incarcloud.rooster.datapack;

import java.util.List;

/**
 * 动力蓄电池包温度数据
 *
 * @author Aaric, created on 2017-06-27T14:04.
 * @since 2.0
 */
public class DataPackTemperature extends DataPackObject {

    /**
     * 动力蓄电池总成个数
     * N个动力蓄电池，有效值范围：1～250，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer batterySysNumber;
    /**
     * 电池子系统号
     * 有效值范围：1～253
     */
    private Integer sysIndex;
    /**
     * 电池温度探针个数
     * N 个温度探针，有效值范围：1～65531，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private Integer number;
    /**
     * 电池总各温度探针检测到的温度值
     * 有效值范围：0～250 （数值偏移量 40℃，表示-40℃～+210℃），最小计量单元：1℃，“0xFE”表示异常，“0xFF”表示无效。
     */
    private List<Integer> temperatureList;

    public DataPackTemperature(DataPackObject dataPack) {
        super(dataPack);
    }

    public Integer getBatterySysNumber() {
        return batterySysNumber;
    }

    public void setBatterySysNumber(Integer batterySysNumber) {
        this.batterySysNumber = batterySysNumber;
    }

    public Integer getSysIndex() {
        return sysIndex;
    }

    public void setSysIndex(Integer sysIndex) {
        this.sysIndex = sysIndex;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Integer> getTemperatureList() {
        return temperatureList;
    }

    public void setTemperatureList(List<Integer> temperatureList) {
        this.temperatureList = temperatureList;
    }

    @Override
    public String toString() {
        return "DataPackTemperature{" +
                "batterySysNumber=" + batterySysNumber +
                ", sysIndex=" + sysIndex +
                ", number=" + number +
                ", temperatureList=" + temperatureList +
                '}';
    }
}
