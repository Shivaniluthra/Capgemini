package com.jdbclabbook.lab3.bean;

public class Author {
	private int ID;
	private String name;
	public Author(String name) {
		super();
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
