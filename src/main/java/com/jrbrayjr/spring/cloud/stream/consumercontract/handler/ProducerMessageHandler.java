package com.jrbrayjr.spring.cloud.stream.consumercontract.handler;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ProducerMessageHandler {

    private Sink sink;

    public ProducerMessageHandler(Sink sink) {

        this.sink = sink;
    }

    @StreamListener(Sink.INPUT)
    public void receiveMessage(Message<Map<String, String>> dummyMessage) {
        MessageHandler messageHandler = null;
        sink.input().subscribe(messageHandler);
    }
}
