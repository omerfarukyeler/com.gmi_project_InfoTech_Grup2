package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;

public class US029 {
    String url = "jdbc:postgresql://gmibank.com:5432/gmibank_db"; // Connection Url = jdbc:postgresql://+HOST+":"+PORT+"/DATABASENAME";
    String username = ConfigReader.getProperty("db_username");
    String password = ConfigReader.getProperty("db_password");
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("user connects to the database")
    public void userConnectsToTheDatabase() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement  = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }

    @Given("user connects to the user table")
    public void userConnectsToTheUserTable() throws SQLException {
        resultSet = statement.executeQuery("select id,login,first_name,last_name,email,created_by from public.jhi_user;");

    }

    @Then("print the total row count and verify")
    public void printTheTotalRowCountAndVerify() throws SQLException {
        int count = 0;
        while (resultSet.next()){
            count++;
        }
        System.out.println("User Table row count  => " + count);
        Assert.assertEquals(count, 3227);

    }

    @Then("print first user name and verify")
    public void printFirstUserNameAndVerify() throws SQLException {
        resultSet.first();
        String firstEmail = resultSet.getString("email");
        Assert.assertEquals(firstEmail, "anonymous@localhost");
        System.out.println("ilk kullanicinin email adresi = " + firstEmail);
    }

    @Then("print last user name and verify")
    public void printLastUserNameAndVerify() throws SQLException {
        resultSet.last();
        String lastEmail = resultSet.getString("first_name");
        Assert.assertEquals(lastEmail, "Julieann");
        System.out.println("son kullanici ismi = " + lastEmail);
    }

    @Then("print spesific user name and verify")
    public void printSpesificUserNameAndVerify() throws SQLException {
        resultSet.absolute(10);
        String loginName = resultSet.getString("login");
        Assert.assertEquals(loginName, "rolland.kassulke");
        System.out.println(10 + ". user login name = " + loginName);
    }

    @And("user connects to the country table")
    public void userConnectsToTheCountryTable() throws SQLException {
        resultSet = statement.executeQuery("select * from public.tp_country;");

    }

    @Then("print the total row country count and verify")
    public void printTheTotalRowCountryCountAndVerify() throws SQLException {
        int count = 0;
        while (resultSet.next()){
            count++;
        }
        System.out.println("Country Table row size => " + count);
        Assert.assertEquals(count, 5238);
    }

    @Then("print first country name and verify")
    public void printFirstCountryNameAndVerify() throws SQLException {
        resultSet.first();
        String id = resultSet.getString("id");
        Assert.assertEquals(id, "24113");
        System.out.println("First country id  = " + id);
    }

    @Then("print last country name and verify")
    public void printLastCountryNameAndVerify() throws SQLException {
        resultSet.last();
        String lastCountryName = resultSet.getString("name");
        Assert.assertEquals(lastCountryName, "Tuba");
        System.out.println("Last country name = " + lastCountryName);
    }

    @Then("print spesific country name and verify")
    public void printSpesificCountryNameAndVerify() throws SQLException {
        resultSet.absolute(50);
        String countryName = resultSet.getString("name");
        Assert.assertEquals(countryName, "FRANCE");
        System.out.println(50 + ". country name = " + countryName);
    }
}
