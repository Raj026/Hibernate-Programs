package com.tutorial.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating objects
		Question q1 = new Question();
		q1.setQuestionId(11);
		q1.setQuestion("What is Java");
		
		
		Answer ans = new Answer();
		ans.setAnswerId(12);
		ans.setAnswer("Java is a programming language");
		ans.setQuestion(q1);
		
		q1.setAnswer(ans);
		
		//another question
		Question q2 = new Question();
		q2.setQuestionId(22);
		q2.setQuestion("What is OOPS");
		
		
		Answer ans1 = new Answer();
		ans1.setAnswerId(13);
		ans1.setAnswer("OOPS stands for Object Oriented Programming");
		ans1.setQuestion(q2);
		
		q2.setAnswer(ans1);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.persist(ans1);
		s.persist(ans);
		s.persist(q1);
		s.persist(q2);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
