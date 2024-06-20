package com.objectsStates;

import javax.persistence.*;


@Entity
@Table(name="studentt")
public class Studentt {
	@Id
	private int id;
	
	private String name;
	private String city;
	private Certificatee certificatee;
	
	public Studentt(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	public Studentt() {
		super();
		// default ctor
	}
	
	public Certificatee getCertificatee() {
		return certificatee;
	}

	public void setCertificatee(Certificatee certificatee) {
		this.certificatee = certificatee;
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
