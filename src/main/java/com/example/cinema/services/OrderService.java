package com.example.cinema.services;

import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.dto.entityDto.OrderDto;
import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.dto.requests.OrderCreateRequest;
import com.example.cinema.models.entities.Hall;
import com.example.cinema.models.entities.Order;

import java.util.List;

public interface OrderService {
    OrderDto save(OrderDto orderDto);
    Order findById(Long id);

    List<Order> findAll();

    OrderDto create(OrderCreateRequest request);
}
