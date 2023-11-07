package com.iftm.startexample.services;

import com.iftm.startexample.Feign.FeignConsumer;
import com.iftm.startexample.models.dtos.EmployeeAnnualWageDTO;
import com.iftm.startexample.models.dtos.EmployeeDTO;
import com.iftm.startexample.repositories.EmployeeRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AnnualWageService {

    @Autowired
    private EmployeeService service;

    @Autowired
    FeignConsumer feignConsumer;
    public ResponseEntity<EmployeeAnnualWageDTO> getAnnualWage(String id) {
        var employee = service.findById(new ObjectId(id));
        if(employee.getBody() == null)
            return ResponseEntity.notFound().build();

        var annualWage = feignConsumer.getResponse(employee.getBody());
        if(annualWage.getBody() == null)
            ResponseEntity.internalServerError();

        return ResponseEntity.ok(new EmployeeAnnualWageDTO(employee.getBody().getId(), new Date(), annualWage.getBody()));
    }
}
