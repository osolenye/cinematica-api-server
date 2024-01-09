package com.example.cinema.models.dto.entityDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FilmHallDto {
    Long id;

    FilmDto film;

    HallDto hall;
}