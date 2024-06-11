package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.AmountSpend;

public interface IAmountSpendDao extends CrudRepository<AmountSpend, Long> {

}
