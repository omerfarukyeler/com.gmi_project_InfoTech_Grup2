package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;

public class US022 {
    RequestSpecification spec = new RequestSpecBuilder().
            setContentType(ContentType.JSON).
            addHeader("Authorization",  generateToken()).
            setBaseUri("https://www.gmibank.com/api").
            build();
    Response response;

    @Given("admin sends getAll request for getting states")
    public void admin_sends_get_all_request_for_getting_states() {
        spec.pathParam("first", "tp-states");


        response = given(spec).when().get("/{first}");
        response.prettyPrint();
    }

    @Then("admin gets the datas and assert")
    public void admin_gets_the_datas_and_assert() {
        //1. way
        response.then().assertThat().body("[0].id", Matchers.instanceOf(Integer.class)).extract().response();
        response.then().assertThat().body("[0].name", Matchers.instanceOf(String.class)).extract().response();;

        //2. way
        String expected="{id=22727, name=Amsterdam, tpcountry=null}";
        List<Map<String,Object>> actualData= response.as(ArrayList.class);
        boolean result=false;
        for (Map<String,Object> data: actualData) {
            if ((int)data.get("id")==22727){
                result=true;
            }
        }
        assertTrue(result);


        //3. way
        String expectedData="{\"id\":22727,\"name\":\"Amsterdam\",\"tpcountry\":null}";
        String actual= response.asString();
        assertTrue(actual.contains(expectedData));


        //4. way

        assertEquals(22727,(int)response.path("[0].id"));
        assertEquals("Amsterdam",(String) response.path("[0].name"));
        assertEquals(null,(Object) response.path("[0].tpcountry"));


    }

}
