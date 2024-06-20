package com.annotations;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AppTest 
{
    public static void main( String[] args ) throws IOException
    {
    
        System.out.println( "Project started" );
        SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.buildSessionFactory();
        System.out.println(factory);
        
    
        System.out.println(factory.isClosed());
        
        //creating student
        Student st =  new Student();
        st.setId(101);
        st.setName("Sukanya");
        st.setCity("mumbai");
        
        System.out.println(st);
        
        Address ad =  new Address();
        ad.setStreet("street12");
        ad.setCity("Pune");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.444);
        System.out.println(ad);
        
        //reading image
        @SuppressWarnings("resource")
		FileInputStream fs = new FileInputStream("src/main/java/1.jpg");
        byte[] data=new byte[fs.available()];
        fs.read();
        ad.setImage(data);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
       
        session.close();
    
    }
}
