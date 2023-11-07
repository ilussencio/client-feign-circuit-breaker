package com.iftm.startexample.models.dtos;

public class AnnualWageDTO {
    private String firstName;
    private Double annualWage;

    public AnnualWageDTO() {
    }
    public AnnualWageDTO(String firstName, Double annualWage) {
        this.firstName = firstName;
        this.annualWage = annualWage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getAnnualWage() {
        return annualWage;
    }

    public void setAnnualWage(Double annualWage) {
        this.annualWage = annualWage;
    }
}
