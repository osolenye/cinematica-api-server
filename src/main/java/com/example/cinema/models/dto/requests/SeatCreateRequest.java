package com.example.cinema.models.dto.requests;

import com.example.cinema.models.enums.SeatStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SeatCreateRequest {
    int num;
    int row;
    SeatStatus status;
    Long sessionId;
}
