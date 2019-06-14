package com.test.greyfinch;

import com.test.greyfinch.converter.ReserveConverter;
import com.test.greyfinch.dto.ReserveCreationDTO;
import com.test.greyfinch.dto.ReserveDTO;
import com.test.greyfinch.model.Bird;
import com.test.greyfinch.model.Reserve;
import com.test.greyfinch.repository.ReserveRepository;
import com.test.greyfinch.service.BirdService;
import com.test.greyfinch.service.ReserveService;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import springfox.documentation.swagger2.mappers.ModelMapper;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ReserveServiceTest {

    @Mock
    private ReserveRepository repository;
    private Reserve reserve;
    @Mock
    private ReserveConverter converter;
    private ReserveCreationDTO reserveDTO;
    private ReserveDTO dto;

    @InjectMocks
    private ReserveService service;

    @Before
    public void setUp() {
        reserve = new Reserve(1L, "Mockito", "mkyong");

        converter = mock(ReserveConverter.class);
        reserve = new Reserve();
        reserveDTO = new ReserveCreationDTO();
        reserveDTO = new ReserveCreationDTO();

        reserveDTO.setName("Reserve1");
        reserveDTO.setRegion("Reserve1");

        dto = new ReserveDTO();
        dto.setName("Reserve1");


        service = new ReserveService(repository,converter);
    }

    @Test
    public void testUpdateW() {

        ReserveService dataServiceMock = mock(ReserveService.class);
        when(dataServiceMock.create(reserveDTO)).thenReturn(dto);
        ReserveDTO findDTO = dataServiceMock.getById(dto.getId());

        assertEquals(findDTO.getId(), dto.getId());
    }


}
