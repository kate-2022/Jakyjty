package com.jakyjty.user.managemService;


import com.jakyjty.model.user.User;

public interface IUserManagementService {

	public String registerUser(User user);
	public User fetchUserById(Long id);
	public Boolean userPresent(User user);
	public String userActivity(User user);

}
