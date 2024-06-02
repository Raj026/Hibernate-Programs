package com.tutorial.ProjectWithMaven;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "student_details")
//this name param is used for giving a specific name for table 
public class Student {
	@Id
	private int id;
	private String name;
	private String city;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
