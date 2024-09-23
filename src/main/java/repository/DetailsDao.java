package repository;

import entities.Details;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DetailsDao extends CrudRepository<Details, Integer> {

    Optional<Details> findByEmail(String email);
    Optional<Details> findByNameContaining(String name);
    Optional<Details> findByNameIgnoreCase(String name);
    Optional<Details> findByBirthDate(String birthDate);
}
