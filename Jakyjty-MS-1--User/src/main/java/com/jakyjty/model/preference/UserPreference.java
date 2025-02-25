package com.jakyjty.model.preference;

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
public class UserPreference implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userID;	
	
	private String preference;
	
	@OneToOne(mappedBy = "userPreference")
	User user;

	@Override
	public String toString() {
		return "UserPreference [userID=" + userID + ", preference=" + preference + ", user=" + user + "]";
	}
	
	

}
