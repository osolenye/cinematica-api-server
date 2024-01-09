package com.example.cinema.services;

import com.example.cinema.models.dto.entityDto.FilmDto;
import com.example.cinema.models.dto.entityDto.FilmHallDto;
import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.entities.FilmHall;
import com.example.cinema.models.entities.Hall;

import java.util.List;

public interface FilmHallService {
    FilmHallDto save(FilmHallDto filmHallDto);
    FilmHall findById(Long id);

    List<FilmHall> findAll();

    FilmHallDto create(FilmDto filmDto, Long hallId);

}
