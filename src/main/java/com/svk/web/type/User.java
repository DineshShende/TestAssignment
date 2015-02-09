package com.svk.web.type;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Model class for Person
 */
@Entity
@Table(name = "PERSON", uniqueConstraints = { @UniqueConstraint(columnNames = "personId") })
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1035118239732323193L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "personId")
	private long personId;

	@Column(name = "name",nullable=false,unique=true)
	private String name;
	
	@Column(name="mobile",unique=true)
	private String mobile;
	
	@Column(name="email",unique=true)
	private String email;
	
	@Column(name="password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private Address address;

	public User() {
	}

	public User(long personId,String name,String mobile,String email,String password, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
