package com.example.cinema.mapper;

import com.example.cinema.models.dto.entityDto.CinemaDto;
import com.example.cinema.models.dto.entityDto.FilmDto;
import com.example.cinema.models.entities.Cinema;
import com.example.cinema.models.entities.Film;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FilmMapper {
    FilmMapper MAPPER = Mappers.getMapper(FilmMapper.class);

    FilmDto entityToDto(Film fIlm);
    Film dtoToEntity(FilmDto filmDto);
    List<FilmDto> entitiesToDtos(List<Film> films);
    List<Film> dtosToEntities(List<FilmDto> filmDtos);
}
