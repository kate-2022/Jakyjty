package com.jakyjty.authentication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.activation.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private DataSource dataSource;
	

		public void authenticationManager(AuthenticationManagerBuilder auth) throws Exception {
					auth
					.jdbcAuthentication()
					.passwordEncoder(new BCryptPasswordEncoder())
					.dataSource ((javax.sql.DataSource) dataSource)
					.usersByUsernameQuery("select username, password, enabled from users where username =?")
					.authoritiesByUsernameQuery("select username, authority from authorities where username=?");
		}

		
		@Bean
		public SecurityFilterChain configure(HttpSecurity http) throws Exception {
            HttpSecurity sessionManagement = http.authorizeHttpRequests(
            				request -> request.requestMatchers(null)        	//antMatchers("/", "/api/jakyjty", "/api/jakyjty/greet").permitAll()
            				.requestMatchers(null).hasRole("ADMIN")						// .antMatchers("/login.*").hasRole("ADMIN")
            				.requestMatchers(null).hasAnyRole("USER", "ADMIN")			// .antMatchers("/api/jakyjty/result", "", "").hasAnyRole("USER", "ADMIN")
                            .anyRequest().authenticated())
            				.formLogin(withDefaults())
            				.rememberMe(withDefaults())
            				.logout(withDefaults())
            				.sessionManagement(management -> management.maximumSessions(5)
            				.maxSessionsPreventsLogin(true));	
			return http.build();
		}
		

	
}
