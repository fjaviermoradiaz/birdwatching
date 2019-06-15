package com.test.greyfinch.service;

import com.test.greyfinch.dto.ReserveCreationDTO;
import com.test.greyfinch.dto.ReserveDTO;
import com.test.greyfinch.dto.ReserveUpdateDTO;
import com.test.greyfinch.exception.DeleteException;
import com.test.greyfinch.exception.EntityNotFoundException;

import javax.validation.ValidationException;
import java.util.List;

public interface IReserveService {

    List<ReserveDTO> getAll();

    ReserveDTO create(ReserveCreationDTO reserveCreationDTO) throws ValidationException;

    void delete(Long id) throws DeleteException;

    ReserveDTO update(ReserveUpdateDTO reserveUpdateDTO);

    ReserveDTO getById(Long id) throws EntityNotFoundException;

}
