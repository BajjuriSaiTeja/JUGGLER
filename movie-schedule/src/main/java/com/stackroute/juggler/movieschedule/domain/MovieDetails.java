package com.stackroute.juggler.movieschedule.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDetails {
	
	@Id
	private String movieId;
	private String movieName;
	private String moviePoster;
	private String movieReleaseDate;
	private String movieDuration;
	private String Hero;
	private String Heroine;
	private String Director;
	private String[] movieGenre;
	private String synopsis;
	private String format;
	private String[] language;

}
