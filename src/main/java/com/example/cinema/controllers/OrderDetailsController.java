package com.example.cinema.controllers;

import com.example.cinema.models.dto.entityDto.OrderDetailsDto;
import com.example.cinema.models.dto.requests.OrderDetailsCreateRequest;
import com.example.cinema.services.OrderDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order-details")
@AllArgsConstructor
public class OrderDetailsController {
    private final OrderDetailsService orderDetailsService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody  OrderDetailsCreateRequest request) {
            try {
                return ResponseEntity.ok(orderDetailsService.create(request));
            } catch (RuntimeException e) {
                return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
            }
        }

}
