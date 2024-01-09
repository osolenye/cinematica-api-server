package com.example.cinema.mapper;

import com.example.cinema.models.dto.entityDto.OrderDto;
import com.example.cinema.models.dto.entityDto.PriceDto;
import com.example.cinema.models.entities.Order;
import com.example.cinema.models.entities.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {
    PriceMapper MAPPER = Mappers.getMapper(PriceMapper.class);

    PriceDto entityToDto(Price price);
    Price dtoToEntity(PriceDto priceDto);
    List<PriceDto> entitiesToDtos(List<Price> prices);
    List<Price> dtosToEntities(List<PriceDto> priceDtos);
}
