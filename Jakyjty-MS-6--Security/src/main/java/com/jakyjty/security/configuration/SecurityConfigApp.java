package com.jakyjty.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigApp {
	
//	@SuppressWarnings("removal")
	@Bean
	  public SecurityFilterChain userDefinedFilter (HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
        				request -> request.requestMatchers("/api/security/", "/api/security/home ", "/register/{firstName}", "/api/security/oauth")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
                       ).formLogin();		
		return http.build();
	}
	
	


}
