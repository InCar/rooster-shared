package com.incarcloud.rooster.mq;

import org.jdeferred.Promise;

import java.util.List;

public interface IBigMQ {
    Promise<Object, List<MQException>, Object> post(List<MQMsg> listMsgs);
}
