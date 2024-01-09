package com.example.cinema.models.dto.entityDto;

import com.example.cinema.models.entities.Film;
import com.example.cinema.models.entities.Hall;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SessionDto {
    Long id;
    FilmDto film;
    HallDto hall;
    Date dateTime;
}

