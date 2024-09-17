package com.kodBook.services;

import com.kodBook.entities.User;

public interface UserService {

	boolean userExists(String username, String email);

	void addUser(User user);

	boolean validateUser(String username, String password);

	

}
