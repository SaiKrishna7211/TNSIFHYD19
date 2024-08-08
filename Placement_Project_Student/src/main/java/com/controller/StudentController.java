package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class StudentController {
	@Autowired
	private StudentService ss;
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		//TODO: process POST request
		
		return ss.saveStudent(student);
	}
	@GetMapping("/students")
	public List<Student> fetchStudentList() {
		return ss.fetchStudentList();
	}
	@GetMapping("/students/{id}")
	public Student fetchStudentById(@PathVariable("id") Long id) {
		return ss.fetchStudentById(id);
	}
	@DeleteMapping("/students/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		ss.deleteStudent(id);
		return "Student Deleted..!";
	}
	@PutMapping("students/{id}")
	public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		//TODO: process PUT request
		
		return ss.updateStudent(id,student);
	}
}
