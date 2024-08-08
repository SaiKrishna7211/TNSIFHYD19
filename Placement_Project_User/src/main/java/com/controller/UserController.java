package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.entity.User;
import com.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class UserController {
	@Autowired
	private UserService us;
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		//TODO: process POST request
		
		return us.saveUser(user);
	}
	
	@GetMapping("/users")
	public List<User> fetchUsersList() {
		return us.fetchUsersList();
	}
	
	@GetMapping("/users/{id}")
	public User fetchUserById(@PathVariable("id") Long id) {
		return us.fetchUserById(id);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		us.deleteUser(id);
		return "User Deleted...!";
	}
	
	@PutMapping("users/{id}")
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		//TODO: process PUT request
		
		return us.updateUser(id,user);
	}
}
