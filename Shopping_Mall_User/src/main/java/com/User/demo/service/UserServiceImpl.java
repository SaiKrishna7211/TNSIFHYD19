package com.User.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.demo.entity.User;
import com.User.demo.repository.UserRepository;

@Service
public  class UserServiceImpl implements UserService{

	@Autowired
	UserRepository ur;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}
	@Override
	public List<User> fetchUserList() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}
	@Override
	public User fetchuserById(Long userId) {
		// TODO Auto-generated method stub
		return ur.findById(userId).get();
	}
	
	
	@Override
	public void deleteUserById(Long userId) {
		// TODO Auto-generated method stub
		 ur.deleteById(userId);
	}

}
