package com.incarcloud.rooster.mq;

/**
 * @ClassName: MqSendResult
 * @Description: 发送消息返回的结果
 * @author Fan Beibei
 * @date 2017年6月2日 下午3:51:08
 * 
 */
public class MqSendResult {
	/**
	 * 异常信息
	 */
	private MQException exception;
	/**
	 * 返回的数据
	 */
	private Object data;

	/**
	 * @param exception
	 * @param data
	 */
	public MqSendResult(MQException exception, Object data) {
		super();
		this.exception = exception;
		this.data = data;
	}

	/**
	 * 获取 异常信息
	 * 
	 * @return exception
	 */
	public MQException getException() {
		return exception;
	}

	/**
	 * 设置 异常信息
	 * 
	 * @param exception
	 *            异常信息
	 */
	public void setException(MQException exception) {
		this.exception = exception;
	}

	/**
	 * 获取 返回的数据
	 * 
	 * @return data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * 设置 返回的数据
	 * 
	 * @param data
	 *            返回的数据
	 */
	public void setData(Object data) {
		this.data = data;
	}

}
