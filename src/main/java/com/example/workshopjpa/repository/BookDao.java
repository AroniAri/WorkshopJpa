package com.example.workshopjpa.repository;

import com.example.workshopjpa.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface BookDao extends CrudRepository <Book, Integer> {

    //Optional<Book> findByIsbnIgnoreCase(String isbn);
    //Optional<Book> findByTitleContains(String title);

}
