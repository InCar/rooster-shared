package com.incarcloud.rooster.share;

/**
 * Rooster常量类
 *
 * @author Aaric, created on 2018-01-10T16:39.
 * @since 2.1.12-SNAPSHOT
 */
public interface Constants {

    /**
     * 默认字符集
     */
    String DEFAULT_CHARSET = "UTF-8";

    /**
     * 缓存命令空间常量
     */
    interface CacheNamespaceKey {
        /**
         * 车辆VIN与设备号缓存Key - Hash结构
         */
        String CACHE_VEHICLE_VIN_HASH = "rooster:vehicle-vin";

        /**
         * 设备号与车辆VIN缓存Key - Hash结构
         */
        String CACHE_DEVICE_ID_HASH = "rooster:device-id";

        /**
         * 设备号与私钥字符串(Base64加密)缓存Key - Hash结构
         */
        String CACHE_DEVICE_PRIVATE_KEY_HASH = "rooster:device-private-key";

        /**
         * 设备号与公钥字符串(Base64加密)缓存Key - Hash结构
         */
        String CACHE_DEVICE_PUBLIC_KEY_HASH = "rooster:device-public-key";

        /**
         * 设备号与安全密钥字符串(Base64加密)缓存Key - Hash结构
         */
        String CACHE_DEVICE_SECURITY_KEY_HASH = "rooster:device-security-key";

        /**
         * 车辆VIN与心跳数据缓存缓存Key - Hash结构
         */
        String CACHE_VEHICLE_HEARTBEAT_HASH = "rooster:vehicle-heartbeat";

        /**
         * 车辆VIN与在线时间NS
         */
        String CACHE_NS_VEHICLE_ONLINE = "rooster:vehicle-online:";

        /**
         * 车辆VIN与离线时间缓存Key - Hash结构
         */
        String CACHE_VEHICLE_OFFLINE_HASH = "rooster:vehicle-offline";

        /**
         * 报警编码与报警规则缓存Key - Hash结构
         */
        String CACHE_ALARM_SETTING_HASH = "rooster:alarm-rule";

        /**
         * 故障编码与故障规则缓存Key - Hash结构
         */
        String CACHE_FAULT_SETTING_HASH = "rooster:fault-rule" ;

        /**
         * 报文流水号缓存Key - Hash结构
         */
        String CACHE_PACK_SN_HASH = "rooster:pack-sn";

        /**
         * 车辆VIN与地理位置缓存Key
         */
        String CACHE_VEHICLE_GEO = "rooster:vehicle-geo";

        /**
         * 车辆Dispatch分发数据 - List结构
         */
        String CACHE_MESSAGE_QUEUE = "rooster:message-queue";

        /**
         * 设备号与OTA升级包缓存Key - Hash结构
         */
        String CACHE_DEVICE_OTA_UPGRADE_HASH = "rooster:device-ota-upgrade";

        /**
         * 设备号与参数设置信息缓存Key - Hash结构
         */
        String CACHE_DEVICE_PARAM_SETTING_HASH = "rooster:device-param-setting" ;

        /**
         * 设备号与报警参数设置信息缓存Key - Hash结构
         */
        String CACHE_DEVICE_ALARM_PARAM_SETTING_HASH = "rooster:device-alarm_param-setting" ;
    }

    /**
     * 默认心跳周期30秒
     */
    int DEFAULT_HEARTBEAT_TIMEOUT = 30;

    /**
     * 心跳类型：1-登录, 2-登出, 3-心跳(或普通数据包)
     */
    interface HeartbeatType {
        /**
         * 1-登录
         */
        int LOGIN = 1;

        /**
         * 2-登出
         */
        int LOGOUT = 2;

        /**
         * 3-心跳(正常数据上报也算心跳)
         */
        int NORMAL = 3;
    }

    /**
     * 心跳数据包MAP键名
     */
    interface HeartbeatDataMapKey {
        /**
         * 类型
         */
        String TYPE = "type";

        /**
         * 时间
         */
        String TIME = "time";
    }

    /**
     * IDataParser#getMetaData返回对象MAP键名
     */
    interface MetaDataMapKey {
        /**
         * 协议
         */
        String PROTOCOL = "protocol";

        /**
         * 加密算法
         */
        String ALGORITHM = "algorithm";

        /**
         * 设备ID
         */
        String DEVICE_ID = "deviceId";

        /**
         * 数据包类型
         */
        String PACK_TYPE = "packType";

        /**
         * 车辆标识
         */
        String VIN = "vin";
    }

    /**
     * 数据包类型：0-激活, 1-登录, 2-登出, 3-心跳(或普通数据包)
     */
    interface PackType extends HeartbeatType {
        /**
         * 0-激活
         */
        int ACTIVATE = 0;
    }

    /**
     * 平台支持加密名称
     */
    interface AlgorithmName {
        /**
         * RSA
         */
        String RSA = "RSA";

        /**
         * AES
         */
        String AES = "AES";
    }

    /**
     * RSA密钥MAP键名
     */
    interface RSADataMapKey {
        /**
         * RSA公钥{e,n}中的 n
         */
        String N = "n";

        /**
         * RSA公钥{e,n}中的 e
         */
        String E = "e";
    }

    /**
     * AES密钥MAP键名
     */
    interface AESDataMapKey {
        /**
         * AES密钥中128bit密钥
         */
        String S = "s";

        /**
         * AES密钥CBC模式偏移量
         */
        String P = "p";
    }
}
