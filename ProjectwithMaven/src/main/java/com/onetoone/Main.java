package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	 public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory= configuration.buildSessionFactory();
		
		Question question=new Question();
		question.setQid(101);
		question.setQuestion("What is java?");
		
		Answer answer=new Answer();
		answer.setAid(201);
		answer.setAnswer("Java is Programming Language");
		answer.setQuestion(question);
		question.setAnswer(answer);
		
		Session session= factory.openSession();
	
		session.beginTransaction();
		
		session.save(question);
		session.save(answer);
//		System.out.println(question.getQuestion());
//		System.out.println(answer.getAnswer());
		
		session.getTransaction().commit();
		
		Question q1=(Question) session.get(Question.class, 101);
		System.out.println(q1.getQuestion());
		System.out.println(q1.getAnswer().getAnswer());
		session.close();
		factory.close();
		System.out.println("Done.......");
	}
	
}
