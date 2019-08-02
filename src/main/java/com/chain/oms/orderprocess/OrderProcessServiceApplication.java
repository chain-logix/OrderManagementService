package com.chain.oms.orderprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan({"com.chain"})
@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
public class OrderProcessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProcessServiceApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}
