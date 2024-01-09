package com.example.cinema.models.dto.entityDto;

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
public class PriceDto {
    Long id;

    double price;

    TicketType ticketType;
}
