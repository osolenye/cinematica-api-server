package com.example.cinema.services.impl;

import com.example.cinema.dao.OrderDetailsRepository;
import com.example.cinema.mapper.OrderDetailsMapper;
import com.example.cinema.mapper.OrderMapper;
import com.example.cinema.mapper.SeatMapper;
import com.example.cinema.mapper.SessionMapper;
import com.example.cinema.models.dto.entityDto.OrderDetailsDto;
import com.example.cinema.models.dto.requests.OrderDetailsCreateRequest;
import com.example.cinema.models.entities.OrderDetails;
import com.example.cinema.services.OrderDetailsService;
import com.example.cinema.services.OrderService;
import com.example.cinema.services.SeatService;
import com.example.cinema.services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderDetailsServiceImpl implements OrderDetailsService {
    private final SessionService sessionService;
    private final SeatService seatService;
    private final OrderService orderService;
    private final OrderDetailsRepository repository;




    @Override
    public OrderDetailsDto save(OrderDetailsDto orderDetailsDto) {
        OrderDetails orderDetails = OrderDetailsMapper.MAPPER.dtoToEntity(orderDetailsDto);
        orderDetails = repository.save(orderDetails);
        orderDetailsDto = OrderDetailsMapper.MAPPER.entityToDto(orderDetails);
        return orderDetailsDto;
    }

    @Override
    public OrderDetails findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("no such id"));
    }

    @Override
    public List<OrderDetails> findAll() {
        return null;
    }

    @Override
    public OrderDetailsDto create(OrderDetailsCreateRequest request) {
        try {
            OrderDetailsDto orderDetailsDto = new OrderDetailsDto();
            orderDetailsDto.setPrice(request.getPrice());
            orderDetailsDto.setNum(request.getNum());

            orderDetailsDto.setSessionDto(SessionMapper.MAPPER.entityToDto(sessionService.findById(request.getSessionId())));
            orderDetailsDto.setOrderDto(OrderMapper.MAPPER.entityToDto(orderService.findById(request.getOrderId())));
            orderDetailsDto.setSeatDto(SeatMapper.MAPPER.entityToDto(seatService.findById(request.getSeatId())));
            return save(orderDetailsDto);
        } catch (Exception e) {
            throw  new RuntimeException(e.getMessage());
        }
    }
}
