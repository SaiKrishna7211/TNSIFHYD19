package com.service;

import java.util.List;
import com.entity.User;

public interface UserService {

	User saveUser(User user);

	List<User> fetchUsersList();

	User fetchUserById(Long id);

	void deleteUser(Long id);

	User updateUser(Long id, User user);
	
}
