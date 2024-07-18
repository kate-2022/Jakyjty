package com.jakyjty.dao.userrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakyjty.model.user.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
