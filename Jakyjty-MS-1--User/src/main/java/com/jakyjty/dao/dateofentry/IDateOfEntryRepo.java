package com.jakyjty.dao.dateofentry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jakyjty.model.dateofentry.DateOfEntry;

public interface IDateOfEntryRepo extends CrudRepository<DateOfEntry, Long> {

}
