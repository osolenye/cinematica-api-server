package com.example.cinema.services.impl;

import com.example.cinema.dao.PriceRepository;
import com.example.cinema.mapper.PriceMapper;
import com.example.cinema.models.dto.entityDto.PriceDto;
import com.example.cinema.models.dto.requests.PriceCreateRequest;
import com.example.cinema.models.entities.Price;
import com.example.cinema.services.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PriceServiceImpl implements PriceService {
    private final PriceRepository priceRepository;


    @Override
    public PriceDto save(PriceDto priceDto) {
        Price price = PriceMapper.MAPPER.dtoToEntity(priceDto);
        price = priceRepository.save(price);
        priceDto = PriceMapper.MAPPER.entityToDto(price);
        return priceDto;
    }

    @Override
    public Price findById(Long id) {
        return priceRepository.findById(id).orElseThrow(() -> new RuntimeException("no such id"));

    }

    @Override
    public List<Price> findAll() {
        return null;
    }

    @Override
    public PriceDto create(PriceCreateRequest request) {
        try {
            PriceDto priceDto = new PriceDto();
            priceDto.setPrice(request.getPrice());
            priceDto.setTicketType(request.getTicketType());
            return save(priceDto);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
