package com.incarcloud.rooster.datapack;

/**
 * 发动机数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataPackEngine extends DataPackObject {

    /**
     * 发动机状态：0x01-启动，0x02-关闭
     */
    private Integer engineStatus;
    /**
     * 曲轴转速（最小计量单位1r/min）
     */
    private Integer rotateSpeed;
    /**
     * 燃料消耗率（最小计量单位0.01L/100km）
     */
    private Integer consumptionRate;

    public DataPackEngine(DataPackObject object) {
        super(object);
    }

    public Integer getEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(Integer engineStatus) {
        this.engineStatus = engineStatus;
    }

    public Integer getRotateSpeed() {
        return rotateSpeed;
    }

    public void setRotateSpeed(Integer rotateSpeed) {
        this.rotateSpeed = rotateSpeed;
    }

    public Integer getConsumptionRate() {
        return consumptionRate;
    }

    public void setConsumptionRate(Integer consumptionRate) {
        this.consumptionRate = consumptionRate;
    }
}
