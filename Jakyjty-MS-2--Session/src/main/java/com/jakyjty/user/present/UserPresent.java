package com.jakyjty.user.present;


import java.io.Serializable;

import com.jakyjty.model.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPresent implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	@NonNull
	private Boolean online= false;
	
    @OneToOne(mappedBy = "userPresent")
    private User user;

	@Override
	public String toString() {
		return "UserPresent [id=" + id + ", online=" + online + ", user=" + user + "]";
	}

}

