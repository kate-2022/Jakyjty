package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;

import com.jakyjty.model.user.User;

public interface IUserDao extends CrudRepository<User, Long> {

}
