package com.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;
import com.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository sr;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	@Override
	public List<Student> fetchStudentList() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Student fetchStudentById(Long id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		// TODO Auto-generated method stub
		Student s=sr.findById(id).get();
		if(Objects.nonNull(student.getName())&&!"".equalsIgnoreCase(student.getName())) {
			s.setName(student.getName());
		}
		if(Objects.nonNull(student.getRoll())&&student.getRoll()!=0) {
			s.setRoll(student.getRoll());
		}
		if(Objects.nonNull(student.getQualification())&&!"".equalsIgnoreCase(student.getQualification())) {
			s.setQualification(student.getQualification());
		}
		if(Objects.nonNull(student.getCourse())&&!"".equalsIgnoreCase(student.getCourse())) {
			s.setCourse(student.getCourse());
		}
		return sr.save(s);
	}
	
}
