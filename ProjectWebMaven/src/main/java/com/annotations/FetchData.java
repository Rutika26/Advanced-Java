package com.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 Session session = factory.openSession();
		 
		//fetch data using get()
		 //get() it returns null if object is not found in cache as well as DB
		Student student = (Student)session.get(Student.class, 101);
		System.out.println(student.getName() + " "+ student.getCity());
		
		Student student1 = (Student)session.get(Student.class, 101);
		//it will fetch data from current session...no need to go in DB 
		System.out.println(student1.getName() + " "+ student1.getCity());
		
		
		//fetch data using load()
		 //get() it will throw ObjectNotFoundException if object is not found in cache 
		//as well as DB
		Student student2 = (Student)session.load(Student.class, 101);//exception
		//lazy initialization
		Student student3 = (Student)session.load(Student.class, 101);//exception
		System.out.println(student3);
		
		
		
		
		 }
}
