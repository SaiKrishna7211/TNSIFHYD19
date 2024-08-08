package com.sriindu10.project.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriindu10.project.entity.Admin;
import com.sriindu10.project.ropository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository ar;

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return ar.save(admin);
	}

	@Override
	public List<Admin> fetchAdminList() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public Admin fetchAdminById(Long id) {
		// TODO Auto-generated method stub
		return ar.findById(id).get();
	}

	@Override
	public void deleteAdminById(Long id) {
		// TODO Auto-generated method stub
		ar.deleteById(id);
	}

	@Override
	public Admin updateAdmin(Long id, Admin admin) {
		// TODO Auto-generated method stub
		Admin a=ar.findById(id).get();
		if(Objects.nonNull(admin.getName()) &&!"".equalsIgnoreCase(admin.getName())) {
			a.setName(admin.getName());
		}

		if(Objects.nonNull(admin.getPassword()) && !"".equalsIgnoreCase(admin.getPassword())) {
			a.setPassword(admin.getPassword());
		}
		return ar.save(a); 
	}
	
}
