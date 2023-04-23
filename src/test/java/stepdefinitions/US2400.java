package stepdefinitions;

import baseURL.StatesURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US2400   {
    public Map<String, String> generateBodyForAuthToken() {
        Map<String, String> authBody = new HashMap<>();
        authBody.put("username", "user2023");
        authBody.put("rememberMe", "true");
        authBody.put("password", "User.Name23");

        return authBody;
    }
    public String getAuthToken() {

        Map<String, String> body = generateBodyForAuthToken();

        Response response = given().baseUri("https://gmibank.com/api/authenticate")
                .contentType(ContentType.JSON)
                .body(body).log().uri().log().body()
                .when().post()
                .then().statusCode(200)
                .extract().response();

        return (String) response.path("id_token");
    }




    @Given("User creates a new data")
    public void userCreatesANewData() {


        String authToken = getAuthToken();
        System.out.println(getAuthToken());

        RequestSpecification specStates = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization","Bearer " +"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyMjAyMyIsImF1dGgiOiJST0xFX1VTRVIiLCJleHAiOjE2ODQ4NzY4NTN9.qYIwxQZ2owvqOVgGANEjFsL6R_S-Ky5d72-Z6uAxbZrs37JiPLr8CZRuFGbz2fu4VtTk380XpeDl46KlYuLNww").
                setBaseUri("https://gmibank.com/api/").build();

        specStates.pathParam("pp1","tp-states");

        com.example.ResponseStates responseStates = new com.example.ResponseStates(22726,"Amsterdam",null);

        System.out.println(responseStates);
        Response response =given().header("Authorization","Bearer " +"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyMjAyMyIsImF1dGgiOiJST0xFX1VTRVIiLCJleHAiOjE2ODQ4NzY4NTN9.qYIwxQZ2owvqOVgGANEjFsL6R_S-Ky5d72-Z6uAxbZrs37JiPLr8CZRuFGbz2fu4VtTk380XpeDl46KlYuLNww")
                .contentType(ContentType.JSON)
                .spec(specStates)
                .body(responseStates)
                .when().post("{pp1}");

        response.prettyPrint();

        Assert.assertEquals(400,response.getStatusCode());
    }

    @Then("Verify status code")
    public void verifyStatusCode() {
    }
}
