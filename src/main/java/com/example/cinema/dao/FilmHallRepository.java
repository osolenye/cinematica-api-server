package com.example.cinema.dao;

import com.example.cinema.models.entities.FilmHall;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmHallRepository extends JpaRepository<FilmHall, Long> {
}
