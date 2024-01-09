package com.example.cinema.services;

import com.example.cinema.models.dto.entityDto.FilmDto;
import com.example.cinema.models.dto.entityDto.FilmHallDto;
import com.example.cinema.models.dto.entityDto.SessionDto;
import com.example.cinema.models.dto.requests.SessionCreateRequest;
import com.example.cinema.models.entities.FilmHall;
import com.example.cinema.models.entities.Session;

import java.util.List;

public interface SessionService {
    SessionDto save(SessionDto sessionDto);
    Session findById(Long id);

    List<Session> findAll();

    SessionDto create(SessionCreateRequest request);
}
