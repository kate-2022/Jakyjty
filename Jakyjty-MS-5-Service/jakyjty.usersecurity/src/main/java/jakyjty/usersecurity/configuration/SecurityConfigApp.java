package jakyjty.usersecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigApp {
	
	@SuppressWarnings("removal")
	@Bean
	public SecurityFilterChain userdefinedFilter(HttpSecurity http) throws Exception {
				http.authorizeHttpRequests(
						request -> request.requestMatchers("/api/home","/api/register/{firstName}","/logIn")  
						                   //.antMatchers("/api/home","/api/register/{firstName}","/logIn")
						.permitAll()
						.anyRequest()
						.authenticated())
						.formLogin();
						
						
		
				return http.build();	
				}
	

	
	

}
