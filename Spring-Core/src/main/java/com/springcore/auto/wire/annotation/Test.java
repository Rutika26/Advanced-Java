package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/config.xml");

		// No need to time type context
		// Emp emp = context.getBean("emp1",Emp.class);
		
		Emp e1 = (Emp)context.getBean("emp1");
		System.out.println(e1);
	}
}
