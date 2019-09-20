package com.jrbrayjr.spring.cloud.stream.consumercontract.handler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProducerMessageHandlerTest {

    Sink mockSink;

    ProducerMessageHandler handler;

    @BeforeEach
    void setUp() {
        mockSink = mock(Sink.class);
        handler = new ProducerMessageHandler(mockSink);
    }

    @Test
    void starterTest() {
        // Given
        Map<String, String> payload = new HashMap<>();
        Message dummyMessage = MessageBuilder.withPayload(payload).build();
        SubscribableChannel mockSubscribableChannel = mock(SubscribableChannel.class);
        // When
        when(mockSink.input()).thenReturn(mockSubscribableChannel);
        handler.receiveMessage(dummyMessage);
        // Then
        verify(mockSink).input();
    }
}