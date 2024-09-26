package com.example.workshopjpa.repository;

import com.example.workshopjpa.entities.BookLoan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface BookLoanRepository extends CrudRepository<BookLoan, Integer> {

    List<BookLoan> findByBorrowerId(int borrowerId);
    List<BookLoan> findByBookId(int bookId);
    List<BookLoan> findByReturnedFalse();
    List<BookLoan> findByDueDateBeforeAndReturnedFalse(LocalDate today);
    List<BookLoan> findByLoanDateBetween(LocalDate startDate, LocalDate endDate);
}
