package com.iftm.producer.services;

import com.iftm.producer.models.dtos.AnnualWageDTO;
import com.iftm.producer.models.dtos.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AnnualWageService {
    public ResponseEntity<AnnualWageDTO> calculateAnnualWage(EmployeeDTO employee) {
        var annualWage = employee.getWage() * 12;
        var dto = new AnnualWageDTO(employee.getFirstName(), annualWage);
        return ResponseEntity.ok().body(dto);
    }
}
