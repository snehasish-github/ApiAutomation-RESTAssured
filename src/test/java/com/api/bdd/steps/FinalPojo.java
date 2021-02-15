package com.api.bdd.steps;

import java.util.List;

public class FinalPojo {
    String companyName;
    String companyHOCity;
    String companyCEO;
    List<String> supportedSalaryBanks;
    List<Employee> employee;
    List<Contractors> contractors;
    CompanyPFDetails companyPFDetails;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyHOCity() {
        return companyHOCity;
    }

    public void setCompanyHOCity(String companyHOCity) {
        this.companyHOCity = companyHOCity;
    }

    public String getCompanyCEO() {
        return companyCEO;
    }

    public void setCompanyCEO(String companyCEO) {
        this.companyCEO = companyCEO;
    }

    public List<String> getSupportedSalaryBanks() {
        return supportedSalaryBanks;
    }

    public void setSupportedSalaryBanks(List<String> supportedSalaryBanks) {
        this.supportedSalaryBanks = supportedSalaryBanks;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public List<Contractors> getContractors() {
        return contractors;
    }

    public void setContractors(List<Contractors> contractors) {
        this.contractors = contractors;
    }

    public CompanyPFDetails getCompanyPFDetails() {
        return companyPFDetails;
    }

    public void setCompanyPFDetails(CompanyPFDetails companyPFDetails) {
        this.companyPFDetails = companyPFDetails;
    }
}
