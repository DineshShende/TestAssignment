package com.svk.web.persistence;

import java.util.Collection;

public interface Dao<T> {
	long count();
	Collection<T> findAll();	
	T get(long id);
	T get(Object id);
	T get(String whereCondition);
	Collection<T> getMultipleRows(String whereCondition);
	T insertOrUpdate(T t);
	void delete(T t);
	void deleteById(long id);
	void deleteAll();
	Collection<T> distinct(String coloumName,String query); 
	long max(String coloumName);
	Collection<T>  getRow(String query);
}
