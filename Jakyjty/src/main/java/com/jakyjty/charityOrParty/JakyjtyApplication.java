package com.jakyjty.charityOrParty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JakyjtyApplication {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication();
		// application.setBannerMode(Mode.CONSOLE);   by default!
		
		ConfigurableApplicationContext ctx = application.run(JakyjtyApplication.class, args);
		ctx.close();
	}

}
