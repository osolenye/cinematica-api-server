package com.example.cinema.services;

import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.dto.entityDto.PriceDto;
import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.dto.requests.PriceCreateRequest;
import com.example.cinema.models.entities.Hall;
import com.example.cinema.models.entities.Price;

import java.util.List;

public interface PriceService {
    PriceDto save(PriceDto priceDto);
    Price findById(Long id);

    List<Price> findAll();

    PriceDto create(PriceCreateRequest request);
}
