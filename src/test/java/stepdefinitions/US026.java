package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.Countries;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US026 {
    RequestSpecification spec = new RequestSpecBuilder().
            setContentType(ContentType.JSON).
            addHeader("Authorization",  generateToken()).
            setBaseUri("https://www.gmibank.com").
            build();
    Response response;
    Countries expectedData;
    @Given("user sends put request for update country")
    public void user_sends_put_request_for_update_country() {
        //https://gmibank.com/api/tp-countries
//        {
//            "id": 184073,
//                "name": "Banana Republic",
//                "states": null
//        }

        spec.pathParams("first", "api", "second", "tp-countries");

        expectedData= new Countries(184073,"Banana Republic",null);
        response = given(spec).body(expectedData).when().put("/{first}/{second}");
        response.prettyPrint();
    }
    @Then("user gets the country data and assert")
    public void user_gets_the_country_data_and_assert() {

        Countries actualData= response.as(Countries.class);

        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getName(),actualData.getName());
        assertEquals(expectedData.getStates(),actualData.getStates());

    }

}
