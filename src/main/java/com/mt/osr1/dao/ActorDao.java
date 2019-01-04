package com.mt.osr1.dao;

import java.util.List;

import com.mt.osr1.entity.Actor;
import com.mt.osr1.exception.MovieException;

public interface ActorDao {
	
	public void addActor(Actor actor) throws MovieException;
	public List<Actor> getAllActors() throws MovieException;

}
