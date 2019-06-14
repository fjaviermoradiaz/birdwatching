package com.test.greyfinch.service;

import com.test.greyfinch.converter.BirdReserveConverter;
import com.test.greyfinch.dto.BirdReserveDTO;
import com.test.greyfinch.model.BirdReserve;
import com.test.greyfinch.repository.BirdReserveRepository;
import com.test.greyfinch.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BirdReserveService implements IBirdReserveService {

    @Autowired
    private BirdReserveConverter converter;

    @Autowired
    private BirdReserveRepository repository;


    @Override
    public List<BirdReserveDTO> getAll() {
        return repository.findAll().stream()
                .map(converter::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<BirdReserveDTO> filterByDate(Date filterDate) {
        return repository.findByMatchMonth(Utils.getMonthFromDate(filterDate))
                .stream()
                .map(converter::toDto)
                .collect(Collectors.toList());
    }
}
