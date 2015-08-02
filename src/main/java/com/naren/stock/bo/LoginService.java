package com.naren.stock.bo;

import com.naren.stock.model.Login;

public interface LoginService {

	void save(Login login);

	void update(Login login);

	void delete(Login login);

	Login findByUserID(int userID);
}
