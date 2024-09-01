package com.jakyjty.model.present;


import com.jakyjty.model.user.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.NonNull;

public class UserPresent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	@NonNull
	private Boolean online= false;
	
    @OneToOne(mappedBy = "userPresent")
    private User user;

}
