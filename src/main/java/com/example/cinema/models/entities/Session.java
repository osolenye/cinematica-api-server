package com.example.cinema.models.entities;

import com.example.cinema.models.enums.HallType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_session")
public class Session{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_film", nullable = false)
    Film film;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_hall", nullable = false)
    Hall hall;
    Date dateTime;
}

