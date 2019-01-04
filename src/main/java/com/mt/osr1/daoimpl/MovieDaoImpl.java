package com.mt.osr1.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.mt.osr1.connection.Connect;
import com.mt.osr1.dao.ActorDao;
import com.mt.osr1.dao.MovieDao;
import com.mt.osr1.entity.Actor;
import com.mt.osr1.entity.Movie;
import com.mt.osr1.exception.MovieException;

public class MovieDaoImpl implements MovieDao {

	@Override
	public void addMovie(Movie movie) throws MovieException {
		Connect c= new Connect();
		SessionFactory factory;
		factory = c.getConnection();
		Session session=factory.openSession();
		try
		{
			System.out.println("adding genre details");
			session.beginTransaction();
			System.out.println("trans");
			System.out.println(movie);
			if(movie.getMid()==0)
			 throw new MovieException("null values are not allowed");
			if(movie.getGenre().getGid()==0)
				throw new MovieException("null values are not allowed");
			if(movie.getMname()!="")
				throw new MovieException("null values are not allowed");
			session.save(movie);
			System.out.println("save");
			session.getTransaction().commit();
			System.out.println("saved");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public List<Movie> displayAllMovies() throws MovieException {
		Session session=null;
		List<Movie> emplist=new ArrayList<Movie>();
		Connect c=new Connect();
		SessionFactory factory=c.getConnection();
		Session session1=factory.openSession();
		session1.beginTransaction();
		System.out.println("displayquery");
		emplist=session1.createQuery("from Movie").list();
		System.out.println(emplist);
		if(emplist==null)
			throw new MovieException("empty list");
		System.out.println("displayed");
		session1.getTransaction().commit();
		session1.close();
		return emplist;

	}
	
	public void updateMovie(int id, int boxoffice) throws MovieException {
		// TODO Auto-generated method stub
		Connect c=new Connect();
		SessionFactory factory=c.getConnection();
		Session session=factory.openSession();
		Movie m = session.load(Movie.class, id);
		if(m==null)
			throw new MovieException("no such movie");
    	session.beginTransaction();
		session.saveOrUpdate(m);
		session.getTransaction().commit();
		session.close();
		System.out.println("Update successfully");
}

}
