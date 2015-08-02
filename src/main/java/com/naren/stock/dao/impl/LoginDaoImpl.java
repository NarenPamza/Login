package com.naren.stock.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.naren.stock.dao.LoginDao;
import com.naren.stock.model.Login;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {
	
	 @Autowired
	 SessionFactory sessionFactory;
	 

	public void save(Login login) {
		sessionFactory.getCurrentSession().save(login);
	}

	public void update(Login login) {
		sessionFactory.getCurrentSession().update(login);
	}

	public void delete(Login login) {
		sessionFactory.getCurrentSession().delete(login);
	}

	public Login findByUserID(int userID) {
		return (Login) sessionFactory.getCurrentSession().get(Login.class, userID);
	}
}
