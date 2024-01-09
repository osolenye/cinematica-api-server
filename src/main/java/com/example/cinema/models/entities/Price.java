package com.example.cinema.models.entities;

import com.example.cinema.models.enums.SeatStatus;
import com.example.cinema.models.enums.TicketType;
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
@Table(name = "tb_price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    double price;

    @Enumerated(value = EnumType.STRING)
    TicketType ticketType;



}
