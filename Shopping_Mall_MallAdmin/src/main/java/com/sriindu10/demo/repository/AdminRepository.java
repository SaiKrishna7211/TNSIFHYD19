package com.sriindu10.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriindu10.demo.entity.Admin;



@Repository
public interface AdminRepository  extends JpaRepository<Admin, Long>{

}
