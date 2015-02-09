package com.svk.web.services;

import java.util.Collection;

import org.apache.log4j.Logger;

import com.svk.web.persistence.Dao;
import com.svk.web.persistence.PersonPersistence;


public class PersonServiceImpl implements PersonService {

	private static final Logger logger = Logger.getLogger(PersonServiceImpl.class);
private Dao<PersonPersistence> dao;

public PersonServiceImpl(Dao<PersonPersistence> dao) {
	// TODO Auto-generated constructor stub
	this.dao=dao;
}
@Override
public void addPerson(long id, String name, String city) {
	// TODO Auto-generated method stub
	PersonPersistence personPer=new PersonPersistence();
	personPer.setId(id);
	personPer.setName(name);
	personPer.setCity(city);
	dao.insertOrUpdate(personPer);
	logger.info("person inserted"+ personPer.getName());
}

@Override
public void deletePerson(long id) {
	// TODO Auto-generated method stub
	dao.deleteById(id);
	logger.info("person deleted ");
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	dao.deleteAll();
	logger.info("All persons deleted ");
}

@Override
public Collection<PersonPersistence> getAllPersons() {
	// TODO Auto-generated method stub
	return dao.findAll();
	
}
@Override
public PersonPersistence getPersonById(long id) {

	// TODO Auto-generated method stub
	return dao.get(id);
	
}

}



