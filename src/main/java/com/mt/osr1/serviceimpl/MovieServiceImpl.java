package com.mt.osr1.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.mt.osr1.dao.MovieDao;
import com.mt.osr1.daoimpl.MovieDaoImpl;
import com.mt.osr1.entity.Movie;
import com.mt.osr1.exception.MovieException;
import com.mt.osr1.service.MovieService;

public class MovieServiceImpl implements MovieService{

	MovieDao obj = new MovieDaoImpl();
	@Override
	public void addMovie(Movie movie) throws MovieException {
		// TODO Auto-generated method stub
		obj.addMovie(movie);
	}

	@Override
	public List<Movie> displayAllMovies() throws MovieException {
		// TODO Auto-generated method stub
		return obj.displayAllMovies();
	}
	
	public List<Movie> displayMoviesByGenre(int id) throws MovieException
	{
		List<Movie> list= new ArrayList<Movie>();
		list = obj.displayAllMovies();
		List<Movie> newlist = new ArrayList<Movie>();
		for(Movie m: list)
		{
			if(m.getGenre().getGid()==id)
				newlist.add(m);
		}
		return newlist;
		
	}
	
	public List<Movie> displayMoviesByBoxoffice() throws MovieException
	{
		List<Movie> list= new ArrayList<Movie>();
		list = obj.displayAllMovies();
		List<Movie> newlist1= new ArrayList<Movie>();
	    Collections.sort(list);
	    
		return list;
		
	}
	public void updateMovie(int id, int boxoffice) throws MovieException
	{
		obj.updateMovie(id, boxoffice);
	}
}
	

