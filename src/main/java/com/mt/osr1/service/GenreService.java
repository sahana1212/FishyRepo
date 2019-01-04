package com.mt.osr1.service;

import java.util.List;

import com.mt.osr1.entity.Genre;
import com.mt.osr1.exception.MovieException;

public interface GenreService {
	
	
	public void addGenre(Genre genre) throws MovieException;
	public List<Genre> displayAllGenres() throws MovieException;
	

}
