package com.example.cinema.services.impl;

import com.example.cinema.dao.FilmRepository;
import com.example.cinema.mapper.FilmMapper;
import com.example.cinema.microservices.FileServiceFeign;
import com.example.cinema.microservices.jsons.FileResponse;
import com.example.cinema.models.dto.entityDto.FilmDto;
import com.example.cinema.models.dto.requests.FilmCreateRequest;
import com.example.cinema.models.entities.Film;
import com.example.cinema.services.FilmHallService;
import com.example.cinema.services.FilmService;
import com.example.cinema.services.HallService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
//@AllArgsConstructor
public class FilmServiceImpl implements FilmService {
    private final FilmRepository repository;
    private final FileServiceFeign fileServiceFeign;
    private final FilmHallService filmHallService;
    private final HallService hallService;
    Long hallId;

    public FilmServiceImpl(FilmRepository repository, FileServiceFeign fileServiceFeign, FilmHallService filmHallService, HallService hallService) {
        this.repository = repository;
        this.fileServiceFeign = fileServiceFeign;
        this.filmHallService = filmHallService;
        this.hallService = hallService;
    }

    @Override
    public FilmDto save(FilmDto filmDto) {
        Film result = FilmMapper.MAPPER.dtoToEntity(filmDto);
        result = repository.save(result);
        filmDto = FilmMapper.MAPPER.entityToDto(result);

        filmHallService.create(filmDto, hallId);

        return filmDto;
    }

    @Override
    public Film findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("no such id"));

    }

    @Override
    public List<Film> findAll() {
        return null;
    }

    @Override
    public FilmDto create(MultipartFile logo, FilmCreateRequest request) {
        try {
            FilmDto filmDto = new FilmDto();
            filmDto.setName(request.getName());
            filmDto.setDescription(request.getDescription());
            filmDto.setGenre(request.getGenre());
            FileResponse fileResponse = fileServiceFeign.upload(logo);
            filmDto.setLogo(fileResponse.getDownloadUri());

//            FilmHallDto filmHallDto = new FilmHallDto();
//            filmHallDto.setFilm(filmDto);
//            filmHallDto.setHall(HallMapper.MAPPER.entityToDto(hallService.findById(request.getHallId())));
//            filmHallService.create(filmDto, request.getHallId());
                hallId = request.getHallId();


            return save(filmDto);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
