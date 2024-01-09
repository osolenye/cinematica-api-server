package com.example.cinema.models.dto.entityDto;

import com.example.cinema.models.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsDto {
    Long id;
    double price;
    int num;

    OrderDto order;
    SeatDto seat;
    SessionDto session;
}
