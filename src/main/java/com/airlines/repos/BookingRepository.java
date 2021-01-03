package com.airlines.repos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.airlines.pojos.Bookings;

public interface BookingRepository extends MongoRepository<Bookings, Integer> {

	List<Bookings> findAllByUsernameOrderByBsno(String username);
	
	Integer removeByBsnoAndUsername(int bsno,String username);
	
	Bookings findByUsernameAndBsno(String username,int bsno);
	
}
