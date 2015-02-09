package com.svk.web.persistence.dao;

import org.springframework.stereotype.Repository;

import com.svk.web.persistence.Dao;
import com.svk.web.type.User;

@Repository("userDao")
public class UserPersistenceDaoImpl extends AbstractJPADaoImpl<User> implements Dao<User>{

}
