package com.test.greyfinch.controller;


import com.test.greyfinch.dto.BirdDTO;
import com.test.greyfinch.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/bird")
public class BirdController {

    @Autowired
    private BirdService service;

    @GetMapping(value = "/list")
    @ResponseBody
    public ResponseEntity<List<BirdDTO>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
