package com.sriindu10.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriindu10.demo.entity.Admin;
import com.sriindu10.demo.repository.AdminRepository;



@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminrepo;

	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminrepo.save(admin);
	}

	@Override
	public List<Admin> fetchAdmin() {
		// TODO Auto-generated method stub
		return adminrepo.findAll();
	}

	@Override
	public Admin fetchAdminById(Long id) {
		// TODO Auto-generated method stub
		return adminrepo.findById(id).get();
	}

	@Override
	public Admin updateAdminById(Long id, Admin admin) {
		// TODO Auto-generated method stub
		Admin a1=adminrepo.findById(id).get();
		
		if(Objects.nonNull(admin.getName()) && !"".equalsIgnoreCase(admin.getName())) {
			a1.setName(admin.getName());
		}
		if(Objects.nonNull(admin.getPassword())&& !"".equalsIgnoreCase(admin.getPassword())) {
			a1.setPassword(admin.getPassword());
		}
		return adminrepo.save(a1);
	}

	@Override
	public void deleteAdminById(Long id) {
		// TODO Auto-generated method stub
		adminrepo.deleteById(id);
	}


	
	
		
}
