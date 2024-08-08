package com.sriindu10.project.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriindu10.project.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin ,Long>{

	

}
