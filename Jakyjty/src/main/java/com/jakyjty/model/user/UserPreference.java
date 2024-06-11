package com.jakyjty.model.user;

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
public class UserPreference {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userID;	
	
	private String preference;
	
	@OneToOne(mappedBy = "userPreference")
	User user;
	
	

}
