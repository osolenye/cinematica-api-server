package com.example.cinema.services;

import com.example.cinema.models.dto.entityDto.OrderDetailsDto;
import com.example.cinema.models.dto.requests.OrderDetailsCreateRequest;
import com.example.cinema.models.entities.OrderDetails;

import java.util.List;

public interface OrderDetailsService {
    OrderDetailsDto save(OrderDetailsDto orderDetailsDto);

    OrderDetails findById(Long id);

    List<OrderDetails> findAll();

    OrderDetailsDto create(OrderDetailsCreateRequest request);
}
