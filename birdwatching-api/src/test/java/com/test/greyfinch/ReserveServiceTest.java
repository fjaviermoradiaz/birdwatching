package com.test.greyfinch;

import com.test.greyfinch.dto.ReserveCreationDTO;
import com.test.greyfinch.dto.ReserveDTO;
import com.test.greyfinch.exception.DeleteException;
import com.test.greyfinch.exception.EntityNotFoundException;
import com.test.greyfinch.service.ReserveService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ReserveServiceTest {

    private static final String NAME = "Name1";

    private static final String REGION = "Region1";

    private ReserveCreationDTO reserveCreationDTO;

    @Mock
    private ReserveService service;

    @Before
    public void prepare() throws EntityNotFoundException {
        ReserveDTO reserve = new ReserveDTO();
        reserve.setId(1L);
        reserve.setName(NAME);

        reserveCreationDTO = new ReserveCreationDTO();
        reserveCreationDTO.setName(NAME);
        reserveCreationDTO.setRegion(REGION);


        List<ReserveDTO> reserveList = new ArrayList<>();
        reserveList.add(reserve);

        // getAllReserve
        when(service.getAll()).thenReturn(reserveList);

        // getOneReserve
        when(service.getById(anyLong())).thenReturn(reserve);

        // create empty reserve
        when(service.create(any(ReserveCreationDTO.class)))
                .thenThrow(ValidationException.class);
    }

    @Test
    public void testAllReserves() {
        List<ReserveDTO> reserveDTOList = service.getAll();

        Assert.assertNotNull(reserveDTOList);
        Assert.assertTrue(reserveDTOList.size() > 0);

        Assert.assertEquals(reserveDTOList.get(0).getName(), NAME);

    }

    @Test
    public void testGetReserve() throws EntityNotFoundException {
        ReserveDTO uDto = service.getById(1L);

        Assert.assertNotNull(uDto);
        Assert.assertEquals(uDto.getName(), NAME);
    }

    @Test(expected = ValidationException.class)
    public void testAddReserve()  {
        service.create(new ReserveCreationDTO());
    }

    @Test
    public void testDeleteReserve() throws DeleteException {
        service.delete(1L);
    }
}
