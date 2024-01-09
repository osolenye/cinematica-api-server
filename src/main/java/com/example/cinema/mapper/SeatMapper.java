package com.example.cinema.mapper;

import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.dto.entityDto.SeatDto;
import com.example.cinema.models.entities.Hall;
import com.example.cinema.models.entities.Seat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SeatMapper {
    SeatMapper MAPPER = Mappers.getMapper(SeatMapper.class);

    SeatDto entityToDto(Seat seat);
    Seat dtoToEntity(SeatDto seatDto);
    List<SeatDto> entitiesToDtos(List<Seat> seats);
    List<Seat> dtosToEntities(List<SeatDto> seatDtos);
}
