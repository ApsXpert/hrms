package edu.qau.hrms.dao;

import edu.qau.hrms.model.User;

public class UserDao {

	public User getUserByEmailAndPassword(String email, String password) {
		if (email.equals("abc@gmail.com") && password.equals("123")) {
			return new User(1, email, password);
		}

		else
			return null;

	}
}
