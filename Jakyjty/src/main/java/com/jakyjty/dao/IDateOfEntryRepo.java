package com.jakyjty.dao;

import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.user.DateOfEntry;

public interface IDateOfEntryRepo extends CrudRepository<DateOfEntry, Long> {

}
