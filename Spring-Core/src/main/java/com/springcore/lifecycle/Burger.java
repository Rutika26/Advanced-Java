package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Burger {
	private double price;

	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Burger [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Burger : init()");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Burger : destroy()");
	}
	
}
