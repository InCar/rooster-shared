package com.incarcloud.rooster.share;

/**
 * 常量类
 *
 * @author Aaric, created on 2018-01-10T16:39.
 * @since 2.1.12-SNAPSHOT
 */
public interface Constants {

    /**
     * 缓存命令空间常量
     */
    interface CacheNamespace {

        /**
         * 车辆VIN与设备号缓存NS
         */
        String CACHE_NS_VEHICLE_VIN = "com.incarcloud.rooster:vehicle-vin:";

        /**
         * 设备号与VIN缓存NS
         */
        String CACHE_NS_DEVICE_CODE = "com.incarcloud.rooster:device-code:";

        /**
         * 设备号与激活UUID字符串
         */
        String CACHE_NS_DEVICE_UUID = "com.incarcloud.rooster:device-device-uuid:";

        /**
         * 车辆VIN与心跳数据缓存NS
         */
        String CACHE_NS_DEVICE_HEARTBEAT = "com.incarcloud.rooster:device-heartbeat:";

        /**
         * 车辆VIN与在线时间NS
         */
        String CACHE_NS_DEVICE_ONLINE = "com.incarcloud.rooster:device-online:";

        /**
         * 车辆VIN与离线时间NS
         */
        String CACHE_NS_DEVICE_OFFLINE = "com.incarcloud.rooster:device-offline:";

        /**
         * 报警编码与报警规则NS
         */
        String CACHE_NS_ALARM_SETTING = "com.incarcloud.rooster:alarm:";
    }
}
