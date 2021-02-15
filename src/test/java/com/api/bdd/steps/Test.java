package com.api.bdd.steps;


//what is constructor? why it is used?

//1. constructor name should be same as Class name
//2.constructor should not have any return type unlike methods
// jvm calls main method, it can be called without creating any object , that's why main method in static

public class Test {
    String name;
    int age;

    Test( String name, int age){
         this.name=name;
         this.age=age;
    }
    Test(){
        super();
    }

    public  static void main(String[] args) {
        Test t1=new Test("Tom",30);
   }
}
