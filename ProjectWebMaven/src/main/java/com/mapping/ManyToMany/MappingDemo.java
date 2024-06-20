package com.mapping.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.buildSessionFactory();
		
		//creating employee
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.setEid(31);
		e1.setName("Ram");
		e2.setEid(32);
		e2.setName("Shyam");
		
		//creating project
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setPid(21);
		p1.setProjectName("Library Management System");
		p2.setPid(22);
		p2.setProjectName("Chat Bot");
		
		List<Emp> list1=new ArrayList<Emp>();
		List<Project> list2=new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmps(list1);
		
		
		
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		//save
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		
		factory.close();
	}

}
