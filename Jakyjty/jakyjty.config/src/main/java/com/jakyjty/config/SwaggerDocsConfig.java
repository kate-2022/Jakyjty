package com.jakyjty.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocsConfig {

	@Bean
	public Docket createDocket() {
		return new Docket (DocumentationType.SWAGGER_2).
				select().
				apis(RequestHandlerSelectors.basePackage("com.jakyjty.restcontroller")).
				paths(PathSelectors.regex("/api/jakyjty.*")).
				build().
				useDefaultResponseMessages(true).apiInfo(getApiInfo());
	}
		private ApiInfo getApiInfo() {
			Contact contact = new Contact("kate","http://localhost:8888","kate@gmx.de");

			return new ApiInfo("UApi Documantation","Summarizes user activities","1.0.RELEASE", "http:", contact, "3CYHub","https://www.youtube.com/channel/UCQtRfObIsMks54kH04aezLA",
					Collections.emptyList());
		}


		
	}

