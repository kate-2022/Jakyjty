package com.jakyjty.dao.userpresent;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.present.UserPresent;

public interface IUserPresentRepo extends CrudRepository<UserPresent, Long> {

}
