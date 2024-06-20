package com.annotations;

import javax.persistence.*;


@Entity
@Table(name="students")
public class Student {
	@Id
	private int id;
	
	private String name;
	private String city;
	private Certificate certifi;
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public Student() {
		super();
		// default ctor
	}
	
	public Certificate getCertifi() {
		return certifi;
	}

	public void setCertifi(Certificate certifi) {
		this.certifi = certifi;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.city;
	}
}
