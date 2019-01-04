package com.mt.osr1.dao;

import java.util.List;

import com.mt.osr1.entity.Genre;
import com.mt.osr1.exception.MovieException;

public interface GenreDao {
	
	public void addGenre(Genre genre) throws MovieException;
	public List<Genre> displayAllGenres() throws MovieException;
	

}
