package com.mt.osr1.dao;

import java.util.List;

import com.mt.osr1.entity.Actor;
import com.mt.osr1.entity.Movie;
import com.mt.osr1.exception.MovieException;

public interface MovieDao {
	

	public void addMovie(Movie movie) throws MovieException;
	public List<Movie> displayAllMovies() throws MovieException;
	public void updateMovie(int id, int boxoffice) throws MovieException;
}

