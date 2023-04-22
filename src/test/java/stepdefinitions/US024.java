package stepdefinitions;

import baseURL.StatesURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US024 extends StatesURL {




    @Given("User creates a new data")
    public void userCreatesANewData() {

//        {
//            "id": 22727,
//                "name": "Amsterdam",
//                "tpcountry": null
//        }

        String url = "https://www.gmibank.com/api/tp-states";

        JSONObject reqBody =new JSONObject();



    }

    @Then("User status verify code")
    public void userStatusVerifyCode() {
    }
}
