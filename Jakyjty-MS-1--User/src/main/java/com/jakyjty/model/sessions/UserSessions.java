package com.jakyjty.model.sessions;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import com.jakyjty.model.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSessions implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	static int sessions = 0;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	@NonNull
	private Integer noOfSessions;
	private LocalDateTime date;
	
	private Set<LocalDateTime>userSessions;

    @ManyToOne(targetEntity= User.class, cascade = CascadeType.ALL)
    private User user;

	@Override
	public String toString() {
		return "UserSessions [id=" + id + ", noOfSessions=" + noOfSessions + ", date=" + date + ", userSessions="
				+ userSessions + ", user=" + user + "]";
	}
 	

}
