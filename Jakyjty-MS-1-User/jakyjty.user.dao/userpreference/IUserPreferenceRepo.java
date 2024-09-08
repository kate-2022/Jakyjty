package com.jakyjty.dao.userpreference;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakyjty.model.preference.UserPreference;

public interface IUserPreferenceRepo extends JpaRepository<UserPreference, Long> {

}
