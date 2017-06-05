package com.incarcloud.rooster.aliyun;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private MnsClient mnsClient;

	@Override
	public List<MqSendResult> post(List<MQMsg> listMsgs) {

		if (null == listMsgs || 0 == listMsgs.size()) {
			throw new IllegalArgumentException("message list is null");
		}

		List<MqSendResult> resultList = new ArrayList<>(listMsgs.size());

		for (MQMsg msg : listMsgs) {

			try {
				mnsClient.sendMessage("rooster-dev", msg.getData());
			} catch (ClientException ce) {
				resultList.add(new MqSendResult(
						new MQException("Something wrong with the network connection between client and MNS service."
								+ "Please check your network and DNS availablity."),
						null));
				ce.printStackTrace();
			} catch (ServiceException se) {

				resultList.add(new MqSendResult(new MQException(se.getErrorCode()), null));
				se.printStackTrace();
			} catch (Exception e) {
				resultList.add(new MqSendResult(new MQException(e.getMessage()), null));
				e.printStackTrace();
			}

		}

		return resultList;
	}

}
