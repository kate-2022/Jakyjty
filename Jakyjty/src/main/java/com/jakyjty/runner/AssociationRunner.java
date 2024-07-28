package com.jakyjty.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AssociationRunner implements CommandLineRunner {

//	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		System.out.println("AssociationRunner.run()");
		RestTemplate template = new RestTemplate();
		String serviceUrl = "http://localhost:8888/Jakyjty/api/jakyjty/greet";

		 ResponseEntity<String> responseEntity = template.getForEntity(serviceUrl, String.class);
		 
		 System.out.println("ResponseBody              :: " + responseEntity.getBody());
//		 System.out.println("ResponseStatus Code Value :: " + responseEntity.getStatusCodeValue());
		 System.out.println("ResponseStatus Code       :: " + responseEntity.getStatusCode().value());
//		 System.out.println("ResponseStatus Code       :: " + responseEntity.getStatusCode().name());
		 System.out.println("ResponseStatus Code       :: " + responseEntity.getStatusCode().toString());
		 System.out.println("****************************************************************");
		 
	}

}
