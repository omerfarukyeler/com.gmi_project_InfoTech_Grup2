package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US027 {
    RequestSpecification spec = new RequestSpecBuilder().
            setContentType(ContentType.JSON).
            addHeader("Authorization",  generateToken()).
            setBaseUri("https://www.gmibank.com").
            build();
    Response response;
    @Given("User sends delete request for delete state")
    public void userSendsDeleteRequestForDeleteState() {
        spec.pathParams("first", "api", "second", "tp-states", "third", 22735);
        response = given(spec).when().delete("/{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("User gets already delete state and validate one by one")
    public void userGetsAlreadyDeleteStateAndValidateOneByOne() {
        Assert.assertEquals(204,response.statusCode());
    }
}
