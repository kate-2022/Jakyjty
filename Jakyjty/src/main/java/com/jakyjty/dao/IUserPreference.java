package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserPreference;

public interface IUserPreference extends CrudRepository<UserPreference, Long> {

}
