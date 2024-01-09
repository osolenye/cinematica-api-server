package com.example.cinema.controllers;

import com.example.cinema.models.dto.requests.CinemaCreateRequest;
import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.services.CinemaService;
import com.example.cinema.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hall")
@AllArgsConstructor
public class HallController {
    private final HallService hallService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody HallCreateRequest request) {
        try {
            return ResponseEntity.ok(hallService.create(request));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}