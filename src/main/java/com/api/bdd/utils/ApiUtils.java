package com.api.bdd.utils;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    RequestSpecification request;
    Response response;

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
                    when().get(url);
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
            response.then().statusCode(rspCode);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}

