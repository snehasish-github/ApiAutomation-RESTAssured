package com.api.bdd.steps;

public class Employee {
    String firstName;
    String lastNme;
    String gender;
    int age;
    double salary;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNme(String lastNme) {
        this.lastNme = lastNme;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    boolean married;

    public String getFirstName() {
        return firstName;
    }

    public String getLastNme() {
        return lastNme;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isMarried() {
        return married;
    }
}
