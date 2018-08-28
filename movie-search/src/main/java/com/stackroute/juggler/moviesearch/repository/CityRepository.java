package com.stackroute.juggler.moviesearch.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.kafka.domain.City;

//declaring it as repository
@Repository   
	public interface CityRepository extends CrudRepository<City,String> {
	
	public List<City> getBycityName(String city);
		
	}