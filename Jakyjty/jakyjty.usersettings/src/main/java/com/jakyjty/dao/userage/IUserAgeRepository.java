package com.jakyjty.dao.userage;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakyjty.model.age.UserAge;

public interface IUserAgeRepository extends JpaRepository<UserAge, Long> {

}
