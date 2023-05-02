package pojos;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponseStates2 {

    public String name;
    private Object tpcountry;

    public ResponseStates2(String name, Object tpcountry) {

        this.name = name;
        this.tpcountry = tpcountry;
    }

    public ResponseStates2() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getTpcountry() {
        return tpcountry;
    }

    public void setTpcountry(Object tpcountry) {
        this.tpcountry = tpcountry;
    }
}




















