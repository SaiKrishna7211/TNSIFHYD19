package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Certificate_Entity;

@Repository
public interface Certificate_Repository extends JpaRepository<Certificate_Entity, Long>{

}
