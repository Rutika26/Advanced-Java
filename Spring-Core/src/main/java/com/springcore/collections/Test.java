package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		System.out.println("hello");
		Emp emp =(Emp)context.getBean("emp1");
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourse());
		System.out.println(emp.getProps());
		System.out.println(emp.getPhones().getClass().getName());
	}

}
