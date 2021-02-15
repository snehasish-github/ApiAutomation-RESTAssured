package com.api.bdd.steps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DemoStep {


    public static void main(String[] args) throws FileNotFoundException {

       /* FinalPojo finalPojo=new FinalPojo();

        finalPojo.setCompanyCEO("David Thomas");
        finalPojo.setCompanyHOCity("NewYork");
        finalPojo.setCompanyName("ABC company");

        List<String> supportedSalaryBanks=new ArrayList<>();
        supportedSalaryBanks.add("City");
        supportedSalaryBanks.add("NYM");
        supportedSalaryBanks.add("DBS");
        finalPojo.setSupportedSalaryBanks(supportedSalaryBanks);

        Employee employee1=new Employee();
        employee1.setAge(30);
        employee1.setSalary(30000.00);
        employee1.setFirstName("Tom");
        employee1.setLastNme("yng");
        employee1.setGender("M");
        employee1.setMarried(true);

        Employee employee2=new Employee();
        employee2.setAge(35);
        employee2.setSalary(35000.00);
        employee2.setFirstName("Michel");
        employee2.setLastNme("Tsng");
        employee2.setGender("M");
        employee2.setMarried(false);
        List<Employee> li=new ArrayList<>();
        li.add(employee1);
        li.add(employee2);
        finalPojo.setEmployee(li);

        CompanyPFDetails companyPFDetails=new CompanyPFDetails();
        companyPFDetails.setNoOfEmployees(40);
        companyPFDetails.setOfYear("2015");
        companyPFDetails.setPfCity("NY");
        companyPFDetails.setPfName("Trust");
        finalPojo.setCompanyPFDetails(companyPFDetails);*/


        Gson gson=new Gson();
//        String jsonString=gson.toJson(employee);
//        System.out.println(jsonString);
       /* Gson gsonBuilder=new GsonBuilder().setPrettyPrinting().create();
        String jsonbuilderString=gsonBuilder.toJson(finalPojo);
        System.out.println(jsonbuilderString);*/
        File file=new File (System.getProperty("user.dir")+"\\src\\test\\resources\\response.json");
        FileReader fileReader=new FileReader(file);
        FinalPojo finalPojo=gson.fromJson(fileReader,FinalPojo.class);
        System.out.println(finalPojo.getCompanyCEO());
        List<Employee> employee=finalPojo.getEmployee();
        for(int i=0;i<employee.size();i++){
            if(employee.get(i).getFirstName().equals("Michel")){

            }

        }

    }


}
