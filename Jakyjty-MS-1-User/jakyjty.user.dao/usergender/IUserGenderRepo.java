package com.jakyjty.dao.usergender;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jakyjty.model.gender.UserGender;

public interface IUserGenderRepo extends JpaRepository<UserGender, Long> {

}
