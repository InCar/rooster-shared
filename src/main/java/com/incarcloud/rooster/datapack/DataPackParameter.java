package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 参数查询结果
 *
 * @author Kong, created on 2018-08-27T15:13.
 * @version 1.2.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackParameter extends DataPackObject {

    /**
     * 参数版本
     */
    private String paramVersion;
    /**
     * 本地数据存储周期, 单位：天
     */
    private Integer localDataStorageSeconds;

    /**
     * TSP平台地址
     */
    private String remoteSeverHost;

    /**
     * TSP平台通讯端口
     */
    private Integer remoteServerPort;

    /**
     * TSP平台应答超时时间,单位:秒
     */
    private Integer platformOverTime;

    /**
     * 终端应答超时时间,单位:秒
     */
    private Integer terminalResponseTime;

    /**
     * 终端登入失败再次登录时间间隔,单位:秒
     */
    private Integer logintRetrySeconds;

    /**
     * APN
     */
    private String apn;

    /**
     * PublicKey更新周期,单位:天
     */
    private Integer publickeyUpdateSeconds;

    /**
     * 正常模式整车数据上报周期,单位:秒
     */
    private Integer canReportSeconds;

    /**
     * 正常模式心跳数据上报周期,单位:秒
     */
    private Integer headbeatSeconds;

    /**
     * 延时模式整车数据上报周期,单位:秒
     */
    private Integer dalayCanReportSeconds;

    /**
     * 延时模式心跳数据上报周期,单位:秒
     */
    private Integer dalayHeadbeatSeconds;

    /**
     * 延时模式车辆数据上报持续时长,单位:分钟
     */
    private Integer dalayTimeSeconds;

    /**
     * 报警模式整车数据上报周期,单位:秒
     */
    private Integer alarmCanReportSeconds;

    /**
     * 报警模式整车数据上报持续时长,单位: 秒
     */
    private Integer alarmTimeSeconds;

    /**
     * 短信白名单
     */
    private String smsWhiteList;

    /**
     * 公网APN
     */
    private String publicApn;

    /**
     *  E-CALL中心号码可通过TSP下发参数修改
     */
    private String ecallCenterNumber;
    /**
     *  B-CALL中心号码可通过TSP下发参数修改
     */
    private String bcallCenterNumber;
    /**
     *  I-CALL中心号码可通过TSP下发参数修改
     */
    private String icallCenterNumber;

    /**
     * 用来业务支撑，不能用于解析处理
     */
    public DataPackParameter() {
        super(new DataPackObject(new DataPack("init", "init", "init")));
    }

    public DataPackParameter(DataPackObject object) {
        super(object);
    }


}
