package com.example.cinema.models.dto.requests;

import com.example.cinema.models.enums.TicketType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceCreateRequest {
    double price;
    TicketType ticketType;
}
