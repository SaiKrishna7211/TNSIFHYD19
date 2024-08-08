package com.sriindu10.demo.service;

import java.util.List;

import com.sriindu10.demo.entity.Admin;



public interface AdminService {

	Admin saveAdmin(Admin admin);

	List<Admin> fetchAdmin();

	Admin fetchAdminById(Long id);

	Admin updateAdminById(Long id, Admin admin);

	void deleteAdminById(Long id);


}
