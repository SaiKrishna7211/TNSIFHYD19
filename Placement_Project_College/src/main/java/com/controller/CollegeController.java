package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.entity.College;
import com.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	private CollegeService ss;
	@PostMapping("/college")
	public College saveCollege(@RequestBody College college) {
		return ss.saveCollege(college);
	}
	
	@GetMapping("/college")
	public List<College> fetchCollegeList()
	{
		return ss.fetchCollegeList();
	}
	@GetMapping("/college/{id}")
	 public College fetchCollegeById(@PathVariable("id") Long id)
    {
		return ss.fetchCollegeById(id);
    }
	 @DeleteMapping("/college/{id}")
	    public String deleteCollegeById(@PathVariable("id") Long id) {
	        ss.deleteCollegeById(id);
	        return "College deleted Successfully!!";
	 }
	 @PutMapping("/college/{id}")
	    public College updateCollege(@PathVariable("id") Long id,
	                                       @RequestBody College college) {
	        return ss.updateCollege(id,college);
	        
	}
}
