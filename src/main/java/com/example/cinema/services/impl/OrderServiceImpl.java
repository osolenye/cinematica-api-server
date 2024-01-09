package com.example.cinema.services.impl;

import com.example.cinema.dao.OrderRepository;
import com.example.cinema.mapper.OrderMapper;
import com.example.cinema.models.dto.entityDto.OrderDto;
import com.example.cinema.models.dto.requests.OrderCreateRequest;
import com.example.cinema.models.entities.Order;
import com.example.cinema.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;

    @Override
    public OrderDto save(OrderDto orderDto) {
        Order order = OrderMapper.MAPPER.dtoToEntity(orderDto);
        order = repository.save(order);
        orderDto = OrderMapper.MAPPER.entityToDto(order);
        return orderDto;
    }

    @Override
    public Order findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("no such id"));
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public OrderDto create(OrderCreateRequest request) {
        try {
            OrderDto orderDto = new OrderDto();
            orderDto.setNum(request.getNum());
            orderDto.setTotalPrice(request.getTotalPrice());
            return save(orderDto);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
