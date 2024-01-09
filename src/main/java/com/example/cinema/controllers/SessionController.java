package com.example.cinema.controllers;

import com.example.cinema.models.dto.requests.FilmCreateRequest;
import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.dto.requests.SessionCreateRequest;
import com.example.cinema.models.entities.Hall;
import com.example.cinema.services.FilmHallService;
import com.example.cinema.services.FilmService;
import com.example.cinema.services.HallService;
import com.example.cinema.services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/session")
@AllArgsConstructor
public class SessionController {
    private final SessionService sessionService;
    private final FilmService filmService;
    private final HallService hallService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody SessionCreateRequest request) {
        try {
            return ResponseEntity.ok(sessionService.create(request));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}