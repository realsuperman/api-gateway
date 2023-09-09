package com.example.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	@Bean
	public HttpTraceRepository httpTraceRepository(){
		/*
			management:
			  endpoints:
				web:
				  exposure:
					include: refresh,health,beans,httptrace
			여기서 httptrace를 사용하려면 이러한 빈을 등록해야함
		 */
		return new InMemoryHttpTraceRepository();
	}
}
