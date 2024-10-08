package com.jakyjty.model.fascinations;

import java.io.Serializable;
import java.util.Set;

import com.jakyjty.model.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fascinations implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Set<String> fascinations;

	
	@ManyToOne(targetEntity=User.class, cascade=CascadeType.ALL, fetch= FetchType.LAZY)
	private User user;


	@Override
	public String toString() {
		return "Fascinations [id=" + id + ", fascinations=" + fascinations + ", user=" + user + "]";
	}
	
}
