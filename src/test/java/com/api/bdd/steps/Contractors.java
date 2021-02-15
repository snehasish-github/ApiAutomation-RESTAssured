package com.api.bdd.steps;

public class Contractors {

    String firstName;
    String lastName;
    String contractFrom;
    String ContractTo;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContractFrom(String contractFrom) {
        this.contractFrom = contractFrom;
    }

    public void setContractTo(String contractTo) {
        ContractTo = contractTo;
    }

    public String getContractFrom() {
        return contractFrom;
    }

    public String getContractTo() {
        return ContractTo;
    }
}
