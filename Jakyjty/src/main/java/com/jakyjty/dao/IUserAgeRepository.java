package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserAge;

public interface IUserAgeRepository extends CrudRepository<UserAge, Long> {

}
