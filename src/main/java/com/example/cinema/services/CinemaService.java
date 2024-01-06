package com.example.cinema.services;

import com.example.cinema.models.dto.CinemaCreateRequest;
import com.example.cinema.models.Cinema;

import java.util.List;

public interface CinemaService {
    Cinema save(Cinema cinema);
    Cinema findById(Long id);

    List<Cinema> findAll();

    Cinema create(CinemaCreateRequest request);
}
