package com.example.cinema.mapper;

import com.example.cinema.models.dto.entityDto.CinemaDto;
import com.example.cinema.models.dto.entityDto.SessionDto;
import com.example.cinema.models.entities.Cinema;
import com.example.cinema.models.entities.Session;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SessionMapper {
    SessionMapper MAPPER = Mappers.getMapper(SessionMapper.class);

    SessionDto entityToDto(Session session);
    Session dtoToEntity(SessionDto sessionDto);
    List<SessionDto> entitiesToDtos(List<Session> sessions);
    List<Session> dtosToEntities(List<SessionDto> sessionDtos);
}
