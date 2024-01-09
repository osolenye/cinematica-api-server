package com.example.cinema.services;

import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.dto.entityDto.SeatDto;
import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.dto.requests.SeatCreateRequest;
import com.example.cinema.models.entities.Hall;
import com.example.cinema.models.entities.Seat;

import java.util.List;

public interface SeatService {
    SeatDto save(SeatDto seatDto);
    Seat findById(Long id);

    List<Seat> findAll();

    SeatDto create(SeatCreateRequest request);
}
