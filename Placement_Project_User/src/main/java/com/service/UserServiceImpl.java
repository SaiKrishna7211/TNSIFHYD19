package com.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entity.User;
import com.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository ur;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}

	@Override
	public List<User> fetchUsersList() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public User fetchUserById(Long id) {
		// TODO Auto-generated method stub
		return ur.findById(id).get();
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		ur.deleteById(id);
	}

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		User u=ur.findById(id).get();
		
		if(Objects.nonNull(user.getName())&&!"".equalsIgnoreCase(user.getName())) {
			u.setName(user.getName());
		}
		if(Objects.nonNull(user.getPassword())&&!"".equalsIgnoreCase(user.getPassword())) {
			u.setPassword(user.getPassword());
		}
		return ur.save(u);
	}

}
