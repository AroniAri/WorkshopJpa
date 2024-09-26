package com.example.workshopjpa.repository;

import com.example.workshopjpa.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface BookRepository extends CrudRepository <Book, Integer> {

    List<Book> findByIsbnIgnoreCase(String isbn);
    List<Book> findByTitleContains(String title);
    Optional<Book> findByMaxLoanDaysLessThan(int maxLoanDays);

}
