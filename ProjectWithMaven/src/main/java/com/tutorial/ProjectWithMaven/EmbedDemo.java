package com.tutorial.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Student student = new Student();
		student.setId(1);
		student.setName("Ram");
		student.setCity("Lucknow");
		
		Certificate certi = new Certificate();
		certi.setCourse("Python");
		certi.setDuration("2months");
		student.setCertificate(certi);
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Shyam");
		student1.setCity("Delhi");
		
		Certificate certi1 = new Certificate();
		certi1.setCourse("Hibernate");
		certi1.setDuration("1month");
		student1.setCertificate(certi1);
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(student);
		session.persist(student1);
		tx.commit();
		
		session.close();
		factory.close();
	}
}
