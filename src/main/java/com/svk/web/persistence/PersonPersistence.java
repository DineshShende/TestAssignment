package com.svk.web.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import com.svk.web.type.Person;

@Entity
@Table(name="person_table")
public class PersonPersistence extends Person {

	
	public PersonPersistence() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonPersistence(long id,String name,String city) {
		// TODO Auto-generated constructor stub
		super(id, name, city);
	}
	
	@Id
	@GeneratedValue
	@Column(name="person_id")
	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	@Column(name="person_name")
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	@Column(name="person_city")
	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return super.getCity();
	}

}
