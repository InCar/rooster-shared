package com.incarcloud.rooster.aliyun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AliYunConfig {
    private String _accountId;
    private String _accessKeyId;
    private String _accessKeySecret;

    public String getAccountId(){ return _accountId; }
    @Value("${rooster.aliyun.accountId}")
    public void setAccountId(String value){ _accountId = value; }

    public String getAccessKeyId(){ return _accessKeyId; }
    @Value("${rooster.aliyun.accessKeyId}")
    public void setAccessKeyId(String value){ _accessKeyId = value; }

    public String getAccessKeySecret(){ return _accessKeySecret; }
    @Value("${rooster.aliyun.accessKeySecret}")
    public void setAccessKeySecret(String value){ _accessKeySecret = value; }

    // TODO: MNS OTS config
}
