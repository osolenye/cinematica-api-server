package com.example.cinema.services.impl;

import com.example.cinema.dao.SeatRepository;
import com.example.cinema.mapper.SeatMapper;
import com.example.cinema.models.dto.entityDto.SeatDto;
import com.example.cinema.models.dto.requests.SeatCreateRequest;
import com.example.cinema.models.entities.Seat;
import com.example.cinema.services.SeatService;
import com.example.cinema.services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SeatServiceImpl implements SeatService {
    private final SessionService sessionService;
    private final SeatRepository seatRepository;

    @Override
    public SeatDto save(SeatDto seatDto) {
        Seat seat = SeatMapper.MAPPER.dtoToEntity(seatDto);
        seat = seatRepository.save(seat);
        seatDto = SeatMapper.MAPPER.entityToDto(seat);
        return seatDto;
    }


    @Override
    public Seat findById(Long id) {
        return seatRepository.findById(id).orElseThrow(() -> new RuntimeException("no such id"));

    }

    @Override
    public List<Seat> findAll() {
        return null;
    }

    @Override
    public SeatDto create(SeatCreateRequest request) {
        try {
            SeatDto seatDto = new SeatDto();
            seatDto.setNum(request.getNum());
            seatDto.setRow(request.getRow());
            seatDto.setStatus(request.getStatus());
            seatDto.setSession(sessionService.findById(request.getSessionId()));
            return save(seatDto);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
