package com.tutorial.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		//get, load
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student = (Student) session.get(Student.class, 101);
		//can also use load instead of get.
		//load throws error but not null if object is not found which is more feasible than using get method.
		//if you are sure that the object exists in db then use load otherwise use get method.
		
		Address add = (Address) session.get(Address.class, 1);
		System.out.println(add.toString());
		
		
		System.out.println(student);
		session.close();
		factory.close();
	}
}
