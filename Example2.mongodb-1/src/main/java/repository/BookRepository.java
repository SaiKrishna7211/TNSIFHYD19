package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import entity.BookEntity;

public interface BookRepository extends MongoRepository<BookEntity, Integer>{

	

}
