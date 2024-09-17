package com.jakyjty.model.amountspend;

import com.jakyjty.model.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmountSpend implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	@NonNull
	private Double amountSpendTotal;
	
	@OneToOne (mappedBy = "amountSpend")
	User user;

	@Override
	public String toString() {
		return "AmountSpend [id=" + id + ", amountSpendTotal=" + amountSpendTotal + ", user=" + user + "]";
	}
	
	
	
}
