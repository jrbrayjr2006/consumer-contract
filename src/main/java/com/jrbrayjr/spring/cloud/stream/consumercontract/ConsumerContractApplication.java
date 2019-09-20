package com.jrbrayjr.spring.cloud.stream.consumercontract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding( value = {Sink.class})
@SpringBootApplication
public class ConsumerContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerContractApplication.class, args);
	}

}
