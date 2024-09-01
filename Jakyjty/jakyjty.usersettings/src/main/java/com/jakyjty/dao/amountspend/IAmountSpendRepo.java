package com.jakyjty.dao.amountspend;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakyjty.model.amountspend.AmountSpend;

public interface IAmountSpendRepo extends JpaRepository<AmountSpend, Long> {

}
