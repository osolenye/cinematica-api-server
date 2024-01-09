package com.example.cinema.services;

import com.example.cinema.models.dto.entityDto.CinemaDto;
import com.example.cinema.models.dto.entityDto.FilmDto;
import com.example.cinema.models.dto.requests.CinemaCreateRequest;
import com.example.cinema.models.dto.requests.FilmCreateRequest;
import com.example.cinema.models.entities.Cinema;
import com.example.cinema.models.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FilmService{
    FilmDto save(FilmDto filmDto);
    Film findById(Long id);

    List<Film> findAll();

    FilmDto create(MultipartFile logo, FilmCreateRequest request);
}
