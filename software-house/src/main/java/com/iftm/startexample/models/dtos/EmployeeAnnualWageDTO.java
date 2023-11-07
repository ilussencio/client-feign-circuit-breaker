package com.iftm.startexample.models.dtos;

import javax.xml.crypto.Data;
import java.util.Date;

public class EmployeeAnnualWageDTO {

    private String id;
    private Date date = new Date();
    private AnnualWageDTO annualWage;


    public EmployeeAnnualWageDTO() {
    }

    public EmployeeAnnualWageDTO(String id, Date date, AnnualWageDTO annualWage) {
        this.id = id;
        this.date = date;
        this.annualWage = annualWage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AnnualWageDTO getAnnualWage() {
        return annualWage;
    }

    public void setAnnualWage(AnnualWageDTO annualWage) {
        this.annualWage = annualWage;
    }
}
