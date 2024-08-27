package com.springcore.auto.wire;

public class Emp {

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
