package com.example.workshopjpa.repository;

import com.example.workshopjpa.entities.Details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Integer> {

  Optional<Details> findByEmail(String email);
  Optional<Details> findByNameContaining(String name);
  Optional<Details> findByNameIgnoreCase(String name);

}
