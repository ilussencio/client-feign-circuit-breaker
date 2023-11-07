package com.iftm.producer.controllers;

import com.iftm.producer.models.dtos.AnnualWageDTO;
import com.iftm.producer.models.dtos.EmployeeDTO;
import com.iftm.producer.services.AnnualWageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResponseController {

    @Autowired
    private AnnualWageService service;

    @GetMapping("/calculate-annual-wage")
    public ResponseEntity<AnnualWageDTO> calculateAnnualWage(@RequestBody EmployeeDTO employee) {
        return service.calculateAnnualWage(employee);
    }

}
