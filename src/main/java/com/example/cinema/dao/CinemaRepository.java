package com.example.cinema.dao;

import com.example.cinema.models.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
//    Cinema findById(Long id);
}
