package com.api.bdd.steps;
import com.api.bdd.utils.ApiUtils;
import com.google.gson.JsonObject;
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
        try{
            String url=apiUtils.getProperty("baseUrl").concat("api/users");
            JsonObject jsonPayload=new JsonObject();
            jsonPayload.addProperty("name","morpheus");
            jsonPayload.addProperty("job","leader");
            request=apiUtils.Request().
                    body(jsonPayload.toString());
            response=apiUtils.getPostResponse(request,url);
            scenario.write("CreateUser API Request:"+request.and().log().body()+"\n Createuser ApiResponse \n"+response.getBody().prettyPrint());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Given("verify Api responseCode {int}")
    public void verify_Api_responseCode(int statusCode) {
        apiUtils.responseCode(response,statusCode);
    }
}
