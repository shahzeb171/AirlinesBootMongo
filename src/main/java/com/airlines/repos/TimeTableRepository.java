package com.airlines.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.airlines.pojos.Time_Table;

public interface TimeTableRepository extends MongoRepository<Time_Table, Integer> {

	List<Time_Table> findByArrivalCcodeAndDepartureCcode(String ar,String dep);
}
