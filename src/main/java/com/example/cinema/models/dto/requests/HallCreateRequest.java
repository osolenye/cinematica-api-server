package com.example.cinema.models.dto.requests;

import com.example.cinema.models.enums.HallType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HallCreateRequest {
    String name;
    HallType hallType;
    Long cinemaId;
}
