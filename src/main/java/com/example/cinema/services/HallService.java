package com.example.cinema.services;


import com.example.cinema.models.dto.entityDto.CinemaDto;
import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.dto.requests.CinemaCreateRequest;
import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.entities.Cinema;
import com.example.cinema.models.entities.Hall;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface HallService {
    HallDto save(HallDto hallDto);
    Hall findById(Long id);

    List<Hall> findAll();

    HallDto create(HallCreateRequest request);
}
