package com.mt.osr1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Movie implements Comparable<Movie>{
	
	@Id
	private int mid;
	private String mname;
	private int actors;
	private String type;
	private int boxoffice;
	
	@ManyToOne
	private Genre genre;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int mid, String mname, int actors, String type, int boxoffice, Genre genre) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.actors = actors;
		this.type = type;
		this.boxoffice = boxoffice;
		this.genre = genre;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getActors() {
		return actors;
	}

	public void setActors(int actors) {
		this.actors = actors;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBoxoffice() {
		return boxoffice;
	}

	public void setBoxoffice(int boxoffice) {
		this.boxoffice = boxoffice;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", actors=" + actors + ", type=" + type + ", boxoffice="
				+ boxoffice + ", genre=" + genre + "]";
	}

	@Override
	public int compareTo(Movie movie) {
		// TODO Auto-generated method stub
		if(this.boxoffice > movie.boxoffice)
			return 1;
		else if(this.boxoffice== movie.boxoffice)
			return 0;
		else 
			return -1;
	}
	
	
	

}
