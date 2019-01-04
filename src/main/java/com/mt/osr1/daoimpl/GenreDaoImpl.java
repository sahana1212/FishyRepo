package com.mt.osr1.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.mt.osr1.connection.Connect;
import com.mt.osr1.dao.GenreDao;
import com.mt.osr1.entity.Genre;
import com.mt.osr1.exception.MovieException;

public class GenreDaoImpl implements GenreDao{

	@Override
	public void addGenre(Genre genre) throws MovieException {
		// TODO Auto-generated method stub
		Connect c= new Connect();
		SessionFactory factory=c.getConnection();
		Session session=factory.openSession();
		try
		{
			System.out.println("adding genre details");
			session.beginTransaction();
			System.out.println("trans");
			System.out.println(genre);
			if(genre.getGid()==0)
				throw new MovieException("no null value allowed");
			if(genre.getName()==null)
				throw new MovieException("no null value allowed");
			session.save(genre);
			System.out.println("save");
			session.getTransaction().commit();
			System.out.println("saved");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public List<Genre> displayAllGenres() throws MovieException {
		Session session=null;
		List<Genre> emplist=new ArrayList<Genre>();
		Connect c=new Connect();
		SessionFactory factory=c.getConnection();
		Session session1=factory.openSession();
		session1.beginTransaction();
		System.out.println("displayquery");
		emplist=session1.createQuery("from Genre").list();
		System.out.println(emplist);
		if(emplist==null)
			throw new MovieException("no value retrieved");
		System.out.println("displayed");
		session1.getTransaction().commit();
		session1.close();
		return emplist;
	}
	
	

}
