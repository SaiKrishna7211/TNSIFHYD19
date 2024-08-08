package com.User.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{


}
