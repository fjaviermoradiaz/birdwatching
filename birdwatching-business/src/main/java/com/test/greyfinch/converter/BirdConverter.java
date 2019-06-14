package com.test.greyfinch.converter;

import com.test.greyfinch.dto.BirdDTO;
import com.test.greyfinch.dto.BirdExtendedDTO;
import com.test.greyfinch.model.Bird;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BirdConverter {

    public BirdDTO toDto(Bird bird) {
        BirdDTO birdDTO = new BirdDTO();
        BeanUtils.copyProperties(bird,birdDTO);
        return birdDTO;
    }

    public Bird toEntity(BirdDTO birdDTO) {
        Bird bird = new Bird();
        BeanUtils.copyProperties(birdDTO,bird);
        return bird;
    }

    public BirdExtendedDTO toDtoExtended(Bird bird) {
        BirdExtendedDTO birdDTO = new BirdExtendedDTO();
        BeanUtils.copyProperties(bird,birdDTO);
        return birdDTO;
    }

    public Bird toEntity(BirdExtendedDTO birdDTO) {
        Bird bird = new Bird();
        BeanUtils.copyProperties(birdDTO,bird);
        return bird;
    }


}
