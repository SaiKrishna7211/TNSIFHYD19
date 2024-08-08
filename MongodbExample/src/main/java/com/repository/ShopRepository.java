package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.entity.Shop;

@Repository
public interface ShopRepository extends MongoRepository<Shop, Long>{

}
