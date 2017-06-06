package com.incarcloud.rooster.aliyun;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.CloudQueue;
import com.aliyun.mns.client.MNSClient;
import com.aliyun.mns.common.http.ClientConfiguration;
import com.aliyun.mns.model.Message;

/**
 * @ClassName: MNSClient
 * @Description: 操作阿里MNS的客户端
 * @author Fan Beibei
 * @date 2017年6月4日 下午9:07:20
 * 
 */
@Component
public class MnsClient {
	private static org.slf4j.Logger s_logger = LoggerFactory.getLogger(MnsClient.class);
	/**
	 * MNS 客户端(单例模式)
	 */
	private MNSClient client;

	/**
	 * @param config
	 */
	public MnsClient(AliYunConfig config) {
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

	/**
	 * 获取MNS客户端
	 * 
	 * @return 单例模式的MNS客户端
	 */
	private MNSClient getMnsClient() {

		return client;
	}

	/**
	 * 发送消息，返回消息ID
	 * 
	 * @param queueName
	 *            队列名称
	 * @param message
	 *            消息内容
	 * @return 消息ID
	 */
	public String sendMessage(String queueName, byte[] messageContent) {

		CloudQueue queue = getMnsClient().getQueueRef(queueName);
		Message message = new Message();
		message.setMessageBody(messageContent);
		Message putMsg = queue.putMessage(message);
		
		s_logger.debug("******************"+putMsg.getMessageId());

		return putMsg.getMessageId();

	}

}
