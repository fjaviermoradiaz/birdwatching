package com.test.greyfinch.service;

import com.test.greyfinch.dto.ReserveCreationDTO;
import com.test.greyfinch.dto.ReserveDTO;
import com.test.greyfinch.dto.ReserveUpdateDTO;

import java.util.List;

public interface IReserveService {

    List<ReserveDTO> getAll();

    void create(ReserveCreationDTO reserveCreationDTO);

    void delete(Long id);

    ReserveDTO update(ReserveUpdateDTO reserveUpdateDTO);

    ReserveDTO getById(Long id);

}
