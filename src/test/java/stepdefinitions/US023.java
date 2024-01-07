package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.GetRegistrations;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US023 {
    RequestSpecification spec = new RequestSpecBuilder().
            setContentType(ContentType.JSON).
            addHeader("Authorization",  generateToken()).
            setBaseUri("https://www.gmibank.com").
            build();
    Response response;
    @Given("user sends get request for getting registrants")
    public void userSendsGetRequestForGettingRegistrants() {
        spec.pathParams("first", "api", "second", "tp-account-registrations", "third", 2230);
        response = given(spec).when().get("/{first}/{second}/{third}");
        response.prettyPrint();

    }

    @Then("user gets the datas and assert")
    public void userGetsTheDatasAndAssert() {
        GetRegistrations expectedData = new GetRegistrations(2230, "108-22-1905", "Aziz", "Eke",
                "Ipeirou 8", "698-578-0714", 2180, "azizeke47",
                "azizekeathn@gmail.com", "2020-11-04T08:19:00.269Z");
        GetRegistrations actualData = response.as(GetRegistrations.class);

        Assert.assertEquals(200, response.statusCode());
        System.out.println("actualData = " + actualData);
        Assert.assertEquals(expectedData.getId(),actualData.getId());
        Assert.assertEquals(expectedData.getSsn(),actualData.getSsn());
        Assert.assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        Assert.assertEquals(expectedData.getLastName(),actualData.getLastName());
        Assert.assertEquals(expectedData.getAddress(),actualData.getAddress());
        Assert.assertEquals(expectedData.getMobilePhoneNumber(),actualData.getMobilePhoneNumber());
        Assert.assertEquals(expectedData.getUserId(),actualData.getUserId());
        Assert.assertEquals(expectedData.getUserName(),actualData.getUserName());
        Assert.assertEquals(expectedData.getEmail(),actualData.getEmail());
        Assert.assertEquals(expectedData.getCreateDate(),actualData.getCreateDate());



    }
}
