package com.jakyjty.dao.userpreference;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.preference.UserPreference;

public interface IUserPreferenceRepo extends CrudRepository<UserPreference, Long> {

}
