# consumer-contract

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

## References

- [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)