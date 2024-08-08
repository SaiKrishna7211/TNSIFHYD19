package com.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.College;
import com.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService{
	@Autowired
	private CollegeRepository cr;
	@Override
	public College saveCollege(College college) {
		// TODO Auto-generated method stub
		return cr.save(college);
	}

	@Override
	public List<College> fetchCollegeList() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public College fetchCollegeById(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public void deleteCollegeById(Long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public College updateCollege(Long id, College college) {
		// TODO Auto-generated method stub
		College c=cr.findById(id).get();
		if(Objects.nonNull(college.getCollegeName())&&!"".equalsIgnoreCase(college.getCollegeName())) {
			c.setCollegeName(college.getCollegeName());
		}
		if(Objects.nonNull(college.getLocation())&&!"".equalsIgnoreCase(college.getLocation())) {
			c.setLocation(college.getLocation());
		}
		return cr.save(c);
	}

}
