package com.example.cinema.services;

import com.example.cinema.models.dto.requests.CinemaCreateRequest;
import com.example.cinema.models.entities.Cinema;
import com.example.cinema.models.dto.entityDto.CinemaDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CinemaService {
    CinemaDto save(CinemaDto cinema);
    Cinema findById(Long id);

    List<Cinema> findAll();

    CinemaDto create(MultipartFile logo, CinemaCreateRequest request);
}
