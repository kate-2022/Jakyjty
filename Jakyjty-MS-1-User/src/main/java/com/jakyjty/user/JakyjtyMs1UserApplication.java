package com.jakyjty.user;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.spi.LoggerFactory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import ch.qos.logback.core.ConsoleAppender;



@SpringBootApplication
@EnableDiscoveryClient
public class JakyjtyMs1UserApplication {
	

		private static final Logger LOGGER = LogManager.getLogger(JakyjtyMs1UserApplication.class);
	 
		static {
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender appender = new ConsoleAppender(layout);
		LOGGER.addAppender(appender);
		LOGGER.setLevel(Level.ERROR);
		}
		
		
	public static void main(String[] args) {
		LOGGER.debug("start of main method...");
		SpringApplication.run(JakyjtyMs1UserApplication.class, args);
	}

}
