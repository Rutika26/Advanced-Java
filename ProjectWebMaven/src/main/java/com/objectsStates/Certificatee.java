package com.objectsStates;

import javax.persistence.Embeddable;

@Embeddable
public class Certificatee {
	private String course;
	private String duration;
	public Certificatee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificatee(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
