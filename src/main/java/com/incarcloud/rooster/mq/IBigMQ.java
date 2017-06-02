package com.incarcloud.rooster.mq;

import java.util.List;


/** 
* @ClassName: IBigMQ 
* @Description: (这里用一句话描述这个类的作用) 
* @author Xiong Guanghua
* @date 2017年6月2日 下午3:55:17 
*/
public interface IBigMQ {
	List<MqSendResult> post(List<MQMsg> listMsgs);
}
