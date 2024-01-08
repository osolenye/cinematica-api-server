package com.example.cinema.services.impl;

import com.example.cinema.dao.CinemaRepository;
import com.example.cinema.dao.HallRepository;
import com.example.cinema.mapper.CinemaMapper;
import com.example.cinema.mapper.HallMapper;
import com.example.cinema.microservices.jsons.FileResponse;
import com.example.cinema.models.dto.entityDto.CinemaDto;
import com.example.cinema.models.dto.entityDto.HallDto;
import com.example.cinema.models.dto.requests.HallCreateRequest;
import com.example.cinema.models.entities.Cinema;
import com.example.cinema.models.entities.Hall;
import com.example.cinema.services.CinemaService;
import com.example.cinema.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HallServiceImpl implements HallService {
    private final HallRepository repository;
    private final CinemaRepository cinemaRepository;
    private final CinemaService cinemaService;


    @Override
    public HallDto save(HallDto hall) {
        Hall result = HallMapper.MAPPER.dtoToEntity(hall);
        result = repository.save(result);
        hall = HallMapper.MAPPER.entityToDto(result);
        return hall;
    }

    @Override
    public Hall findById(Long id) {
        return null;
    }



    @Override
    public List<Hall> findAll() {
        return null;
    }

    @Override
    public HallDto create(HallCreateRequest request) {
        try {
            HallDto hall = new HallDto();
            hall.setName(request.getName());
            hall.setHallType(request.getHallType());
            Cinema cinema = cinemaService.findById(request.getCinemaId());
            System.out.println(cinema.getName());
            System.out.println(cinema.getLogo());
            System.out.println(cinema.getId());
            CinemaDto cinemaDto = CinemaMapper.MAPPER.entityToDto(cinema);
            hall.setCinema(cinemaDto);
            return save(hall);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
