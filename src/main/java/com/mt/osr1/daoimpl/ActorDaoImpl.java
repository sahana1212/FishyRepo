package com.mt.osr1.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mt.osr1.connection.Connect;
import com.mt.osr1.dao.ActorDao;
import com.mt.osr1.entity.Actor;
import com.mt.osr1.entity.Genre;
import com.mt.osr1.exception.MovieException;

public class ActorDaoImpl implements ActorDao {

	@Override
	public void addActor(Actor actor) throws MovieException {
		// TODO Auto-generated method stub
		Connect c= new Connect();
		SessionFactory factory=c.getConnection();
		Session session=factory.openSession();
		try
		{
			System.out.println("adding genre details");
			session.beginTransaction();
			System.out.println("trans");
			System.out.println(actor);
			if(actor.getAid()==0)
				throw new MovieException("no null value allowed");
			if(actor.getAname()==null)
				throw new MovieException("no null value allowed");
			session.save(actor);
			System.out.println("save");
			session.getTransaction().commit();
			System.out.println("saved");
		}
		finally {
			session.close();
		}

	}

	@Override
	public List<Actor> getAllActors() throws MovieException {
		Session session=null;
		List<Actor> emplist=new ArrayList<Actor>();
		Connect c=new Connect();
		SessionFactory factory=c.getConnection();
		Session session1=factory.openSession();
		session1.beginTransaction();
		System.out.println("displayquery");
		emplist=session1.createQuery("from Actor").list();
		System.out.println(emplist);
		System.out.println("displayed");
		session1.getTransaction().commit();
		session1.close();
		return emplist;
	}

}
