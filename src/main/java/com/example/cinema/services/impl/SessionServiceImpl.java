package com.example.cinema.services.impl;

import com.example.cinema.dao.SessionRepository;
import com.example.cinema.mapper.FilmMapper;
import com.example.cinema.mapper.HallMapper;
import com.example.cinema.mapper.SessionMapper;
import com.example.cinema.models.dto.entityDto.SessionDto;
import com.example.cinema.models.dto.requests.SessionCreateRequest;
import com.example.cinema.models.entities.Session;
import com.example.cinema.services.FilmService;
import com.example.cinema.services.HallService;
import com.example.cinema.services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;
    private final FilmService filmService;
    private final HallService hallService;

    @Override
    public SessionDto save(SessionDto sessionDto) {
        Session session = SessionMapper.MAPPER.dtoToEntity(sessionDto);
        session = sessionRepository.save(session);
        sessionDto = SessionMapper.MAPPER.entityToDto(session);
        return sessionDto;
    }

    @Override
    public Session findById(Long id) {
        return sessionRepository.findById(id).orElseThrow(() -> new RuntimeException("no such id"));

    }

    @Override
    public List<Session> findAll() {
        return null;
    }

    @Override
    public SessionDto create(SessionCreateRequest request) {
        try {
            SessionDto sessionDto = new SessionDto();
            sessionDto.setFilm(FilmMapper.MAPPER.entityToDto(filmService.findById(request.getFilmId())));
            sessionDto.setHall(HallMapper.MAPPER.entityToDto(hallService.findById(request.getFilmId())));
            sessionDto.setDateTime(request.getDateTime());
            return save(sessionDto);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
