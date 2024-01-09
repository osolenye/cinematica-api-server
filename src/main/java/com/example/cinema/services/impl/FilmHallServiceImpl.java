package com.example.cinema.services.impl;

import com.example.cinema.dao.FilmHallRepository;
import com.example.cinema.mapper.FilmHallMapper;
import com.example.cinema.mapper.HallMapper;
import com.example.cinema.models.dto.entityDto.FilmDto;
import com.example.cinema.models.dto.entityDto.FilmHallDto;
import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.entities.FilmHall;
import com.example.cinema.services.FilmHallService;
import com.example.cinema.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FilmHallServiceImpl implements FilmHallService {
    private final FilmHallRepository repository;
    private final HallService hallService;

    @Override
    public FilmHallDto save(FilmHallDto filmHallDto) {
        FilmHall result = FilmHallMapper.MAPPER.dtoToEntity(filmHallDto);
        result = repository.save(result);
        filmHallDto = FilmHallMapper.MAPPER.entityToDto(result);
        return filmHallDto;
    }

    @Override
    public FilmHall findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("no such id"));
    }

    @Override
    public List<FilmHall> findAll() {
        return null;
    }

    @Override
    public FilmHallDto create(FilmDto filmDto, Long hallId) {
        FilmHallDto filmHallDto = new FilmHallDto();
        filmHallDto.setFilm(filmDto);
        HallDto hallDto = HallMapper.MAPPER.entityToDto(hallService.findById(hallId));
        filmHallDto.setHall(hallDto);
        return save(filmHallDto);
    }
}
