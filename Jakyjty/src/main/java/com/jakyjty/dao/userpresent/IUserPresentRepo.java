package com.jakyjty.dao.userpresent;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakyjty.model.present.UserPresent;

public interface IUserPresentRepo extends JpaRepository<UserPresent, Long> {

}
