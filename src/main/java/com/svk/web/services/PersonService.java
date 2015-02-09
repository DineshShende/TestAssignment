package com.svk.web.services;

import java.util.Collection;

import com.svk.web.persistence.PersonPersistence;

public interface PersonService {

	public void addPerson(long id,String name,String city);
	public PersonPersistence getPersonById(long id);
	public void deletePerson(long id);
	public void deleteAll();
	public Collection<PersonPersistence> getAllPersons();
}
