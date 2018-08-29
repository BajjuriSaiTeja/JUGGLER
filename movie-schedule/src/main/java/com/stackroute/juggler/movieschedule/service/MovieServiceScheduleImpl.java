package com.stackroute.juggler.movieschedule.service;

import java.util.List;
import java.util.Map;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.juggler.kafka.domain.MovieDetails;
import com.stackroute.juggler.kafka.domain.MovieSchedule;
import com.stackroute.juggler.kafka.domain.Registration;
import com.stackroute.juggler.movieschedule.repository.MovieScheduleRepository;

@Service
public class MovieServiceScheduleImpl implements MovieScheduleService {

	private MovieScheduleRepository movieScheduleRepo;

	public MovieServiceScheduleImpl(MovieScheduleRepository movieScheduleRepo) {

		this.movieScheduleRepo = movieScheduleRepo;
	}

	// the method to add the movie-theatre schedule
	@Override
	public MovieSchedule addMovieSchedule(MovieSchedule movieShow) {
		MovieSchedule addMovie = movieScheduleRepo.save(movieShow);
		return addMovie;
	}

	// the method to get all movie-theatre schedules list
	@Override
	public List<MovieSchedule> getMoviesSchedule() {
		List<MovieSchedule> getMovies = (List<MovieSchedule>) movieScheduleRepo.findAll();
		return getMovies;

	}

	// the method to update the existing movie-theatre schedule
	@Override
	public MovieSchedule updateMovieSchedule(MovieSchedule updateMovie) {
		MovieSchedule update = movieScheduleRepo.save(updateMovie);
		return update;
	}

	// the method to listen the message from the specified kafka topic
	@Override
	@KafkaListener(topics = "testkafka", groupId = "grpid", containerFactory = "kafkaListenerContainerFactory")
	public void consumeKafka(Registration registration) {

		MovieSchedule addTheatre = null;

		if (movieScheduleRepo.getByTheatreName(registration.getTheatreName()) != null) {
			addTheatre = movieScheduleRepo.getByTheatreName(registration.getTheatreName());
			String theatreId = registration.getTheatreId();
			String theatreLocation = registration.getTheatreLocation();
			String theatreCity = registration.getTheatreCity();
			String theatreLicenseNo = registration.getTheatreLicenseNo();
			String noOfSeats = registration.getNumberOfSeats();
			Map<String, Integer> seats = registration.getSeats();
			addTheatre.setTheatreLocation(theatreLocation);
			addTheatre.setTheatreId(theatreId);
			addTheatre.setTheatreCity(theatreCity);
			addTheatre.setTheatreLicenseNo(theatreLicenseNo);
			addTheatre.setNumberOfSeats(noOfSeats);
			addTheatre.setSeats(seats);
			movieScheduleRepo.save(addTheatre);
			System.out.println(theatreLocation);

		}

	}

	@Override
	public MovieDetails addMovieDetails(MovieDetails movieDetails) {
		MovieDetails addMovieDetails = movieScheduleRepo.save(movieDetails);
		return addMovieDetails;
	}

	@Override
	public MovieSchedule getByTheatreName(String theatrename) {
		MovieSchedule m1 = movieScheduleRepo.getByTheatreName(theatrename);
		return m1;
	}
	
//	RestTemplate restTemplate = new RestTemplate();
//	String url = "http://localhost:8090/api/v1/getbytitle/movies";
//
//	@Override
//	public ResponseEntity<String> hello() {
//		ResponseEntity<String> list;
//		list = restTemplate.getForEntity(url, String.class);
//		return list;
//	}

}
