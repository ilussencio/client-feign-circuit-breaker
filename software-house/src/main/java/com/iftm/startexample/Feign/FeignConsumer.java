package com.iftm.startexample.Feign;

import com.iftm.startexample.models.dtos.AnnualWageDTO;
import com.iftm.startexample.models.dtos.EmployeeDTO;
import com.iftm.startexample.models.dtos.ResponseDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@FeignClient(value = "producer")
public interface FeignConsumer {

    @GetMapping("/api/calculate-annual-wage")
    @CircuitBreaker(name = "consumer", fallbackMethod = "getResponse")
    ResponseEntity<AnnualWageDTO> getResponse(EmployeeDTO employeeDTO);

    default ResponseEntity<ResponseDTO> getResponse(Throwable t) {
        var message = "Erro ao tentar acessar o microsserviço producer!";
        return ResponseEntity.internalServerError().body(new ResponseDTO("Fallback response!", message, new Date()));
    }
}