package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken(){


            Map<String, Object> postBody = new HashMap<>();
            postBody.put("password", "Batch.103");
            postBody.put("rememberMe", true);
            postBody.put("username", "batch_yuzuc");

            Response response = given().contentType(ContentType.JSON).body(postBody).post("https://gmibank.com/api/authenticate");

            return "Bearer "+response.jsonPath().getString("id_token");
        }
    }

