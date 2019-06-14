package com.test.greyfinch.controller;


import com.test.greyfinch.dto.BirdDTO;
import com.test.greyfinch.dto.BirdReserveDTO;
import com.test.greyfinch.service.BirdReserveService;
import com.test.greyfinch.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/bird/reserve")
public class BirdReserveController {

    @Autowired
    private BirdReserveService service;

    @PostMapping("/date")
    public ResponseEntity<List<BirdReserveDTO>> filter(@RequestParam("date")
                     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
        return new ResponseEntity<>(service.filterByDate(date), HttpStatus.OK);
    }
}
