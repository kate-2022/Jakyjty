package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserSessions;

public interface IUserSessionsRepository extends CrudRepository<UserSessions, Long> {

}
