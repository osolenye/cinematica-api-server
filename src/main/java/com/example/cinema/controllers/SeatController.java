package com.example.cinema.controllers;

import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.dto.requests.SeatCreateRequest;
import com.example.cinema.services.HallService;
import com.example.cinema.services.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/seat")
@AllArgsConstructor
public class SeatController {
    private final SeatService seatService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody SeatCreateRequest request) {
        try {
            return ResponseEntity.ok(seatService.create(request));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}