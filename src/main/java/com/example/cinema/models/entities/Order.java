package com.example.cinema.models.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_order")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    double totalPrice;
    int num;
}
