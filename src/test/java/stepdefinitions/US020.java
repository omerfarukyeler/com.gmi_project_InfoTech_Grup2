package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US020 {

    public Map<String,String> generateBodyForAuthToken(){
        Map<String,String> authBody = new HashMap<>();
        authBody.put("username","admin2023");
        authBody.put("rememberMe","true");
        authBody.put("password","Admin.Strator23");

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




    @Given("User reads information")
    public void userReadsInformation() {

        String authToken = getAuthToken();

        System.out.println(getAuthToken());

        Response response = given().header("Authorization","Bearer "+".eyJzdWIiOieyJhbGciOiJIUzUxMiJ9JhZG1pbjIwMjMiLCJhdXRoIjoiUk9MRV9BRE1JTiIsImV4cCI6MTY4NDYzMjgzMn0.myIVD4DQK3nwewUVuHOaDsXBSjFkC1Fv095UTCzsQC6XFfPOASqS9Agxp5k_E3dzkUiy8C1UizC1h1h0rJr4Jg\n")
                .contentType(ContentType.JSON).when()
                .get("https://gmibank.com/api/tp-customers")
                .then()
                .contentType(ContentType.JSON)
                .header("X-Total-Count","1847")
                .statusCode(200)
                .extract().response();
        response.prettyPrint();


    }

    @Then("User checks the accuracy of the information")
    public void userChecksTheAccuracyOfTheInformation() {

            String authToken = getAuthToken();

            System.out.println(getAuthToken());

            Response response = given().header("Authorization","Bearer "+"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbjIwMjMiLCJhdXRoIjoiUk9MRV9BRE1JTiIsImV4cCI6MTY4NDYzMjgzMn0.myIVD4DQK3nwewUVuHOaDsXBSjFkC1Fv095UTCzsQC6XFfPOASqS9Agxp5k_E3dzkUiy8C1UizC1h1h0rJr4Jg\n")
                    .contentType(ContentType.JSON).when()
                    .get("https://gmibank.com/api/tp-customers/126294")
                    .then()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .extract().response();
            response.prettyPrint();

            String expectedValue="{\"id\":126294,\"firstName\":\"Deneme\",\"lastName\":\"Last\",\"middleInitial\":\"M\",\"email\":\"ma34@gmail.com\",\"mobilePhoneNumber\":null,\"phoneNumber\":\"123-123-3434\",\"zipCode\":null,\"address\":\"NYC\",\"city\":null,\"ssn\":\"123-34-3434\",\"createDate\":null,\"zelleEnrolled\":null,\"country\":null,\"state\":null,\"user\":null,\"accounts\":[]}";

            String actualValue =response.body().print();

            Assert.assertEquals(expectedValue,actualValue);




        }




    }


