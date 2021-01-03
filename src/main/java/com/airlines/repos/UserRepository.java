package com.airlines.repos;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.airlines.pojos.Users;


public interface UserRepository extends MongoRepository<Users, String> {
Users findByUsername(String username);
}
