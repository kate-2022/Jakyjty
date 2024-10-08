package com.jakyjty.session.swagger.config;

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
	return new Docket(DocumentationType.SWAGGER_2)// UI Screen type
	.select() // to specify RestControllers
	.apis(RequestHandlerSelectors.basePackage("com.jakyjty.usercontroller"))// base packages for RestController
	.paths(PathSelectors.regex("/api/user.*"))// To specify the request paths
	.build()// build the docket object
	.useDefaultResponseMessages(true)
	.apiInfo(getApiInfo());
	}
	
	
	private ApiInfo getApiInfo() {
	Contact contact = new Contact("kate", "http://wwww. ...","xyz@gmx.com");
	return new ApiInfo(
			"someInfo", 
			"someMoreInfo ",
			"1.0.RELEASE","http:www...",
			contact,
			"GNU PUBLIC",
			"http://apache.org/license/guru",
	Collections.emptyList());
	}
	

}
