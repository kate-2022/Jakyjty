package com.jakyjty.user;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.log4j.Category;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.spi.LoggerFactory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class JakyjtyMs1UserApplication {
	
//
//	private static final org.apache.log4j.Logger LOGGER = LogManager.getLogger(JakyjtyMs1UserApplication.class);
//	
//	static {
//		SimpleLayout layout = new SimpleLayout();
//		ConsoleAppender appender = new ConsoleAppender(layout);
//		LOGGER.addAppender(appender);
//	    LOGGER.setLevel(Level.ERROR);
//	}
//		
		
	public static void main(String[] args) {
		SpringApplication.run(JakyjtyMs1UserApplication.class, args);
		
		// LOGGER.debug("start of MS1 main method...");
	}

}
