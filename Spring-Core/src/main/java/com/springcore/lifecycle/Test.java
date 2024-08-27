package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		System.out.println("Using XML");
		Samosa samosa = (Samosa)context.getBean("samosa1");
		System.out.println(samosa);
		
		
		System.out.println("++++++++++++++++++++++++++++");
		
		Pepsi pepsi=(Pepsi)context.getBean("pepsi1");
		System.out.println("Using InitializingBean, DisposableBean interfaces");
		System.out.println(pepsi);
		
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("Using Annotations");
		Burger burger = (Burger)context.getBean("burger1");
		System.out.println(burger);
		
		context.registerShutdownHook();
	}

}
