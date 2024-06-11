package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.AmountSpend;

public interface IAmountSpendRepo extends CrudRepository<AmountSpend, Long> {

}
