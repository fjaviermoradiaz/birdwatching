package com.test.greyfinch.service;

import com.test.greyfinch.converter.BirdConverter;
import com.test.greyfinch.converter.ReserveConverter;
import com.test.greyfinch.dto.BirdDTO;
import com.test.greyfinch.dto.ReserveCreationDTO;
import com.test.greyfinch.dto.ReserveDTO;
import com.test.greyfinch.dto.ReserveUpdateDTO;
import com.test.greyfinch.model.Bird;
import com.test.greyfinch.model.Reserve;
import com.test.greyfinch.repository.BirdRepository;
import com.test.greyfinch.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReserveService implements IReserveService {

    private ReserveRepository repository;
    private ReserveConverter converter;

    public ReserveService() {
    }

    @Autowired
    public ReserveService(ReserveRepository reserveRepository, ReserveConverter reserveConverter) {
        repository = reserveRepository;
        converter = reserveConverter;
    }

    @Override
    public List<ReserveDTO> getAll() {
        return repository.findAll().stream().map(converter::toDto).collect(Collectors.toList());

    }

    @Override
    public ReserveDTO create(ReserveCreationDTO reserveCreationDTO) {
        return converter.toDto(repository.save(converter.toEntity(reserveCreationDTO)));
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public ReserveDTO update(ReserveUpdateDTO reserveUpdateDTO) {
        return converter.toDto(repository.save(converter.toEntity(reserveUpdateDTO)));
    }

    @Override
    public ReserveDTO getById(Long id) {
        return converter.toDto(repository.getOne(id));
    }
}
