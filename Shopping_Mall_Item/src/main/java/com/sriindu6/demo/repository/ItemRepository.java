package com.sriindu6.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriindu6.demo.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
