package com.example.cinema.models.entities;

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
@Entity
@Table(name = "tb_seat")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int num;
    int row;
    @Enumerated(EnumType.STRING)
    SeatStatus status;

    @ManyToOne
    @JoinColumn(name = "id_session")
    Session session;
}
