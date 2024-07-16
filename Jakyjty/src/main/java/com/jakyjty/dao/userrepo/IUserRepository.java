package com.jakyjty.dao.userrepo;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;

import com.jakyjty.model.user.User;

public interface IUserRepository extends CrudRepository<User, Long> {

}
