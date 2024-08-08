package com.sriindu10.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.sriindu10.project.entity.Admin;
import com.sriindu10.project.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class AdminController {
	@Autowired
	private AdminService as;
	
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		//TODO: process POST request
		
		return as.saveAdmin(admin);
	}
	@GetMapping("/admin")
	public List<Admin> fetchAdminList() {
		return as.fetchAdminList();
	}
	@GetMapping("/admin/{id}")
	public Admin fetchAdminById(@PathVariable("id") Long id) {
		return as.fetchAdminById(id);
	}
	@PutMapping("/admin/{id}")
	public Admin updateAdmin(@PathVariable("id") Long id, @RequestBody Admin admin) {
		
		return as.updateAdmin(id,admin);
	}
	@DeleteMapping("/admin/{id}")
	public String deleteAdminById(@PathVariable("id") Long id) {
		as.deleteAdminById(id);
		return "Admin Deleted Successfully..!";
	}
}
