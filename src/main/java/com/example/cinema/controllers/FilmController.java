package com.example.cinema.controllers;

import com.example.cinema.models.dto.requests.CinemaCreateRequest;
import com.example.cinema.models.dto.requests.FilmCreateRequest;
import com.example.cinema.models.entities.FilmHall;
import com.example.cinema.services.FilmHallService;
import com.example.cinema.services.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/film")
@AllArgsConstructor
public class FilmController {
    private final FilmService filmService;
    private final FilmHallService filmHallService;
    @PostMapping("/create")
    ResponseEntity<?> create(@ModelAttribute FilmCreateRequest request) {
        try {

            return ResponseEntity.ok(filmService.create(request.getLogo(), request));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
