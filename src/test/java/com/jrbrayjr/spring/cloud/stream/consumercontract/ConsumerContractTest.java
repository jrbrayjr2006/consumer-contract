package com.jrbrayjr.spring.cloud.stream.consumercontract;

import com.jrbrayjr.spring.cloud.stream.consumercontract.listener.ConsumerMessageListener;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.StubTrigger;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(stubsMode = StubRunnerProperties.StubsMode.LOCAL, ids = "com.jrbrayjr.spring.cloud.stream:producer-contract:+:stubs")
@ExtendWith(SpringExtension.class)
public class ConsumerContractTest {

    @Autowired
    StubTrigger stubTrigger;

    Map<String, String> cityMap;

    ConsumerMessageListener listener;

    public void createCityMessage() {
        cityMap.put("city", "Chicago");
        Message dummyMessage = generateMessage(cityMap);
        listener.receiveMessage(dummyMessage);
    }

    @Test
    public void dummyTest() {
        //TODO
    }

    private Message<Map<String, String>> generateMessage(Map<String, String> payload) {
        return MessageBuilder.withPayload(payload).build();
    }
}
