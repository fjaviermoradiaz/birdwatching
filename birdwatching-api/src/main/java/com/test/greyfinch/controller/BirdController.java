package com.test.greyfinch.controller;


import com.test.greyfinch.dto.BirdDTO;
import com.test.greyfinch.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/bird")
public class BirdController {

    @Autowired
    private BirdService service;

    @GetMapping(value = "/list")
    @ResponseBody
    public List<BirdDTO> getAll() {
        return service.getAll();
    }
}
