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
    private ApiUtils apiUtils;

    public UserStep(ApiUtils apiUtils ){
        this.apiUtils=apiUtils;
    }

    @Before
   public void  before(Scenario scenario){
        this.scenario=scenario;
//        Framework.framework.crateInstance();
//        oApiUtils=Framework.framework.apiutils;
    }

    @Given("user triggers getUser Api")
    public void user_triggers_getUser_Api() {
        try{
            String url=apiUtils.getProperty("baseUrl").concat("api/users?page=2");
            request=apiUtils.Request();
            response=apiUtils.getResponse(request,url);
            scenario.write("Status Code: "+response.getStatusCode());
            scenario.write("Api Response \n"+response.getBody().prettyPrint());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Given("user triggers createUser Api")
    public void user_triggers_createUser_Api() {
       
    }

    @Given("verify Api responseCode {int}")
    public void verify_Api_responseCode(int statusCode) {
        apiUtils.responseCode(response,statusCode);
    }
}
