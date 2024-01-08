package com.example.cinema.mapper;

import com.example.cinema.models.dto.entityDto.CinemaDto;
import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.entities.Cinema;
import com.example.cinema.models.entities.Hall;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface HallMapper{
    HallMapper MAPPER = Mappers.getMapper(HallMapper.class);

    HallDto entityToDto(Hall hall);
    Hall dtoToEntity(HallDto hallDto);
    List<HallDto> entitiesToDtos(List<Hall> halls);
    List<Hall> dtosToEntities(List<HallDto> hallDtos);
}
