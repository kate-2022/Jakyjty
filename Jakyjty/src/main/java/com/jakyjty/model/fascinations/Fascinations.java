package com.jakyjty.model.fascinations;

import java.util.Set;

import com.jakyjty.model.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Fascinations {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Set<String> fascinations;

	
	@ManyToOne(targetEntity=User.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "USER_ID", referencedColumnName= "userID")
	private User user;
	
}
