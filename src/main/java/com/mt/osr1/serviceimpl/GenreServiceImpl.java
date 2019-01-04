package com.mt.osr1.serviceimpl;

import java.util.List;

import com.mt.osr1.dao.GenreDao;
import com.mt.osr1.daoimpl.GenreDaoImpl;
import com.mt.osr1.entity.Genre;
import com.mt.osr1.exception.MovieException;
import com.mt.osr1.service.GenreService;

public class GenreServiceImpl implements GenreService {

	GenreDao obj= new GenreDaoImpl();
	@Override
	public void addGenre(Genre genre) throws MovieException {
		// TODO Auto-generated method stub
        obj.addGenre(genre);
	}

	@Override
	public List<Genre> displayAllGenres() throws MovieException {
		// TODO Auto-generated method stub
		return obj.displayAllGenres();
	}

}
