package com.incarcloud.rooster;/**
 * Created by fanbeibei on 2017/6/30.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/6/30 15:15
 */
@Component
public class KafkaConfig {
    /**
     * 对应kafka的bootstrap.servers配置
     */
    private String bootstrap_servers;
    /**
     * 主题
     */
    private String topic;

    public String getBootstrap_servers() {
        return bootstrap_servers;
    }

    @Value("rooster.kafka.bootstrapserver")
    public void setBootstrap_servers(String bootstrap_servers) {
        this.bootstrap_servers = bootstrap_servers;
    }

    @Value("rooster.kafka.topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}
