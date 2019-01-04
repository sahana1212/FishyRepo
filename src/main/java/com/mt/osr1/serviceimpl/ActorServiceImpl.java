package com.mt.osr1.serviceimpl;

import java.util.List;

import com.mt.osr1.dao.ActorDao;
import com.mt.osr1.daoimpl.ActorDaoImpl;
import com.mt.osr1.entity.Actor;
import com.mt.osr1.exception.MovieException;
import com.mt.osr1.service.ActorService;

public class ActorServiceImpl implements ActorService {

	ActorDao obj = new ActorDaoImpl();
	@Override
	public void addActor(Actor actor) throws MovieException {
		// TODO Auto-generated method stub
		if(actor.getAge()>14)
			throw new MovieException("age must be greater than 144");
		obj.addActor(actor);

	}

	@Override
	public List<Actor> displayAllActor() throws MovieException {
		// TODO Auto-generated method stub
		return obj.getAllActors();
	}

}
