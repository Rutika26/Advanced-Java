package com.springcore.ctorinjection;

public class Certi {
	String name;

	public Certi(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
}
