package com.jrbrayjr.spring.cloud.stream.consumercontract.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class ConsumerMessageListener {


    @StreamListener(Sink.INPUT)
    public void receiveMessage(Message<Map<String, String>> message) {
    }
}
