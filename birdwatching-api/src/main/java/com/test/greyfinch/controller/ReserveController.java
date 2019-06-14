package com.test.greyfinch.controller;

import com.test.greyfinch.dto.ReserveCreationDTO;
import com.test.greyfinch.dto.ReserveDTO;
import com.test.greyfinch.dto.ReserveUpdateDTO;
import com.test.greyfinch.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveController {

    @Autowired
    private ReserveService service;

    @GetMapping(value = "/list")
    @ResponseBody
    public ResponseEntity<List<ReserveDTO>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<ReserveDTO> getByID(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id),HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ReserveDTO> create(@RequestBody ReserveCreationDTO reserveCreationDTO) {
        return new ResponseEntity<>(service.create(reserveCreationDTO),HttpStatus.CREATED);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody ReserveUpdateDTO reserveUpdateDTO) {
        service.update(reserveUpdateDTO);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
