package com.jakyjty.dao.amountspend;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.amountspend.AmountSpend;

public interface IAmountSpendRepo extends CrudRepository<AmountSpend, Long> {

}
