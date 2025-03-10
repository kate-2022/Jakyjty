package com.jakyjty.security.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfigApp {
	
	@Autowired
	private DataSource datasource;
	
	public void authenticationManager(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication()
			.passwordEncoder(new BCryptPasswordEncoder())
			.dataSource(datasource)
			.usersByUsernameQuery("select username, password, enabled from users where username=?") 
			.authoritiesByUsernameQuery("select username, authority from authorities where username=?");
			
	}
	
//	@SuppressWarnings("removal")
	@Bean
	  public SecurityFilterChain userDefinedFilter (HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
        				request -> request.requestMatchers("/api/", "/api/home ", "/register/{firstName}", "/api/oauth")
                        .permitAll()
                        .requestMatchers("/api/admin").hasAnyRole("ADMIN", "USER")
                        .requestMatchers("/api/user").hasRole("USER")
                        .anyRequest()
                        .authenticated()
                       ).formLogin();		
		return http.build();
	}
	
	


}
