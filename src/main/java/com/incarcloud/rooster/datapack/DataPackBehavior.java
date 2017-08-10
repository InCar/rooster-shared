package com.incarcloud.rooster.datapack;

/**
 * 行为位置数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-08-10T14:51.
 * @since 2.0
 */
public class DataPackBehavior extends DataPackObject {

    /**
     * 行为类型：
     * 0x01  超速记录
     * 0x02  急加速记录
     * 0x03  急减速记录
     * 0x04  急转弯记录
     * 其它值  无效
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

    public Integer getBehaviorId() {
        return behaviorId;
    }

    public void setBehaviorId(Integer behaviorId) {
        this.behaviorId = behaviorId;
    }

    public String getBehaviorName() {
        return behaviorName;
    }

    public void setBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
    }

    public String getBehaviorDesc() {
        return behaviorDesc;
    }

    public void setBehaviorDesc(String behaviorDesc) {
        this.behaviorDesc = behaviorDesc;
    }

    public DataPackPosition getPosition() {
        return position;
    }

    public void setPosition(DataPackPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "DataPackBehavior{" +
                "behaviorId=" + behaviorId +
                ", behaviorName='" + behaviorName + '\'' +
                ", behaviorDesc='" + behaviorDesc + '\'' +
                ", position=" + position +
                '}';
    }
}
