package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// afterPropertiesSet() does the work of init()
		
		System.out.println("Pepsi : afterPropertiesSet()= init()");
		
	}

	public void destroy() throws Exception {
		System.out.println("Pepsi :destroy() = destroy()");
		
	}
	
	
}
