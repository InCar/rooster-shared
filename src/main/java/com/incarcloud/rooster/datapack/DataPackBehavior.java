package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 行为位置数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-08-10T14:51.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackBehavior extends DataPackObject {

    /**
     * 行为类型：
     * 0x01-超速记录
     * 0x02-急加速记录
     * 0x03-急减速记录
     * 0x04-急转弯记录
     * 0xF0-拔下OBD记录
     * 其它值-无效
     */
    private Integer behaviorId;
    /**
     * 行为名称
     */
    private String behaviorName;
    /**
     * 行为描述
     */
    private String behaviorDesc;
    /**
     * 位置数据
     */
    private DataPackPosition position;

    public DataPackBehavior(DataPackObject object) {
        super(object);
    }
}
