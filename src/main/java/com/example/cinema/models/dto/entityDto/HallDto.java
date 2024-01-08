package com.example.cinema.models.dto.entityDto;

import com.example.cinema.models.enums.HallType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HallDto {
    Long id;
    String name;
    HallType hallType;

    CinemaDto cinema;
}
