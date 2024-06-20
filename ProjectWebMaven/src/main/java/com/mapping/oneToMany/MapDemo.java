package com.mapping.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.oneToOne.Question;

public class MapDemo {

	public static void main(String[] args) {
		 SessionFactory factory = new Configuration()
	        		.configure("hibernate.cfg.xml")
	        		.buildSessionFactory();
		 
		 //creating question 1
		 Question1 q1=new Question1();
		 q1.setQuestionId(1111);
		 q1.setQuestion("What is java?");
		 
		 //creating answer
		 Answer1 a1=new Answer1();
		 a1.setAnswerId(32);
		 a1.setAnswer("Java is programming language?");
		 a1.setQuestion(q1);
		
		 
		 Answer1 a2=new Answer1();
		 a2.setAnswerId(34);
		 a2.setAnswer("with the help of java we can create softwares");
		 a2.setQuestion(q1);
		
		 Answer1 a3=new Answer1();
		 a3.setAnswerId(36);
		 a3.setAnswer("Java has different type of framework");
		 a3.setQuestion(q1);
		 
		 List<Answer1> list=new ArrayList<Answer1>();
		 list.add(a1);
		 list.add(a2);
		 list.add(a3);
		 
		 q1.setAnswer(list);
		
		 //session
		 Session session=factory.openSession();
		 Transaction tx = session.beginTransaction();
		// save
//		 session.save(q1); 
//		 session.save(a1);
//		 session.save(a2);
//		 session.save(a3);
		
		
		
		 
		 //fetching
		 Question1 q=(Question1)session.get(Question1.class,1111);
		 for(Answer1 a:q.getAnswer()) {	//fetching answer using for each
		 System.out.println(a.getAnswer());
	 }
		 
		 tx.commit();
		 
		 factory.close();

	}

}
