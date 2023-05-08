package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.ResponseStates;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US024 {

    Response response;
    ResponseStates responseStates;

    RequestSpecification requestSpecification=new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .addHeader("Authorization",generateToken())
            .setBaseUri("https://www.gmibank.com/api")
            .build();
    @Given("User creates a new datas")
    public void userCreatesANewDatas() {

        responseStates = new ResponseStates();
        responseStates.setName("Turkey");
        responseStates.setTpcountry(null);
        requestSpecification.pathParam("pp1","tp-states");

        response = given().spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(responseStates)
                .when().post("/{pp1}");
        response.prettyPrint();


    }

    @Then("Verify status codes")
    public void verifyStatusCodes() {

        Assert.assertEquals(201,response.getStatusCode());
    }
}

