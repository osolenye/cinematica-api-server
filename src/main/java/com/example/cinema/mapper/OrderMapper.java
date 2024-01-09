package com.example.cinema.mapper;

import com.example.cinema.models.dto.entityDto.OrderDto;
import com.example.cinema.models.dto.entityDto.SessionDto;
import com.example.cinema.models.entities.Order;
import com.example.cinema.models.entities.Session;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper MAPPER = Mappers.getMapper(OrderMapper.class);

    OrderDto entityToDto(Order order);
    Order dtoToEntity(OrderDto orderDto);
    List<OrderDto> entitiesToDtos(List<Order> orders);
    List<Order> dtosToEntities(List<OrderDto> orderDtos);
}
