package com.example.cinema.models.entities;

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
@Table(name = "tb_order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    double price;
    int num;

    @ManyToOne
    @JoinColumn(name = "id_order")
    Order order;

    @ManyToOne
    @JoinColumn(name = "id_seat")
    Seat seat;

    @ManyToOne
    @JoinColumn(name = "id_session")
    Session session;

}
