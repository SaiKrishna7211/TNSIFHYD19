package com.sriindu10.project.service;

import java.util.List;
import com.sriindu10.project.entity.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	List<Admin> fetchAdminList();

	Admin fetchAdminById(Long id);

	void deleteAdminById(Long id);

	Admin updateAdmin(Long id, Admin admin);

}
