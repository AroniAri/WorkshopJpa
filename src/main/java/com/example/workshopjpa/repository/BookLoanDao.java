package com.example.workshopjpa.repository;

import com.example.workshopjpa.entities.BookLoan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository

public interface BookLoanDao extends CrudRepository<BookLoan, Integer> {

    //Optional<BookLoan> findByBorrowerId(int bookBorrowerId);
   //Optional<BookLoan> findByBook(int userId);
   // Optional<BookLoan> findByAndBookId(int bookId);
   // Optional<BookLoan> findBy(boolean notReturned);
   // Optional<BookLoan> findByReturned(boolean returned);
   // Optional<BookLoan> findByDueDate(Date dueDate);
}
