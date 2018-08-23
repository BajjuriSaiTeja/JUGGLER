package com.stackroute.juggler.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.juggler.domain.City;
import com.stackroute.juggler.domain.Movie;
import com.stackroute.juggler.repository.CityRepository;
import com.stackroute.juggler.repository.MovieRepository;

@Service
public class MovieSearchServiceImpl implements MovieSearchService {

	MovieRepository movieRepository;
	CityRepository cityRepository;

	@Autowired
	public MovieSearchServiceImpl(MovieRepository movieRepository, CityRepository cityrepository) {

		this.movieRepository = movieRepository;
		this.cityRepository = cityrepository;
	}

//	@Override
//	public List<Movie> getByTitle(String movieName) {
//
//		List<Movie> list = movieRepository.getBymovieName(movieName);
//		return list;
//	}

//	@Override
//	public Movie saveMovie(Movie movie)  {
//
//			Movie movieSaved = movieRepository.save(movie);
//			return movieSaved;
//		
//	}

//	@Override
//	public List<City> getByCity(String city) {
//
//		List<City> list = cityRepository.getBycityName(city);
//		return list;
//	}

	@Override
	public City saveCity(City city) {
		City cityToBeSave = cityRepository.save(city);
		return cityToBeSave;
	}

//	@Override
//	public List<Movie> getAllMovies() {
//		List<Movie> allmovies=(List<Movie>) movieRepository.findAll();
//		return allmovies;
//	}
//
	@Override
	public Movie saveMovie(Movie movie) {
		Movie movieSave= movieRepository.save(movie);
		return movieSave;
	}
	
	
}
