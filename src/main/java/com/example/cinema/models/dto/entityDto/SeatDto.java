package com.example.cinema.models.dto.entityDto;

import com.example.cinema.models.entities.Session;
import com.example.cinema.models.enums.SeatStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SeatDto {
    Long id;

    int num;
    int row;
    SeatStatus status;

    Session session;
}
