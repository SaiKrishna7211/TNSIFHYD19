package com.service;

import java.util.List;
import com.entity.College;

public interface CollegeService {

	College saveCollege(College college);

	List<College> fetchCollegeList();

	College fetchCollegeById(Long id);

	void deleteCollegeById(Long id);

	College updateCollege(Long id, College college);

}
