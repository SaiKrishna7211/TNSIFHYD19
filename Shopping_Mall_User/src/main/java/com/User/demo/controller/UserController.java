package com.User.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.User.demo.entity.User;
import com.User.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService u1;
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		
		return u1.saveUser(user);
	}
	@GetMapping("/users")
    public List<User> fetchUserList() {
        //LOGGER.info("Inside fetchUserList of UserController");
        return u1.fetchUserList();
    }
	@GetMapping("/users/{id}")
    public User fetchUserById(@PathVariable("id") Long userId)
            {
        return u1.fetchuserById(userId);
    }
	@DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable("id") Long userId) {
        
		u1.deleteUserById(userId);
        return "user deleted Successfully!!";
    }
}

