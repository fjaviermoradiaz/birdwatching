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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import springfox.documentation.swagger2.mappers.ModelMapper;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ReserveServiceTest {

    private static final String NAME = "Name1";

    private static final String REGION = "Region1";

    private ReserveCreationDTO reserveCreationDTO;

    @Mock
    private ReserveService service;// = new ReserveService();

    @Mock
    private ReserveRepository repository;

    @Before
    public void prepare() {
        Reserve reserve = new Reserve(1L,NAME,REGION);

        reserveCreationDTO = new ReserveCreationDTO();
        reserveCreationDTO.setName(NAME);
        reserveCreationDTO.setRegion(REGION);


        List<Reserve> reserveList = new ArrayList<>();
        reserveList.add(reserve);

        // getAllReserve
        when(repository.findAll()).thenReturn(reserveList);

        // getOneReserve
        when(repository.getOne(anyLong())).thenReturn(reserve);

    }

    @Test
    public void testAllReserves() {
        List<Reserve> reserveDTOList = repository.findAll();

        Assert.assertNotNull(reserveDTOList);
        Assert.assertTrue(reserveDTOList.size() > 0);

        Assert.assertEquals(reserveDTOList.get(0).getName(), NAME);

    }
}
