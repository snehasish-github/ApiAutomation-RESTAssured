package com.api.bdd.steps;

public class CompanyPFDetails {
    String pfName;
    String pfCity;
    String ofYear;
    double noOfEmployees;

    public String getPfName() {
        return pfName;
    }

    public void setPfName(String pfName) {
        this.pfName = pfName;
    }

    public String getPfCity() {
        return pfCity;
    }

    public void setPfCity(String pfCity) {
        this.pfCity = pfCity;
    }

    public String getOfYear() {
        return ofYear;
    }

    public void setOfYear(String ofYear) {
        this.ofYear = ofYear;
    }

    public double getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(double noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }
}
