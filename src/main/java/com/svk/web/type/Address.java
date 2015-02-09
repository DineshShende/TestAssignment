package com.svk.web.type;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ADDRESS", uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7936912073376609233L;

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "zipcode")
	private String zipcode;

	public Address() {

	}

	public Address(long id,String street, String city, String state, String zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}

