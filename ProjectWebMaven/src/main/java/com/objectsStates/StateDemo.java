package com.objectsStates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		SessionFactory fs = new Configuration().configure().buildSessionFactory();
		
		System.out.println("welcome");
		
		//creating student object 
		Studentt student=new Studentt();
		student.setId(10);
		student.setName("Revansh");
		student.setCity("Pune");
		student.setCertificatee(new Certificatee("Java hibernate","2 months"));
		//student : in Transient state
		
				
		Session s = fs.openSession();
		Transaction tx = s.beginTransaction();
		
		//s.save(student);
		//student : Persistent - session, DB
		student.setName("Netra"); //update query will fire for name
		tx.commit();	
		
//		s.close();
		student.setName("Reva"); //not update with DB after commit()
		//student : Detached state
		
		System.out.println(s.isOpen());
		s.delete(student);
		//student : removed state	
		
		System.out.println(s.isOpen());
		s.close();
		fs.close();
		

	}

}
