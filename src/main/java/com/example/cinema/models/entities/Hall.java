package com.example.cinema.models.entities;

import com.example.cinema.models.enums.HallType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_hall")
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Enumerated(value = EnumType.STRING)
    HallType hallType;

    @ManyToOne
    @JoinColumn(name = "id_cinema")
    Cinema cinema;
}
