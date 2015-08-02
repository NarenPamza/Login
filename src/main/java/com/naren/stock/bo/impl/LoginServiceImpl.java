package com.naren.stock.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.naren.stock.bo.LoginService;
import com.naren.stock.dao.LoginDao;
import com.naren.stock.model.Login;

public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao stockDao;

	public void setStockDao(LoginDao stockDao) {
		this.stockDao = stockDao;
	}

	public void save(Login stock) {
		stockDao.save(stock);
	}

	public void update(Login stock) {
		stockDao.update(stock);
	}

	public void delete(Login stock) {
		stockDao.delete(stock);
	}

	public Login findByUserID(int userID) {
		return stockDao.findByUserID(userID);
	}
}
