package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserPresent;

public interface IUserPresent extends CrudRepository<UserPresent, Long> {

}
