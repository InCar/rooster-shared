package com.incarcloud.rooster.share;

/**
 * 常量类
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
         * 设备号与私钥字符串(Base64加密)
         */
        String CACHE_NS_DEVICE_PRIVATE_KEY = "com.incarcloud.rooster:device-private-key:";

        /**
         * 设备号与公钥字符串(Base64加密)
         */
        String CACHE_NS_DEVICE_PUBLIC_KEY = "com.incarcloud.rooster:device-public-key:";

        /**
         * 设备号与安全密钥字符串(Base64加密)
         */
        String CACHE_NS_DEVICE_SECURITY_KEY = "com.incarcloud.rooster:device-security-key:";

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
         * 3-心跳
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
}
