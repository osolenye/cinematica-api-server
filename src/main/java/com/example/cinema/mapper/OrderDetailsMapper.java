package com.example.cinema.mapper;

import com.example.cinema.models.dto.entityDto.FilmDto;
import com.example.cinema.models.dto.entityDto.OrderDetailsDto;
import com.example.cinema.models.entities.Film;
import com.example.cinema.models.entities.OrderDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDetailsMapper {
    OrderDetailsMapper MAPPER = Mappers.getMapper(OrderDetailsMapper.class);

    OrderDetailsDto entityToDto(OrderDetails orderDetails);
    OrderDetails dtoToEntity(OrderDetailsDto orderDetailsDto);
    List<OrderDetailsDto> entitiesToDtos(List<OrderDetails> orderDetails);
    List<OrderDetails> dtosToEntities(List<OrderDetailsDto> orderDetailsDtos);

}
