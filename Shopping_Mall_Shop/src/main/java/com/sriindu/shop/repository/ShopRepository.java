package com.sriindu.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriindu.shop.entity.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

}
