package com.incarcloud.rooster.mq;

/**
 * 消息队列异常
 * 
 * @author 熊广化
 *
 */
public class MQException extends RuntimeException {

	public MQException() {
		super();
	}

	public MQException(String error) {
		super(error);
	}

	public MQException(String error, Throwable ex) {
		super(error, ex);
	}

	/**
	 * 重写提高效率
	 */
	@Override
	public synchronized Throwable fillInStackTrace() {
		return this;
	}
}
