package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class StatesURL {

    protected RequestSpecification specStates;


    @Before
    public void setup(){


        specStates= new RequestSpecBuilder().
                setBaseUri("https://www.gmibank.com/api").build();
    }




}
