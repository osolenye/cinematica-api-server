package com.example.cinema.controllers;

import com.example.cinema.models.dto.CinemaCreateRequest;
import com.example.cinema.models.Cinema;
import com.example.cinema.services.CinemaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cinema")
@AllArgsConstructor
public class MainController {
    private final CinemaService cinemaService;


//    @PostMapping("/save")
//    Cinema save(@RequestBody Cinema cinema) {
//        return cinemaService.save(cinema);
//    }

//    @GetMapping("/find/by/id/{id}")
//    ResponseEntity<?> findById(@PathVariable Long id) {
//        try {
//            return ResponseEntity.ok(cinemaService.findById(id));
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
//        }
//    }


    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody CinemaCreateRequest request) {
        try {
            return ResponseEntity.ok(cinemaService.create(request));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
