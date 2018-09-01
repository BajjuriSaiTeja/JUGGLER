package com.stackroute.juggler.recommendation.domain;

import java.util.List;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Genre {
	@Id
	private String name;
	@Relationship(type = "isTypeOf", direction = Relationship.INCOMING)
	private List<Movie> movies;
	@Relationship(type = "follows", direction = Relationship.INCOMING)
	private List<User> users;

	public Genre() {

	}

	public Genre(String name) {
		super();
		this.name = name;
	}

	public Genre(String name, List<Movie> movies, List<User> users) {
		super();
		this.name = name;
		this.movies = movies;
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
