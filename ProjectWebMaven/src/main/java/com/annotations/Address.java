package com.annotations;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="student_address")
public class Address {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(length=50,name="STREET")
	private String street;
	
	@Column(length=100,name="CITY")
	private String city;
	
	@Column(name="is_bool")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	private byte[] image;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	} 
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
}
