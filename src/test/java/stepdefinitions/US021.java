package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.Countries;
import utilities.CommenSteps;

import static org.junit.Assert.assertEquals;

public class US021 {
    Response response;
    Countries expectedData;
    @Given("User sends get request for all countries")
    public void userSendsPutRequestForAllCountries() {
        CommenSteps.getAllCountryApi();
    }

    @Then("User gets all countries and validate them one by one")
    public void userGetsAllCountriesAndValidateThemOneByOne() {
        Countries countryResponse = CommenSteps.getCountryWithIdApi(1752).body().as(Countries.class);
        expectedData= new Countries(1752,"USA",null);
        assertEquals(expectedData.getId(),countryResponse.getId());
        assertEquals(expectedData.getName(),countryResponse.getName());
        assertEquals(expectedData.getStates(),countryResponse.getStates());
    }
}
