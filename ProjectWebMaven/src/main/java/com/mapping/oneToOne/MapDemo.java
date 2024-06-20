package com.mapping.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		 SessionFactory factory = new Configuration()
	        		.configure("hibernate.cfg.xml")
	        		.buildSessionFactory();
		 
		 Question q1=new Question();
		 q1.setQuestionId(1111);
		 q1.setQuestion("What is java");
		 
		 Answer a1=new Answer();
		 a1.setAnswerId(32);
		 a1.setAnswer("Java is programming language");
		 a1.setQue(q1);
		 q1.setAns(a1);
		 
		 Question q2=new Question();
		 q2.setQuestionId(2222);
		 q2.setQuestion("What is collection framework");
		 
		 Answer a2=new Answer();
		 a2.setAnswerId(555);
		 a2.setAnswer("API to work with objects in java");
		 a2.setQue(q2);
		 q2.setAns(a2);
		 
		 Session session=factory.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 session.save(q1);
		 session.save(q2);
		 session.save(a1);
		 session.save(a2);
		 
		 tx.commit();
		 
		 //fetching
		 Question newQ=(Question)session.get(Question.class, 1111);
		 System.out.println(newQ.getQuestion());
		 System.out.println(newQ.getAns().getAnswer());
		
		 
		 factory.close();

	}

}
