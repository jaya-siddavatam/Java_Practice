package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class ManagerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerMicroServiceApplication.class, args);
	
		System.out.println("Manager Micro Controller server up....");	
	}
	
	@Bean   //object we are creating maintained by container
	@LoadBalanced //responsible to maintain the instance
	public RestTemplate resttemplate() {
		return new RestTemplate();	
	}
}
