package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("temp2")
	private Address address;
	

	public Emp(Address address) {
		super();
		System.out.println("ctor injection");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("setting injection");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
