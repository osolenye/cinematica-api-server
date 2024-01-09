package com.example.cinema.models.dto.entityDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilmDto{
    Long id;
    String name;
    String description;
    String genre;
    String logo;
}