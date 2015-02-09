package com.svk.web.persistence.dao;

import org.springframework.stereotype.Repository;

import com.svk.web.persistence.Dao;
import com.svk.web.persistence.PersonPersistence;

@Repository("personDao")
public class PersonPersistenceDaoImpl extends AbstractJPADaoImpl<PersonPersistence> implements Dao<PersonPersistence>{

}
