package com.test.greyfinch.converter;

import com.test.greyfinch.dto.BirdDTO;
import com.test.greyfinch.dto.BirdReserveDTO;
import com.test.greyfinch.model.Bird;
import com.test.greyfinch.model.BirdReserve;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BirdReserveConverter {

    @Autowired
    private BirdConverter birdConverter;

    @Autowired
    private ReserveConverter reserveConverter;

    public BirdReserveDTO toDto(BirdReserve birdReserve) {
        BirdReserveDTO birdReserveDTO = new BirdReserveDTO();
        BeanUtils.copyProperties(birdReserve,birdReserveDTO);
        entityToEntitiesDTO(birdReserve,birdReserveDTO);
        return birdReserveDTO;
    }

    public BirdReserve toEntity(BirdReserveDTO birdReserveDTO) {
        BirdReserve birdReserve = new BirdReserve();
        BeanUtils.copyProperties(birdReserveDTO,birdReserve);
        entitiesDTOtoEntity(birdReserveDTO,birdReserve);
        return birdReserve;
    }

    private void entitiesDTOtoEntity(BirdReserveDTO birdReserveDTO, BirdReserve birdReserve) {

        if (birdReserveDTO.getBird() != null)
            birdReserve.setBird(birdConverter.toEntity(birdReserveDTO.getBird()));
        if (birdReserveDTO.getReserve() != null)
            birdReserve.setReserve(reserveConverter.toEntity(birdReserveDTO.getReserve()));
    }

    private void entityToEntitiesDTO(BirdReserve birdReserve, BirdReserveDTO birdReserveDTO) {

        if (birdReserve.getBird() != null)
            birdReserveDTO.setBird(birdConverter.toDtoExtended(birdReserve.getBird()));

        if (birdReserve.getReserve() != null)
            birdReserveDTO.setReserve(reserveConverter.toDto(birdReserve.getReserve()));

    }
}
