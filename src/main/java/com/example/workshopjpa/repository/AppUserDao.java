package com.example.workshopjpa.repository;


import com.example.workshopjpa.entities.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserDao extends CrudRepository <AppUser, Integer> {

   // Optional<AppUser> findByUsername(String username);
    //Optional<AppUser> findByEmailIgnoreCase(String email);
    //Optional <AppUser> findByUsernameAndPassword(String username, String password);
    //Optional<AppUser> findByDetails_Id(int details_Id);
    //Optional<List<AppUser>> findAllBetweenTwoDates(LocalDate start, LocalDate endDate);
}
