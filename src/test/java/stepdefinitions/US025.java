package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.PostCountry;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US025 {
    Response response;
    PostCountry postCountry;
    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .addHeader("Authorization",generateToken())
            .setBaseUri("https://www.gmibank.com/api")
            .build();
    @Given("User sends post request for create country")
    public void userSendsPostRequestForCreateCountry() {
        postCountry = new PostCountry();
        postCountry.setName("The Netherlands");
        postCountry.setStates(null);
        requestSpecification.pathParam("pp1", "tp-countries");
        response = given().spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(postCountry)
                .when().post("/{pp1}");
        response.prettyPrint();

    }

    @Then("User gets already created country and validate one by one")
    public void userGetsAlreadyCreatedCountryAndValidateOneByOne() {
        Assert.assertEquals(201, response.statusCode());
        PostCountry actualValue = response.as(PostCountry.class);
        Assert.assertEquals(postCountry.getName(),actualValue.getName());
        Assert.assertEquals(postCountry.getStates(),actualValue.getStates());
    }
}
