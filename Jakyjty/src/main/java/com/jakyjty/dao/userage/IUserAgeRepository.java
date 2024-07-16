package com.jakyjty.dao.userage;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.age.UserAge;

public interface IUserAgeRepository extends CrudRepository<UserAge, Long> {

}
