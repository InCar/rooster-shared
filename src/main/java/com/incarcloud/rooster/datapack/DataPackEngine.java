package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 发动机数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:05.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
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
}
