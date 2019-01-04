package com.mt.osr1.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.mt.osr1.entity.Actor;
import com.mt.osr1.entity.Genre;
import com.mt.osr1.entity.Movie;
import com.mt.osr1.exception.MovieException;

public class Connect {
	
	public SessionFactory getConnection() throws MovieException
	{
		System.out.println("hi inside session");
		return (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Genre.class).addAnnotatedClass(Movie.class).addAnnotatedClass(Actor.class).buildSessionFactory();
	}

}
