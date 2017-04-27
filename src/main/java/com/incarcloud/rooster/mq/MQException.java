package com.incarcloud.rooster.mq;

public class MQException extends RuntimeException {
    public MQException(){
        super();
    }

    public MQException(String error){
        super(error);
    }

    public MQException(String error, Throwable ex){
        super(error, ex);
    }
}
