package com.test.greyfinch.controller;

import com.test.greyfinch.dto.ReserveDTO;
import com.test.greyfinch.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveController {

    @Autowired
    private ReserveService service;

    @GetMapping(value = "/list")
    @ResponseBody
    public List<ReserveDTO> getAll() {
        return service.getAll();
    }

   /* @GetMapping
    @ResponseBody
    public ReserveDTO getByID()*/
}
