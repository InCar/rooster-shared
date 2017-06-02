package com.incarcloud.rooster;

import org.junit.Test;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.CloudQueue;
import com.aliyun.mns.client.MNSClient;
import com.aliyun.mns.common.ClientException;
import com.aliyun.mns.common.ServiceException;
import com.aliyun.mns.model.Message;
import com.aliyun.mns.model.QueueMeta;

public class MNSTest {
	@Test
	public void testCreateQueue() {
		CloudAccount account = new CloudAccount("qkjiPJf7YkkYhW39", "ruk48fvSGlLs7Izbo2D4NxqQjaaqPT", "http://1786089012649873.mns.cn-hangzhou.aliyuncs.com/");
		MNSClient client = account.getMNSClient(); // 在程序中，CloudAccount以及MNSClient单例实现即可，多线程安全
		String queueName = "TestQueue";
		QueueMeta meta = new QueueMeta(); // 生成本地QueueMeta属性，有关队列属性详细介绍见https://help.aliyun.com/document_detail/27476.html
		meta.setQueueName(queueName); // 设置队列名
		meta.setPollingWaitSeconds(15);
		meta.setMaxMessageSize(2048L);
		try {
			CloudQueue queue = client.createQueue(meta);
			
			
			
		} catch (ClientException ce) {
			System.out.println("Something wrong with the network connection between client and MNS service."
					+ "Please check your network and DNS availablity.");
			ce.printStackTrace();
		} catch (ServiceException se) {
			se.printStackTrace();
			System.out.println("MNS exception requestId:" + se.getRequestId() + "," + se);
			if (se.getErrorCode() != null) {
				if (se.getErrorCode().equals("QueueNotExist")) {
					System.out.println("Queue is not exist.Please create before use");
				} else if (se.getErrorCode().equals("TimeExpired")) {
					System.out.println("The request is time expired. Please check your local machine timeclock");
				}
			
			}
		} catch (Exception e) {
			System.out.println("Unknown exception happened!");
			e.printStackTrace();
		}
		client.close(); // 程序退出时，需主动调用client的close方法进行资源释放
	}
	
	
	@Test
	public void testCreateSend() {
		CloudAccount account = new CloudAccount("qkjiPJf7YkkYhW39", "ruk48fvSGlLs7Izbo2D4NxqQjaaqPT", "http://1786089012649873.mns.cn-hangzhou.aliyuncs.com/");
		MNSClient client = account.getMNSClient(); // 在程序中，CloudAccount以及MNSClient单例实现即可，多线程安全
		
		try {
			CloudQueue queue = client.getQueueRef("TestQueue");
			Message message = new Message();
            message.setMessageBody("I am test message ");
            Message putMsg = queue.putMessage(message);
            System.out.println("Send message id is: " + putMsg.getMessageId());
			
			
		} catch (ClientException ce) {
			System.out.println("Something wrong with the network connection between client and MNS service."
					+ "Please check your network and DNS availablity.");
			ce.printStackTrace();
		} catch (ServiceException se) {
			se.printStackTrace();
			System.out.println("MNS exception requestId:" + se.getRequestId() + "," + se);
			if (se.getErrorCode() != null) {
				if (se.getErrorCode().equals("QueueNotExist")) {
					System.out.println("Queue is not exist.Please create before use");
				} else if (se.getErrorCode().equals("TimeExpired")) {
					System.out.println("The request is time expired. Please check your local machine timeclock");
				}
			
			}
		} catch (Exception e) {
			System.out.println("Unknown exception happened!");
			e.printStackTrace();
		}
		client.close(); // 程序退出时，需主动调用client的close方法进行资源释放
	}
}
