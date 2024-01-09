package com.example.cinema.controllers;

import com.example.cinema.models.dto.requests.OrderCreateRequest;
import com.example.cinema.models.dto.requests.SessionCreateRequest;
import com.example.cinema.services.FilmService;
import com.example.cinema.services.HallService;
import com.example.cinema.services.OrderService;
import com.example.cinema.services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@AllArgsConstructor
public class OrderController{
    private final OrderService orderService;


    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody OrderCreateRequest request) {
        try {
            return ResponseEntity.ok(orderService.create(request));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
