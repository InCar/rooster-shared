package com.incarcloud.rooster;

import org.junit.Test;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.CloudQueue;
import com.aliyun.mns.client.CloudTopic;
import com.aliyun.mns.client.MNSClient;
import com.aliyun.mns.common.ClientException;
import com.aliyun.mns.common.ServiceException;
import com.aliyun.mns.model.Base64TopicMessage;
import com.aliyun.mns.model.Message;
import com.aliyun.mns.model.QueueMeta;
import com.aliyun.mns.model.SubscriptionMeta;
import com.aliyun.mns.model.TopicMessage;

public class MNSTest {
	@Test
	public void testCreateQueue() {
		CloudAccount account = new CloudAccount("", "",
				"");
		MNSClient client = account.getMNSClient(); // 在程序中，CloudAccount以及MNSClient单例实现即可，多线程安全
		String queueName = "TestQueue";
		QueueMeta meta = new QueueMeta(); // 生成本地QueueMeta属性，有关队列属性详细介绍见https://help.aliyun.com/document_detail/27476.html
		meta.setQueueName(queueName); // 设置队列名
		meta.setPollingWaitSeconds(15);
		meta.setMaxMessageSize(2048L);
		try {
			CloudQueue queue = client.createQueue(meta);

			// queue.asyncPopMessage(callback)
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
		CloudAccount account = new CloudAccount("LTAItjABmFIcoDen", "pu1zhsRFnSzR3M2sZenLxGrHsHrY8Y",
				"");
		MNSClient client = account.getMNSClient(); // 在程序中，CloudAccount以及MNSClient单例实现即可，多线程安全
		CloudQueue queue = client.getQueueRef("rooster-dev");
        Message message = new Message();
        message.setMessageBody("I am test message ");
        Message putMsg = queue.putMessage(message);
        System.out.println("Send message id is: " + putMsg.getMessageId());
		

		client.close();
	}
	
	
	
	
	@Test
	public void testPop(){
		CloudAccount account = new CloudAccount("", "",
				"");
		MNSClient client = account.getMNSClient(); // 在程序中，CloudAccount以及MNSClient单例实现即可，多线程安全

		 try{
	            CloudQueue queue = client.getQueueRef("rooster-dev");
	            Message popMsg = queue.popMessage();
	            if (popMsg != null){
	                System.out.println("message handle: " + popMsg.getReceiptHandle());
	                System.out.println("message body: " + popMsg.getMessageBodyAsString());
	                System.out.println("message id: " + popMsg.getMessageId());
	                System.out.println("message dequeue count:" + popMsg.getDequeueCount());
	                //删除已经取出消费的消息
	                 queue.deleteMessage(popMsg.getReceiptHandle());
	                    System.out.println("delete message successfully.\n");
	            }
	            else{
	                System.out.println("message not exist in TestQueue.\n");
	            }
	        } catch (ClientException ce)
	        {
	            System.out.println("Something wrong with the network connection between client and MNS service."
	                    + "Please check your network and DNS availablity.");
	            ce.printStackTrace();
	        } catch (ServiceException se)
	        {
	            se.printStackTrace();
	            if (se.getErrorCode() != null) {
	                if (se.getErrorCode().equals("QueueNotExist"))
	                {
	                    System.out.println("Queue is not exist.Please create before use");
	                } else if (se.getErrorCode().equals("TimeExpired"))
	                {
	                    System.out.println("The request is time expired. Please check your local machine timeclock");
	                }
	            /*
	            you can get more MNS service error code from following link:
	            https://help.aliyun.com/document_detail/mns/api_reference/error_code/error_code.html
	            */
	            }
	        } catch (Exception e)
	        {
	            System.out.println("Unknown exception happened!");
	            e.printStackTrace();
	        }
	        client.close();
		
		
	}
	
	@Test
	public void testPublish(){
		CloudAccount account = new CloudAccount("", "",
				"");
		MNSClient client = account.getMNSClient(); // 在程序中，CloudAccount以及MNSClient单例实现即可，多线程安全

		
		CloudTopic topic = client.getTopicRef("rooster-dev");
        try {
            TopicMessage msg = new Base64TopicMessage(); //可以使用TopicMessage结构，选择不进行Base64加密
            msg.setMessageBody("hello world!");
            //msg.setMessageTag("filterTag"); //设置该条发布消息的filterTag
            msg = topic.publishMessage(msg);
            System.out.println(msg.getMessageId());
            System.out.println(msg.getMessageBodyMD5());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("subscribe error");
        }
        client.close();
	}

	@Test
	public void testSubsribe() {
		CloudAccount account = new CloudAccount("", "",
				"");
		MNSClient client = account.getMNSClient(); // 在程序中，CloudAccount以及MNSClient单例实现即可，多线程安全

		CloudTopic topic = client.getTopicRef("rooster-dev");
        try {
        	SubscriptionMeta subMeta = new SubscriptionMeta();
            subMeta.setSubscriptionName("rooster-dev");
            subMeta.setNotifyContentFormat(SubscriptionMeta.NotifyContentFormat.SIMPLIFIED);
            subMeta.setEndpoint(topic.generateQueueEndpoint("TestSubForQueue"));
//            subMeta.setFilterTag("filterTag");
            String subUrl = topic.subscribe(subMeta);
            System.out.println("subscription url: " + subUrl);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("subscribe/unsubribe error");
        }
        client.close();


	}
}
