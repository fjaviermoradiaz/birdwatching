package com.test.greyfinch.converter;

import com.test.greyfinch.dto.BirdDTO;
import com.test.greyfinch.dto.ReserveCreationDTO;
import com.test.greyfinch.dto.ReserveDTO;
import com.test.greyfinch.dto.ReserveUpdateDTO;
import com.test.greyfinch.model.Bird;
import com.test.greyfinch.model.Reserve;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ReserveConverter {

    public ReserveDTO toDto(Reserve reserve) {
        ReserveDTO reserveDTO = new ReserveDTO();
        BeanUtils.copyProperties(reserve,reserveDTO);
        return reserveDTO;
    }

    public Reserve toEntity(ReserveDTO reserveDTO) {
        Reserve reserve = new Reserve();
        BeanUtils.copyProperties(reserveDTO,reserve);
        return reserve;
    }

    public Reserve toEntity(ReserveCreationDTO reserveDTO) {
        Reserve reserve = new Reserve();
        BeanUtils.copyProperties(reserveDTO,reserve);
        return reserve;
    }

    public Reserve toEntity(ReserveUpdateDTO reserveDTO) {
        Reserve reserve = new Reserve();
        BeanUtils.copyProperties(reserveDTO,reserve);
        return reserve;
    }
}
