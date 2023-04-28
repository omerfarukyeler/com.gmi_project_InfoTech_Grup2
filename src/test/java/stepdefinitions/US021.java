package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.Countries;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static utilities.Authentication.generateToken;

public class US021 {
    Response response;
    Countries expectedData;
    public Response getCountryWithId(int id){

        return RestAssured
                .given().accept(ContentType.ANY)
                .and().baseUri("https://www.gmibank.com/api")
                .and().header("Authorization", generateToken())
                .and().log().method().log().uri()
                .and().pathParam("countryId", id)
                .when().get("/tp-countries/{countryId}")
                .then().assertThat().statusCode(200).log().body()
                .extract().response();
    }

//    @Test
//    public void getCountry(){
//        getCountryWithId(24113);
//    }

    public Response getAllCountry(){

        return RestAssured
                .given().accept(ContentType.ANY)
                .and().baseUri("https://www.gmibank.com/api")
                .and().header("Authorization", generateToken())
                .and().log().method().log().uri()
                .when().get("/tp-countries")
                .then().assertThat().statusCode(200).log().body()
                .extract().response();
    }

    @Test
    public void getAllCountries(){
        getAllCountry();
        Map<String,Object> countryObject = getCountryWithId(1752).body().as(Map.class);
        assertEquals(1752,countryObject.get("id"));
        assertEquals("USA",countryObject.get("name"));
        String expStates = "";
        assertNull(expStates,countryObject.get("states"));

    }

    @Given("User sends get request for all countries")
    public void userSendsPutRequestForAllCountries() {
        getAllCountry();
    }

    @Then("User gets all countries and validate them")
    public void userGetsAllCountriesAndValidateThem() {

//        Countries actualData= response.as(Countries.class);
        Map<String,Object> actualData = getAllCountry().body().as(Map.class);
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getId(),actualData.get("id"));
        assertEquals(expectedData.getName(),actualData.get("name"));
        assertEquals(expectedData.getStates(),actualData.get("states"));
    }

    @Then("User gets all countries and validate them one by one")
    public void userGetsAllCountriesAndValidateThemOneByOne() {
        Map<String,Object> countryObject = getCountryWithId(1752).body().as(Map.class);
        assertEquals(1752,countryObject.get("id"));
        assertEquals("USA",countryObject.get("name"));
        String expStates = "";
        assertNull(expStates,countryObject.get("states"));

    }
}
