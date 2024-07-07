package com.jakyjty.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public CommandLineRunner runOnce() {
		
		return (args)->{
			System.out.println("FROM RUNNER :: "+Arrays.asList(args));
			
		};
	}

}
