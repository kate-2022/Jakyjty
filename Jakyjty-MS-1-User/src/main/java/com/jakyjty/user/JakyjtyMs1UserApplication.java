package com.jakyjty.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JakyjtyMs1UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(JakyjtyMs1UserApplication.class, args);
	}

}
