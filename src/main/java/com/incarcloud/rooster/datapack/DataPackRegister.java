package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 注册数据<br>
 * 目前对应于JTT808的0x0100-终端注册
 *
 * @author Aaric, created on 2017-09-01T10:10.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackRegister extends DataPackObject {

    /**
     * 省域 ID（参考  GB/T 2260 中规定的行政区划代码六位中前两位）
     */
    private Integer provinceId;

    /**
     * 市县域 ID（参考  GB/T 2260 中规定的行政区划代码六位中后四位）
     */
    private Integer cityId;

    /**
     * 制造商 ID
     */
    private String terminalMakerId;

    /**
     * 终端型号
     */
    private String terminalModel;

    /**
     * 终端 ID
     */
    private String terminalId;

    /**
     * 车牌颜色（参考 JT/T415-2006 的 5.4.12）<br>
     * 0-未上牌, 1-蓝色, 2-黄色, 3-黑色, 4-白色
     */
    private Integer colorId;

    public DataPackRegister(DataPackObject object) {
        super(object);
    }
}
