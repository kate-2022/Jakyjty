package com.jakyjty.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class JakyjtyMs2SessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JakyjtyMs2SessionApplication.class, args);
	}

}
