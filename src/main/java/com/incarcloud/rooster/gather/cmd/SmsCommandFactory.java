package com.incarcloud.rooster.gather.cmd;

import com.incarcloud.rooster.datapack.DataPackSms;

/**
 * 工厂类，用于创建下发短信给车辆
 *
 * @author Kong, created on 2019-07-01T16:10.
 * @version 1.0.0-SNAPSHOT
 */
public interface SmsCommandFactory {

    /**
     * 创建短信指令
     *
     * @param smsCommandType
     * @param obj
     * @return
     */
    String createSmsCommand(SmsCommandType smsCommandType, Object... obj);

    /**
     * 解析短信内容
     *
     * @param smsCommandType
     * @param smsContent
     * @return
     */
    DataPackSms protocolData(SmsCommandType smsCommandType, String smsContent);
}
