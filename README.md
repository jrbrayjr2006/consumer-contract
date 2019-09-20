# consumer-contract

## NOTE
This is still a work in progress so the documentation and code will change frequently.  The direction  of the project may change before the release code is finalized.  Use this code at your own risk.

## Purpose
The purpose of this microservice is to provide a working example of a consumer of a Spring Cloud Contract using messaging.

## Details
This is a microservice client that consumes a service from another microservice so we will use the Feign client for this.  The OpenFeign dependency is included so we can use the OpenFeign libraries.

```xml
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-feign</artifactId>
			<version>${feign.version}</version>
		</dependency>
```

## Testing

### Unit Tests

### Contract Tests

This application uses the subrunner to validate that it consumes the service in accordance with tbe the contract agreed to by the producer. 

This test assumes the stubs from the producer are available locally in the local maven repository `<user root directory>/.m2/repository/`

```java
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(stubsMode = StubRunnerProperties.StubsMode.LOCAL, ids = "com.jrbrayjr.spring.cloud.stream:producer-contract:+:stubs")
@ExtendWith(SpringExtension.class)
public class ConsumerContractTest {
    @Autowired
    StubTrigger stubTrigger;
    
    ...
    ...
}
```

## References

- [Introducing Spring Cloud Contract](https://cloud.spring.io/spring-cloud-contract/reference/html/getting-started.html#getting-started-introducing-spring-cloud-contract)
- [Enforcing Spring Cloud Contracts Over AMQP](https://novotnyr.github.io/scrolls/enforcing-spring-cloud-contracts-over-amqp/)
- [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)