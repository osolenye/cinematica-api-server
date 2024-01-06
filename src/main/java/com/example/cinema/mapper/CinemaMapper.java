package com.example.cinema.mapper;

import com.example.cinema.models.Cinema;
import com.example.cinema.models.dto.entityDto.CinemaDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CinemaMapper {
    CinemaMapper MAPPER = Mappers.getMapper(CinemaMapper.class);

    CinemaDto entityToDto(Cinema cinema);
    Cinema dtoToEntity(CinemaDto cinemaDto);
    List<CinemaDto> entitiesToDtos(List<Cinema> cinemas);
    List<Cinema> dtosToEntities(List<CinemaDto> cinemaDtos);
}
