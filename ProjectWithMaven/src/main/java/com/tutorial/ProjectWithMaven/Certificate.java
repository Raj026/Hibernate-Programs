package com.tutorial.ProjectWithMaven;

import jakarta.persistence.Embeddable;

@Embeddable
//This annotation will simply embed itself it to another class and add extra two columns to that table.
public class Certificate {
	private String course;
	private String duration;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
}
