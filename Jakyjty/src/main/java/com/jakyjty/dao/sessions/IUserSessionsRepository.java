package com.jakyjty.dao.sessions;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.sessions.UserSessions;

public interface IUserSessionsRepository extends CrudRepository<UserSessions, Long> {

}
