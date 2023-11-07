package com.iftm.startexample.controllers;

import com.iftm.startexample.models.dtos.EmployeeAnnualWageDTO;
import com.iftm.startexample.models.dtos.EmployeeDTO;
import com.iftm.startexample.services.AnnualWageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/annual-wages")
public class AnnualWageController {
    @Autowired
    private AnnualWageService annualWageService;


    @GetMapping("{id}")
    public ResponseEntity<EmployeeAnnualWageDTO> calculateAnnualWage(@PathVariable("id") String id) {
        return annualWageService.getAnnualWage(id);
    }
}
