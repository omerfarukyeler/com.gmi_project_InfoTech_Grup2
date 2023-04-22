package stepdefinitions;

import baseURL.StatesURL;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.ResponseStates;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US024_1 extends StatesURL {


    public Map<String,String> generateBodyForAuthToken(){
        Map<String,String> authBody = new HashMap<>();
        authBody.put("username","user2023");
        authBody.put("rememberMe","true");
        authBody.put("password","User.Name23");

        return authBody;
    }

    public String getAuthToken(){

        Map<String,String> body = generateBodyForAuthToken();

        Response response = RestAssured
                .given().baseUri("https://gmibank.com/api/authenticate")
                .contentType(ContentType.JSON)
                .body(body).log().uri().log().body()
                .when().post()
                .then().statusCode(200)
                .extract().response();

        return (String) response.path("id_token");
    }

    @Test
    public void US020_1(){

        String authToken = getAuthToken();

        System.out.println(getAuthToken());

        specStates.pathParam("pp1","tp-states");

        ResponseStates responseStates =new ResponseStates(22726,"Amsterdam",null);

        System.out.println(responseStates);

        Response response =given().header("Authorization","Bearer "+"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyMjAyMyIsImF1dGgiOiJST0xFX1VTRVIiLCJleHAiOjE2ODQ3NjQwMDh9.MHkmkSRp6FrGZTQ3yhIgDkj2CnV6cFlti62cQpBZSaQb6UWb10zJrIIHqwnm__kHTiJIZSEIAOHSAbOkdwASMg\n")
                .contentType(ContentType.JSON).
                spec(specStates).
                body(responseStates).
                when().post("{pp1}");

        response.prettyPrint();

        Assert.assertEquals(400,response.getStatusCode());


    }









}
