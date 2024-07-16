package com.jakyjty.model.user;

import java.util.List;

import com.jakyjty.model.age.UserAge;
import com.jakyjty.model.amountspend.AmountSpend;
import com.jakyjty.model.dateofentry.DateOfEntry;
import com.jakyjty.model.fascinations.Fascinations;
import com.jakyjty.model.gender.UserGender;
import com.jakyjty.model.preference.UserPreference;
import com.jakyjty.model.present.UserPresent;
import com.jakyjty.model.sessions.UserSessions;

import lombok.NonNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userID;	
	
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "age_id", referencedColumnName = "id")
	private UserAge age;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "gender_id", referencedColumnName = "id")
	private UserGender gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "dateOfEntry_id", referencedColumnName = "id")
	private DateOfEntry dateOE;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "userPresent_id", referencedColumnName = "id")
	private UserPresent present;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "amountSpend_id", referencedColumnName = "id")
	private AmountSpend amount;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "userPreference_id", referencedColumnName = "id")
	private UserPreference preference;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = false)
	private List<UserSessions> sessions;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = false)
	private List<Fascinations> funAndFokus;
	
	
	

}
