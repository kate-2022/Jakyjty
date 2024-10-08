package com.jakyjty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JakyjtyMs4ExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JakyjtyMs4ExceptionApplication.class, args);
	}

}
