package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.ResponseCustomers;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US020 {
    RequestSpecification spec =new RequestSpecBuilder().
            setContentType(ContentType.JSON).
            addHeader("Authorization",generateToken()).
            setBaseUri("https://www.gmibank.com").build();
    Response response;
    @Given("User reads information")
    public void userReadsInformation() {

        spec.pathParams("first","api","second","tp-customers","third",126294);

        response = given(spec).when().get("/{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("User checks the accuracy of the information")
    public void userChecksTheAccuracyOfTheInformation() {

        ResponseCustomers expectedData =new ResponseCustomers(126294,"Deneme","Last","M","ma34@gmail.com",null,"123-123-3434",
                null,"NYC",null,"123-34-3434",null,null,null,null,null,null
                 );
        ResponseCustomers actualData =response.as(ResponseCustomers.class);

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(expectedData.getId(),actualData.getId());
        Assert.assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        System.out.println(actualData);


    }



}


