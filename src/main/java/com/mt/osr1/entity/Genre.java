package com.mt.osr1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Genre {
	
	@Id
	private int gid;
	private String name;

//	@OneToMany(mappedBy="genre", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//	public List<Movie> getList() {
//		return list;
//	}
//
//	public void setList(List<Movie> list) {
//		this.list = list;
//	}
//	List<Movie> list;
	
	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Genre(int gid, String name) {
		super();
		this.gid = gid;
		this.name = name;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
