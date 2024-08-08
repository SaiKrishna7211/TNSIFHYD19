package com.User.demo.service;

import java.util.List;

import com.User.demo.entity.User;

public interface UserService {

	User saveUser(User user);

	List<User> fetchUserList();

	User fetchuserById(Long userId);

	void deleteUserById(Long userId);

	

}
