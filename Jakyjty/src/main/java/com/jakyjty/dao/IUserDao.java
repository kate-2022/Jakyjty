package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.User;

public interface IUserDao extends CrudRepository<User, Integer> {

}
