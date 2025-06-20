package com.jakyjty.user.managemService;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.jakyjty.charity.annotations.CustomTransaction;
import com.jakiyjty.dao.user.IUserRepository;
import com.jakyjty.model.user.User;

@Service("userService")
public class UserManagementServiceImpl implements IUserManagementService {
	
	@Autowired
	IUserRepository repo;

	@Override
//	@CustomTransaction
	public String registerUser(User user){
		
		String fName= repo.save(user).getFirstName();
		return "Hi there " + fName +" good to have you with us at Jakyjty´s! A very warm welcome to you. You are registered successfully! ";
	
	}

	@Override
//	@CustomTransaction
	public User fetchUserById(Long id) {
	
		return repo.findById(id).
				orElseThrow(() -> new UserNotFoundException("User with id "+ id + " not found.."));
	}

	@Override
	public Boolean userPresent(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String userActivity(User user) {
		// TODO Auto-generated method stub
		return null;
	}



	}





