package com.test.greyfinch.service;

import com.test.greyfinch.converter.BirdConverter;
import com.test.greyfinch.dto.BirdDTO;

import com.test.greyfinch.model.Bird;
import com.test.greyfinch.repository.BirdRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BirdService implements IBirdService {

    @Autowired
    private BirdRepository repository;

    @Autowired
    private BirdConverter converter;

    @Override
    public List<BirdDTO> getAll() {
        return repository.findAll().stream().map(converter::toDto).collect(Collectors.toList());

    }
}
