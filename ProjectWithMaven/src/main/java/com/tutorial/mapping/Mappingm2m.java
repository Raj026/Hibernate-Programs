package com.tutorial.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Mappingm2m {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(19);
		e1.setEmployeeName("Ram");
		
		e2.setEid(20);
		e2.setEmployeeName("Shyam");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(22);
		p1.setProjectName("Library Management System");
		p2.setPid(24);
		p2.setProjectName("CHATBOT");

		List<Emp> l1 = new ArrayList<Emp>();
		List<Project> l2 = new ArrayList<Project>();
		
		l1.add(e1);
		l1.add(e2);
		
		l2.add(p1);
		l2.add(p2);
		
		//Set Projects
		e1.setProjects(l2);
		p2.setEmps(l1);
		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.persist(e1);
		s.persist(e2);
		s.persist(p1);
		s.persist(p2);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
