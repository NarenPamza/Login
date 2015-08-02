package com.naren.stock.dao;

import com.naren.stock.model.Login;

public interface LoginDao {
	
	void save(Login stock);
	
	void update(Login stock);
	
	void delete(Login stock);
	
	Login findByUserID(int userID);

}
