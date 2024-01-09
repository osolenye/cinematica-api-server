package com.example.cinema.mapper;

import com.example.cinema.models.dto.entityDto.CinemaDto;
import com.example.cinema.models.dto.entityDto.FilmHallDto;
import com.example.cinema.models.entities.Cinema;
import com.example.cinema.models.entities.FilmHall;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FilmHallMapper {
    FilmHallMapper MAPPER = Mappers.getMapper(FilmHallMapper.class);

    FilmHallDto entityToDto(FilmHall filmHall);
    FilmHall dtoToEntity(FilmHallDto filmHallDto);
    List<FilmHallDto> entitiesToDtos(List<FilmHall> filmHalls);
    List<FilmHall> dtosToEntities(List<FilmHallDto> filmHallDtos);
}
