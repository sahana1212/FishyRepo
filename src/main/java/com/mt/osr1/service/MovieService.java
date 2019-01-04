package com.mt.osr1.service;

import java.util.List;

import com.mt.osr1.entity.Movie;
import com.mt.osr1.exception.MovieException;

public interface MovieService {
	

	public void addMovie(Movie movie) throws MovieException;
	public List<Movie> displayAllMovies()throws MovieException;
	public List<Movie> displayMoviesByGenre(int id) throws MovieException;
	public List<Movie> displayMoviesByBoxoffice() throws MovieException;
	public void updateMovie(int id, int boxoffice) throws MovieException;
}
