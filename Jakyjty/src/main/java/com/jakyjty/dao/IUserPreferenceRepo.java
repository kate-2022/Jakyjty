package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserPreference;

public interface IUserPreferenceRepo extends CrudRepository<UserPreference, Long> {

}
