package com.airlines.repos;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.airlines.pojos.Cities;

public interface CitiesRepository extends MongoRepository<Cities, String> {

}
