package com.sriindu10.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sriindu10.demo.entity.Admin;
import com.sriindu10.demo.service.AdminService;

import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class AdminController {
    
	@Autowired
	AdminService adminservice;
	
	 @PostMapping("/Admin")
	    public Admin saveAdmin(@RequestBody Admin  admin) {
	       
	        return adminservice.saveAdmin(admin);
	    }
		
       @GetMapping("/Admins")
       public List<Admin>fetchAdmin() {
           return adminservice.fetchAdmin();
       }
       
      @GetMapping("/Admins/{id}")
      public Admin fetchAdminById(@PathVariable("id") Long id) {
          return adminservice.fetchAdminById(id);
      }
      
       @PutMapping("/Admins/{id}")
       public Admin upadateAdminById(@PathVariable("id") Long id, @RequestBody Admin admin) {
           //TODO: process PUT request
           
           return adminservice.updateAdminById(id,admin);
       }
       
       @DeleteMapping("/Admins/{id}")
       public String deleteAdminById(@PathVariable("id")Long id) {
    	  adminservice.deleteAdminById(id);
    	  return "Admin deleted successfully";
       }
       
	 
	
	
	
}
