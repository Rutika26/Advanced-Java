package com.annotations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class EmbeddDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.buildSessionFactory();
		
		Student student = new Student();
		student.setId(111);
		student.setName("Reva saxena");
		student.setCity("Delhi");
		
		Certificate certi=new Certificate();
		certi.setCourse("DAC");
		certi.setDuration("1 year");
		student.setCertifi(certi);
		
		
		Student student1 = new Student();
		student1.setId(222);
		student1.setName("Rashi Tiwari");
		student1.setCity("Banglore");
		
		Certificate certi1=new Certificate();
		certi1.setCourse("DBDA");
		certi1.setDuration("2 year");
		student1.setCertifi(certi1);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(student);
		s.save(student1);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
