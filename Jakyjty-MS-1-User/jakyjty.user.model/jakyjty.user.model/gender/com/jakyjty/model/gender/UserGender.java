package com.jakyjty.model.gender;


import java.io.Serializable;

import com.jakyjty.model.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGender implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	private String gender;
	
	@OneToOne(mappedBy= "userGender")
	User user;

	@Override
	public String toString() {
		return "UserGender [id=" + id + ", gender=" + gender + ", user=" + user + "]";
	}

}
