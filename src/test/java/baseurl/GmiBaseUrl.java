package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utilities.Authentication.generateToken;

public class GmiBaseUrl {
    protected RequestSpecification spec;

    @Before //Her test methodundan önce çalışır.
    public void setUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization",  generateToken()).
                setBaseUri("https://www.gmibank.com").
                build();
    }

}
