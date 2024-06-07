package com.jakyjty.authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * At some point we will need any kind of authentication.. to me it´s often annoying that you have to create an account 
 * and login for whatever you just quickly want to use or spend just a couple of hours with.. 
 * so i was thinking about some stateless single use access.. but this would not work unfortunately!
 * What if power goes off due to low battery, what if someone has to change a train and looses internet connection -
 * so we have to deal with it, one way or the other!
 * Still thinking about an 24 hour session access token?
 * But this probably is not how peoples mind set works.. let´s see!
 * 
 * */
 

@RestController
@RequestMapping("/login")
public class LogInController {
	
	
	
	

}
