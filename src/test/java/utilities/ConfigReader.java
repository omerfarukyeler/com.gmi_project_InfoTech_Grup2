package utilities;

import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class ConfigReader {
    public static Properties properties;

    static {
        String path = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(path);
            properties = new Properties();
            properties.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){

        return properties.getProperty(key);


    }
}
