package com.service;

import java.util.List;

import com.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> fetchStudentList();

	Student fetchStudentById(Long id);

	void deleteStudent(Long id);

	Student updateStudent(Long id, Student student);

}
