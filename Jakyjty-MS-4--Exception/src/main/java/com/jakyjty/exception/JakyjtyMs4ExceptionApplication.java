package com.jakyjty.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class JakyjtyMs4ExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JakyjtyMs4ExceptionApplication.class, args);
	}

}
