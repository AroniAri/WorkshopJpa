package com.example.workshopjpa.repository;


import com.example.workshopjpa.entities.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository <AppUser, Integer> {

    Optional<AppUser> findByUsername(String username);
    Optional<List<AppUser>> findByRegDateBetween(LocalDate startDate, LocalDate endDate);
    List<AppUser> findByUserDetailsId(int DetailsId);
    List<AppUser> findByUserDetails_EmailIgnoreCase(String email);




}





