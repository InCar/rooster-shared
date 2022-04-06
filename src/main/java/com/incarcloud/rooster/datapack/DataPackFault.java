package com.incarcloud.rooster.datapack;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 故障数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Kong, created on 2018-07-02T14:05.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackFault extends DataPackObject {

    /**
     * 故障数据
     */
    private List<Fault> faultList;
    /**
     * 位置数据
     */
    private DataPackPosition position;

    public DataPackFault(DataPackObject object) {
        super(object);
    }

    /**
     * 故障参数信息
     */
    public static Map<Integer, Fault> alarmMap = new HashMap<Integer, Fault>() {
        {
            //电子制动力分配系统故障-EBD故障
            put(0xF001, new Fault(0, "COM_FAULT_EBD", "电子制动力分配系统"));
            //防抱死制动系统故障-ABS故障
            put(0xF002, new Fault(0, "COM_FAULT_ABS", "防抱死制动系统"));
            //电子稳定系统故障-ESP故障
            put(0xF003, new Fault(0, "COM_FAULT_ESP", "车身电子稳定系统"));
            //自适应巡航系统故障-ACC故障
            put(0xF004, new Fault(0, "COM_FAULT_ACC", "自适应巡航控制系统"));
            //前方防撞预警系统故障-FCM故障
            put(0xF005, new Fault(0, "COM_FAULT_FCM", "防撞预警系统"));
            //自动远光系统故障-AHB故障
            put(0xF006, new Fault(0, "COM_FAULT_AHB", "远光自动控制系统"));
            //电动助力转向系统故障-EPS故障
            put(0xF007, new Fault(0, "COM_FAULT_EPS", "电子助力转向系统"));
            //安全气囊故障-SRS故障
            put(0xF008, new Fault(0, "COM_FAULT_SRS", "汽车安全气囊系统"));
            //发动机故障-GASOLINE故障
            put(0xF009, new Fault(0, "COM_FAULT_GASOLINE", "发动机系统"));
            //变速箱故障-CVT故障
            put(0xF00A, new Fault(0, "COM_FAULT_CVT", "变速系统"));
            //胎压监测系统故障-TPMS故障
            put(0xF00B, new Fault(0, "COM_FAULT_TPMS", "轮胎压力监测系统"));
            //重量感应系统故障-WSS故障
            put(0xF00C, new Fault(0, "COM_FAULT_WSS", "重量感应系统"));
            //弯道辅助照明系统故障-AFS故障
            put(0xF00D, new Fault(0, "COM_FAULT_AFS", "弯道辅助照明系统"));
            //制动辅助系统故障-BAS故障
            put(0xF00E, new Fault(0, "COM_FAULT_BAS", "制动辅助系统"));
            //车辆出入管理系统故障-ETC故障
            put(0xF00F, new Fault(0, "COM_FAULT_ETC", "车辆出入管理系统"));
            //主动防侧倾系统故障-ARS故障
            put(0xF010, new Fault(0, "COM_FAULT_ARS", "主动防侧倾系统"));
        }
    };

    /**
     * 单个故障对象
     */
    @Getter
    @Setter
    @Accessors(chain = true)
    @ToString
    public static class Fault {

        /**
         * 故障名称
         */
        private String faultName;
        /**
         * 故障代码
         */
        private String faultCode;
        /**
         * 故障属性
         */
        private String faultValue;
        /**
         * 故障描述
         */
        private String faultDesc;
        /**
         * 用户自定义信息
         */
        private String customInfo;

        public Fault() {
        }

        public Fault(String faultName) {
            this.faultName = faultName;
        }

        public Fault(String faultName, Integer faultCode, String faultDesc) {
            this.faultName = faultName;
            this.faultCode = String.valueOf(faultCode);
            this.faultDesc = faultDesc;
        }

        public Fault(Integer faultValue, String faultCode, String faultName) {
            this.faultValue = String.valueOf(faultValue);
            this.faultCode = faultCode;
            this.faultName = faultName;
        }
    }
}
