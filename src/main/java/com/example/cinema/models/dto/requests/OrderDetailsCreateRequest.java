package com.example.cinema.models.dto.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailsCreateRequest {
    double price;
    int num;

    Long orderId;
    Long sessionId;
    Long seatId;
}
