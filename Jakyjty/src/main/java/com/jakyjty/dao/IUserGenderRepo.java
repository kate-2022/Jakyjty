package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.UserGender;

public interface IUserGenderRepo extends CrudRepository<UserGender, Long> {

}
