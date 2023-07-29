package com.api.bdd.utils;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static io.restassured.RestAssured.given;


public class ApiUtils {

    RequestSpecification request;
    Response response;
    Properties prop;

    public void loadProperty(){
        try{
            InputStream inputStream=new FileInputStream(System.getProperty("user.dir").
                    concat(File.separator).
                    concat("config.properties"));
             prop=new Properties();
             prop.load(inputStream);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getProperty(String propertyName){
        try{
            if(prop==null){
                loadProperty();
                System.out.println("Executed");
            }
            return prop.getProperty(propertyName);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public RequestSpecification Request(){
        try{
            request =given().
                    headers("Content-Type","application/json");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return request;
    }

    public Response getResponse(RequestSpecification request,String url)
    {
        try{
            response=request.
                    when().
                    get(url);
            response.then().log().all();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }

    public Response getPostResponse(RequestSpecification request,String url)
    {
        try{
            response=request.
                    when().post(url);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }

    public Response getPutResponse(RequestSpecification request,String url)
    {
        try{
            response=request.
                    when().put(url);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }

    public Response getDeleteResponse(RequestSpecification request,String url)
    {
        try{
            response=request.
                    when().delete(url);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }

    public void responseCode(Response response,int rspCode){
        try{
            response.
                    then().
                    statusCode(rspCode);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}

