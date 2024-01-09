package com.example.cinema.models.dto.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SessionCreateRequest {
    Long filmId;
    Long hallId;
//    Long priceId;
    Date dateTime;
}
