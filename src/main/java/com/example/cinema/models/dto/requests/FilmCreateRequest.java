package com.example.cinema.models.dto.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FilmCreateRequest {
    String name;
    String description;
    String genre;
    MultipartFile logo;
}
