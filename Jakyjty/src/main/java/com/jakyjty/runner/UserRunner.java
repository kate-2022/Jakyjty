package com.jakyjty.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jakyjty.dao.IUserRepository;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired
	private IUserRepository repo;

	@Override
	public void run(String... args) throws Exception {
	
    repo.findById(null);
	}

}
