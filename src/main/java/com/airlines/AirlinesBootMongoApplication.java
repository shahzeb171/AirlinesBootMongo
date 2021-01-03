package com.airlines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages= {"com.airlines.repos"})
@ComponentScan(basePackages= {"com.airlines.*"})
public class AirlinesBootMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesBootMongoApplication.class, args);
	}
}
