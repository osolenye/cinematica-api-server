package com.example.cinema.controllers;

import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.dto.requests.PriceCreateRequest;
import com.example.cinema.services.HallService;
import com.example.cinema.services.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/price")
@AllArgsConstructor
public class PriceController {
    private final PriceService priceService;

    private final HallService hallService;
    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody PriceCreateRequest request) {
        try {
            return ResponseEntity.ok(priceService.create(request));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
