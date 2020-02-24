package com.javalabbook.lab10;

import java.util.function.Supplier;

class Person{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Exercise4 {
	public static void main(String[] args) {
		Supplier<Person> p = Person::new;		//using method reference
		//p.get().setId(1);
		System.out.println(p.get().getId());

	}
}
