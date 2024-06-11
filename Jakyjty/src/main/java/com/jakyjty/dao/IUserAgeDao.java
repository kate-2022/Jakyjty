package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserAge;

public interface IUserAgeDao extends CrudRepository<UserAge, Long> {

}
