package com.mt.osr1.service;

import java.util.List;

import com.mt.osr1.entity.Actor;
import com.mt.osr1.exception.MovieException;

public interface ActorService {

	public void addActor(Actor actor) throws MovieException;
	public List<Actor> displayAllActor() throws MovieException;
}
