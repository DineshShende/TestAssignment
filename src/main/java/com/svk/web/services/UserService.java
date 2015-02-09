package com.svk.web.services;

import com.svk.web.type.User;

public interface UserService {

	public void addPerson(User user);
	public User getPersonById(long id);
	public void deletePerson(long id);
	public User getPersonByName(String username); 
}
