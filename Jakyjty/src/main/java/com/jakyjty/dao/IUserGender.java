package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserGender;

public interface IUserGender extends CrudRepository<UserGender, Long> {

}
