package com.incarcloud.rooster.enums;


/**
 * @Author acemma
 * @Date 2021/6/8 14:13
 * @Description
 */
public enum FaultEnum {

    COM_FAULT_EBD(0xF001, "COM_FAULT_EBD", "电子制动力分配系统"),
    COM_FAULT_ABS(0xF002, "COM_FAULT_ABS", "防抱死制动系统"),
    COM_FAULT_ESP(0xF003, "COM_FAULT_ESP", "车身电子稳定系统"),
    COM_FAULT_ACC(0xF004, "COM_FAULT_ACC", "自适应巡航控制系统"),
    COM_FAULT_FCM(0xF005, "COM_FAULT_FCM", "防撞预警系统"),
    COM_FAULT_AHB(0xF006, "COM_FAULT_AHB", "远光自动控制系统"),
    COM_FAULT_EPS(0xF007, "COM_FAULT_EPS", "电子助力转向系统"),
    COM_FAULT_SRS(0xF008, "COM_FAULT_SRS", "汽车安全气囊系统"),
    COM_FAULT_GASOLINE(0xF009, "COM_FAULT_GASOLINE", "发动机系统"),
    COM_FAULT_CVT(0xF00A, "COM_FAULT_CVT", "变速系统"),
    COM_FAULT_TPMS(0xF00B, "COM_FAULT_TPMS", "轮胎压力监测系统"),
    COM_FAULT_WSS(0xF00C, "COM_FAULT_WSS", "重量感应系统"),
    COM_FAULT_AFS(0xF00D, "COM_FAULT_AFS", "弯道辅助照明系统"),
    COM_FAULT_BAS(0xF00E, "COM_FAULT_BAS", "制动辅助系统"),
    COM_FAULT_ETC(0xF00F, "COM_FAULT_ETC", "车辆出入管理系统"),
    COM_FAULT_ARS(0xF010, "COM_FAULT_ARS", "主动防侧倾系统");


    private Integer id;

    private String faultCode;

    private String faultName;

    FaultEnum(Integer id, String faultCode, String faultName) {
        this.id = id;
        this.faultCode = faultCode;
        this.faultName = faultName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaultCode() {
        return faultCode;
    }

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    public String getFaultName() {
        return faultName;
    }

    public void setFaultName(String faultName) {
        this.faultName = faultName;
    }

    public static FaultEnum getById(Integer id) {
        for (FaultEnum faultEnum : FaultEnum.values()) {
            if (faultEnum.id.equals(id)) {
                return faultEnum;
            }
        }
        return null;
    }

    public static FaultEnum getByCode(String code) {
        for (FaultEnum faultEnum : FaultEnum.values()) {
            if (faultEnum.faultCode.equals(code)) {
                return faultEnum;
            }
        }
        return null;
    }

}
