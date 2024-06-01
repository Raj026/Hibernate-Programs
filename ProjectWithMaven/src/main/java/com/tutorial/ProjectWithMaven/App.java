package com.tutorial.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
//        As the build SessionFactory is an interface we need to get it with other class Configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//        System.out.println(factory);
//        System.out.println(factory.isClosed());
		// creating student
		Student st = new Student();
		st.setId(101);
		st.setName("John");
		st.setCity("Ahmedabad");
		System.out.println(st);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(st);
		tx.commit();

		session.close();

	}
}
