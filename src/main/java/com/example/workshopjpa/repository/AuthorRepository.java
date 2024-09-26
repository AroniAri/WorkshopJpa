package com.example.workshopjpa.repository;

import com.example.workshopjpa.entities.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository <Author, Integer> {

    List<Author> findByFirstName(String firstName);
    List<Author> findByLastName(String lastName);
    List<Author> findByFirstNameContainingOrLastNameContaining(String keyword, String keyword2);
    @Query("SELECT a FROM Author a JOIN a.writtenBooks b WHERE b.id = ?1")
    List<Author> findByBookId(int bookId);

    @Transactional
    @Modifying
    @Query("UPDATE Author a SET a.firstName = ?2, a.lastName = ?3 WHERE a.id = ?1")
    void updateAuthorNameById(int id, String firstName, String lastName);

    void deleteById(int id);
}
