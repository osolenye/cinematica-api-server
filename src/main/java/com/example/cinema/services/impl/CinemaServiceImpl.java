package com.example.cinema.services.impl;

import com.example.cinema.dao.CinemaRepository;
import com.example.cinema.models.dto.CinemaCreateRequest;
import com.example.cinema.models.Cinema;
import com.example.cinema.services.CinemaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CinemaServiceImpl implements CinemaService {
    private final CinemaRepository repository;
    @Override
    public Cinema save(Cinema cinema) {
        return repository.save(cinema);
    }

    @Override
    public Cinema findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("no such id"));
    }

    @Override
    public List<Cinema> findAll() {
        return repository.findAll();
    }

    @Override
    public Cinema create(CinemaCreateRequest request) {
        try {
            Cinema cinema = new Cinema();
            cinema.setInfo(request.getInfo());
            cinema = save(cinema);
            return cinema;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
