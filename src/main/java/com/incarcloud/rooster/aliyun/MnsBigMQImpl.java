package com.incarcloud.rooster.aliyun;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.aliyun.mns.common.ClientException;
import com.aliyun.mns.common.ServiceException;
import com.incarcloud.rooster.mq.IBigMQ;
import com.incarcloud.rooster.mq.MQException;
import com.incarcloud.rooster.mq.MQMsg;
import com.incarcloud.rooster.mq.MqSendResult;

/**
 * @ClassName: MnsBigMQImpl
 * @Description:IBigMQ 阿里云MNS 实现
 * @author Fan Beibei
 * @date 2017年6月2日 下午4:29:04
 * 
 */
@Component
public class MnsBigMQImpl implements IBigMQ {
	
	private static org.slf4j.Logger s_logger = LoggerFactory.getLogger(MnsBigMQImpl.class);

	private MnsClient mnsClient;

	/**
	 * @param mnsClient
	 */
	public MnsBigMQImpl(MnsClient mnsClient) {
		this.mnsClient = mnsClient;
	}

	@Override
	public List<MqSendResult> post(List<MQMsg> listMsgs) {

		if (null == listMsgs || 0 == listMsgs.size()) {
			throw new IllegalArgumentException("message list is null");
		}

		List<MqSendResult> resultList = new ArrayList<>(listMsgs.size());

		for (MQMsg msg : listMsgs) {

			try {
				String msgId = mnsClient.sendMessage("rooster-dev", msg.getData());
				resultList.add(new MqSendResult(null, msgId));
			} catch (ClientException ce) {

				resultList.add(new MqSendResult(
						new MQException("Something wrong with the network connection between client and MNS service."
								+ "Please check your network and DNS availablity."),
						null));
//				ce.printStackTrace();
				s_logger.debug("58",ce.getMessage());
			} catch (ServiceException se) {
				resultList.add(new MqSendResult(new MQException(se.getErrorCode()), null));
//				se.printStackTrace();
				s_logger.debug("62",se.getMessage());
			} catch (Exception e) {
				resultList.add(new MqSendResult(new MQException(e.getMessage()), null));
//				e.printStackTrace();
				s_logger.debug("66",e.getMessage());
			}
		}

		return resultList;
	}

}
