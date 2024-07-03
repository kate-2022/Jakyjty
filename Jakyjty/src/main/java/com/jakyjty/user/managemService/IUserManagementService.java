package com.jakyjty.user.managemService;

import com.jakyjty.model.user.User;
import com.jakyjty.charity.annotations.*;

public interface IUserManagementService {
	
	@CustomTransaction
	public String registerUser(User user);
	@CustomTransaction
	public User fetchUserById(Long id);

}
