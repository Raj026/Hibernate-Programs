package com.tutorial.mapping;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eid;
	@Column(name = "employee_name")
	private String employeeName;
	
	@ManyToMany
	@JoinTable(
			name = "emp_projects",
			joinColumns = {@JoinColumn(name = "eid")},
			inverseJoinColumns = {@JoinColumn(name = "pid")}
	)
	//join table annotation is used to change the table name of the m2m table
	//one employee can have many projects
	private List<Project> projects;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String employeeName, List<Project> projects) {
		super();
		this.eid = eid;
		this.employeeName = employeeName;
		this.projects = projects;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
