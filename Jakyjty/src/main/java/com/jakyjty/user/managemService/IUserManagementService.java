package com.jakyjty.user.managemService;

import com.jakyjty.model.user.User;

public interface IUserManagementService {
	
	
	public String registerUser(User user);
	public User fetchUserById(int id);

}
