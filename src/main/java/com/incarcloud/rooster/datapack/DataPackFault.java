package com.incarcloud.rooster.datapack;


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
 * @since 2.0
 */
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

    public List<Fault> getFaultList() {
        return faultList;
    }

    public void setFaultList(List<Fault> faultList) {
        this.faultList = faultList;
    }

    public DataPackPosition getPosition() {
        return position;
    }

    public void setPosition(DataPackPosition position) {
        this.position = position;
    }

    /**
     * 故障参数信息
     */
    public static final Map<Integer,Fault> alarmMap = new HashMap<Integer,Fault>(){
        {
            //电子制动力分配系统故障
            put(0xF001,new DataPackFault.Fault(0,"COM_EBD","EBD故障")) ;
            //防抱死制动系统故障
            put(0xF002,new DataPackFault.Fault(0,"COM_ABS","ABS故障")) ;
            //电子稳定系统故障
            put(0xF003,new DataPackFault.Fault(0,"COM_ESP","ESP故障")) ;
            //轮速传感器故障
            put(0xF004,new DataPackFault.Fault(0,"COM_ACC","ACC故障")) ;
            //电子节气门控制故障
            put(0xF005,new DataPackFault.Fault(0,"COM_FCM","FCM故障")) ;
            //制动力辅助装置故障
            put(0xF006,new DataPackFault.Fault(0,"COM_AHB","AHB故障")) ;
            //胎压监测系统故障
            put(0xF007,new DataPackFault.Fault(0,"COM_EPS","EPS故障")) ;
            //驾驶员座椅滑轨传感器故障
            put(0xF008,new DataPackFault.Fault(0,"COM_SRS","SRS故障")) ;
            //乘客安全带故障
            put(0xF009,new DataPackFault.Fault(0,"COM_GASOLINE","GASOLINE故障")) ;
            //驾驶员安全带故障
            put(0xF00A,new DataPackFault.Fault(0,"COM_CVT","CVT故障")) ;
            //电池温度传感器故障
            put(0xF00B,new DataPackFault.Fault(0,"COM_TPMS","TPMS故障")) ;
        }
    };

    @Override
    public String toString() {
        return "DataPackFault{" +
                "faultList=" + faultList +
                ", position=" + position +
                '}';
    }

    /**
     * 单个故障对象
     */
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

        public Fault(Integer faultValue, String faultCode, String faultName){
            this.faultValue = String.valueOf(faultValue) ;
            this.faultCode = faultCode ;
            this.faultName = faultName ;
        }

        public String getFaultName() {
            return faultName;
        }

        public void setFaultName(String faultName) {
            this.faultName = faultName;
        }

        public String getFaultCode() {
            return faultCode;
        }

        public void setFaultCode(String faultCode) {
            this.faultCode = faultCode;
        }

        public String getFaultValue() {
            return faultValue;
        }

        public void setFaultValue(String faultValue) {
            this.faultValue = faultValue;
        }

        public String getFaultDesc() {
            return faultDesc;
        }

        public void setFaultDesc(String faultDesc) {
            this.faultDesc = faultDesc;
        }

        @Override
        public String toString() {
            return "Fault{" +
                    "faultName='" + faultName + '\'' +
                    ", faultCode='" + faultCode + '\'' +
                    ", faultValue='" + faultValue + '\'' +
                    ", faultDesc='" + faultDesc + '\'' +
                    ", customInfo='" + customInfo + '\'' +
                    '}';
        }

        /**
		 * 获取customInfo  
		 * @return customInfo customInfo  
		 */
		public String getCustomInfo() {
			return customInfo;
		}
		

		/**  
		 * 设置customInfo  
		 * @param customInfo customInfo  
		 */
		public void setCustomInfo(String customInfo) {
			this.customInfo = customInfo;
		}
		
    }
}
