package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserPresent;

public interface IUserPresentRepo extends CrudRepository<UserPresent, Long> {

}
