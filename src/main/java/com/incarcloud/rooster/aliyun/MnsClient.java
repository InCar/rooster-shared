package com.incarcloud.rooster.aliyun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.CloudTopic;
import com.aliyun.mns.client.MNSClient;
import com.aliyun.mns.common.http.ClientConfiguration;
import com.aliyun.mns.model.Base64TopicMessage;
import com.aliyun.mns.model.TopicMessage;

/**
 * @ClassName: MNSClient
 * @Description: 操作阿里MNS的客户端
 * @author Fan Beibei
 * @date 2017年6月4日 下午9:07:20
 * 
 */
@Component
public class MnsClient {
	@Autowired
	private AliYunConfig config;

	/**
	 * MNS 客户端(单例模式)
	 */
	private MNSClient client;

	/**
	 * 获取MNS客户端
	 * 
	 * @return 单例模式的MNS客户端
	 */
	private MNSClient getMnsClient() {
		if (null == client) {
			String accessId = config.getAccessKeyId();
			String accessKey = config.getAccessKeySecret();
			String endPoint = config.getMnsEndpoint();
			int maxConnections = config.getMaxConnections();
			int maxConnectionsPerRoute = config.getMaxConnectionsPerRoute();

			ClientConfiguration clientConfiguration = new ClientConfiguration();
			clientConfiguration.setMaxConnections(maxConnections);
			clientConfiguration.setMaxConnectionsPerRoute(maxConnectionsPerRoute);
			CloudAccount cloudAccount = new CloudAccount(accessId, accessKey, endPoint, clientConfiguration);
			client = cloudAccount.getMNSClient();
		}

		return client;
	}

	/**
	 * 发送消息，返回消息ID
	 * 
	 * @param topicName
	 *            主题名称
	 * @param message
	 *            消息内容
	 * @return 消息ID
	 */
	public String sendMessage(String topicName, byte[] messageContent) {

		CloudTopic topic = getMnsClient().getTopicRef(topicName);

		TopicMessage msg = new Base64TopicMessage(); // 可以使用TopicMessage结构，选择不进行Base64加密
		msg.setMessageBody(messageContent);
		// msg.setMessageTag("filterTag"); //设置该条发布消息的filterTag
		msg = topic.publishMessage(msg);
		// System.out.println(msg.getMessageId());
		// System.out.println(msg.getMessageBodyMD5());

		return msg.getMessageId();

	}

}
