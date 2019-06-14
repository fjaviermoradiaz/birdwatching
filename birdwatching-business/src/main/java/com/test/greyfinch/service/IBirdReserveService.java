package com.test.greyfinch.service;

import com.test.greyfinch.dto.BirdDTO;
import com.test.greyfinch.dto.BirdReserveDTO;

import java.util.Date;
import java.util.List;

public interface IBirdReserveService {

    List<BirdReserveDTO> getAll();

    List<BirdReserveDTO> filterByDate(Date filterDate);

}
