package com.airlines.repos;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.airlines.pojos.Flights;

public interface FlightsRepository extends MongoRepository<Flights, String> {

}
