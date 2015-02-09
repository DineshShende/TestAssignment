package com.svk.web.services;

import org.apache.log4j.Logger;

import com.svk.web.persistence.Dao;
import com.svk.web.type.User;

public class UserServiceImpl implements UserService{

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	private Dao<User> dao;
	
	public UserServiceImpl(Dao<User> dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
	}
	
	@Override
	public void addPerson(User user) {
		// TODO Auto-generated method stub
		
		dao.insertOrUpdate(user);
	}

	@Override
	public User getPersonById(long id) {
		// TODO Auto-generated method stub
		return getPersonById(id);
	}

	@Override
	public void deletePerson(long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public User getPersonByName(String username) {
		// TODO Auto-generated method stub
		return dao.get("name='"+username+"'");
	}

}
