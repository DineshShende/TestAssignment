package com.svk.web.persistence.dao;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.svk.web.persistence.Dao;

@Transactional
public abstract class AbstractJPADaoImpl<T> implements Dao<T> {

	protected final static Logger logger = Logger.getLogger(AbstractJPADaoImpl.class);
	private EntityManager entityManager;

	@PersistenceContext
	public void setEntityManager(final EntityManager em) {
		this.entityManager = em;		
	}

	protected Class<T> domainClass;

	@SuppressWarnings("unchecked")
	protected Class<T> getDomainClass() {
		if (domainClass == null) {
			final ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
			this.domainClass = (Class<T>) thisType.getActualTypeArguments()[0];
		}
		return domainClass;
	}

	protected String getDomainClassName() {
		return getDomainClass().getName();
	}

	@Override
	public void delete(T t) {
		entityManager.remove(t);
		//TODO:This function need to test.
	}

	@Override
	public T get(long id) {
		return entityManager.find(getDomainClass(), id);
	}

	@Override
	public T get(Object id) {
		return entityManager.find(getDomainClass(), id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(String query) {
		return (T) entityManager.createQuery("FROM "+ getDomainClassName() + " WHERE " + query).getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> getMultipleRows(String query) {
		return (Collection<T>) entityManager.createQuery("FROM "+ getDomainClassName() + " WHERE " + query).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> getRow(String query) {
		Query result= entityManager.createQuery("FROM "+ getDomainClassName() + " WHERE " + query);
		result.setFirstResult(0);
		result.setMaxResults(1);
		return result.getResultList();
	}

	@Override
	public T insertOrUpdate(T t) {
		final T merged = entityManager.merge(t);
		logger.info("Just persisted " + getDomainClassName() + " " 
				+ merged + " while persisting " + t);
		return merged;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> findAll() {
		return entityManager.createQuery(" FROM " + getDomainClassName()).getResultList();
	}

	@Override
	public long count() {
		return (Long) entityManager.createQuery("SELECT COUNT(*) FROM " 
				+ getDomainClassName()).getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> distinct(String coloumName,String query) {
		return entityManager.createQuery("SELECT DISTINCT("+coloumName+") FROM " + getDomainClassName()+ " WHERE " + query).getResultList();
	}

	@Override
	public long max(String coloumName) {
		return (Long) entityManager.createQuery("SELECT MAX("+coloumName+") FROM " 
				+ getDomainClassName()).getSingleResult();
	}

	@Override
	public void deleteAll() {
		entityManager.createQuery("DELETE " + getDomainClassName()).executeUpdate();
	}

	@Override
	public void deleteById(long id) {
		entityManager.remove(get(id));
	}
}