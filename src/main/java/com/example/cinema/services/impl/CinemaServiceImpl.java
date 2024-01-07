package com.example.cinema.services.impl;

import com.example.cinema.dao.CinemaRepository;
import com.example.cinema.mapper.CinemaMapper;
import com.example.cinema.models.dto.CinemaCreateRequest;
import com.example.cinema.models.Cinema;
import com.example.cinema.models.dto.entityDto.CinemaDto;
import com.example.cinema.services.CinemaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CinemaServiceImpl implements CinemaService {
    private final CinemaRepository repository;

    @Override
    public CinemaDto save(CinemaDto cinema) {
        Cinema result = CinemaMapper.MAPPER.dtoToEntity(cinema);
        result = repository.save(result);
        cinema = CinemaMapper.MAPPER.entityToDto(result);
        return cinema;
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
    public CinemaDto create(CinemaCreateRequest request) {
        CinemaDto cinema = new CinemaDto();
        cinema.setInfo(request.getInfo());
//        cinema = save(cinema);
        try {
            return save(cinema);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
