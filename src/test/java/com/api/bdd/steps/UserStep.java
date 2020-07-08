package com.api.bdd.steps;
import com.api.bdd.utils.ApiUtils;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class UserStep {
    RequestSpecification request;
    Response response;
    Scenario scenario;
    ApiUtils apiUtils=new ApiUtils();


    @Before
   public void  brfore(Scenario scenario){
        this.scenario=scenario;
    }


    @Given("user triggers getUser Api")
    public void user_triggers_getUser_Api() {
        request=apiUtils.Request();
        response=apiUtils.getResponse(request,"https://reqres.in/api/users?page=2");
        scenario.write("Status Code: "+response.getStatusCode());
        scenario.write("Api Response \n"+response.getBody().prettyPrint());
    }
    @Given("verify Api responseCode {int}")
    public void verify_Api_responseCode(int statusCode) {
        apiUtils.responseCode(response,statusCode);

    }
}
