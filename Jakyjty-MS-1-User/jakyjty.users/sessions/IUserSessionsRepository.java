package com.jakyjty.dao.sessions;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakyjty.model.sessions.UserSessions;

public interface IUserSessionsRepository extends JpaRepository<UserSessions, Long> {

}
