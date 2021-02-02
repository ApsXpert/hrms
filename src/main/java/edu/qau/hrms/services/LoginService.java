package edu.qau.hrms.services;

import edu.qau.hrms.dao.UserDao;
import edu.qau.hrms.model.User;

public class LoginService {

	UserDao userDao = new UserDao();

	public boolean login(String email, String password) {
		User user = userDao.getUserByEmailAndPassword(email, password);
		if (user != null)
			return true;
		return false;
	}

}
