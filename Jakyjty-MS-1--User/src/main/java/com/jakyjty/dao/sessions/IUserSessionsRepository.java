package com.jakyjty.dao.sessions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.jakyjty.model.sessions.UserSessions;

public interface IUserSessionsRepository extends PagingAndSortingRepository<UserSessions, Long> {

}
