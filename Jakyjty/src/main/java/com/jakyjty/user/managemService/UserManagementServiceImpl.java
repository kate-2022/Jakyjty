package com.jakyjty.user.managemService;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.jakyjty.charity.annotations.CustomTransaction;
import com.jakyjty.dao.IUserRepository;
import com.jakyjty.exception.*;
import com.jakyjty.model.user.User;

public class UserManagementServiceImpl implements IUserManagementService {
	
	@Autowired
	IUserRepository repo;

	@Override
	@CustomTransaction
	public String registerUser(User user) {
		
	
		return null;
	}

	@Override
	@CustomTransaction
	public User fetchUserById(Long id) {
	
		return repo.findById(id).
				orElseThrow(() -> new UserNotFoundException("User with id "+ id + " not found.."));
	}







}
