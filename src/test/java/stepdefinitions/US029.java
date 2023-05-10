package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;
//select * from tp_state where tpcountry_id=(select id from tp_country where name='USA' and id=1);
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
        Assert.assertEquals(count, 3228);

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
        Assert.assertEquals(count, 5254);
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
        Assert.assertEquals(lastCountryName, "The Netherlands");
        System.out.println("Last country name = " + lastCountryName);
    }

    @Then("print spesific country name and verify")
    public void printSpesificCountryNameAndVerify() throws SQLException {
        resultSet.absolute(50);
        String countryName = resultSet.getString("name");
        Assert.assertEquals(countryName, "FRANCE");
        System.out.println(50 + ". country name = " + countryName);
    }

    @Given("employee connects to the database")
    public void employeeConnectsToTheDatabase() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement  = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }

    @And("employee  connects to the user table")
    public void employeeConnectsToTheUserTable() throws SQLException {
       resultSet = statement.executeQuery("select * from public.tp_employee;");

    }

    @Then("prints the total row count and verify")
    public void printsTheTotalRowCountAndVerify() throws SQLException {

        int count = 0;
        while (resultSet.next()){
            count++;
        }
        System.out.println("User Table row count  => " + count);
        Assert.assertEquals(count, 0);

    }

    @Given("user connects to the customer table")
    public void userConnectsToTheCustomerTable() throws SQLException {
//        resultSet = statement.executeQuery("select id, first_name, last_name, middle_initial, email, mobile_phone_number, phone_number, " +
//                "zip_code, address, city, ssn, create_date, zelle_enrolled, country_id, state, user_id from public.customer");
        resultSet = statement.executeQuery("select * from public.tp_customer");
    }
    @Then("print the total customers table row count and verify")
    public void printTheTotalCustomersTableRowCountAndVerify() throws SQLException {
        int count = 0;
        while (resultSet.next()){
            count++;
        }
        System.out.println("Customer Table row count  => " + count);
        Assert.assertEquals(count,1848);
    }
    @Then("print first customer name and verify")
    public void printFirstCustomerNameAndVerify() throws SQLException {
        resultSet.first();
        String id = resultSet.getString("id");
        Assert.assertEquals(id, "126294");
        System.out.println("First customer's id  = " + id);
    }

    @Then("print last customer name and verify")
    public void printLastCustomerNameAndVerify() throws SQLException {
        resultSet.last();
        String lastCustomerEmail = resultSet.getString("email");
        Assert.assertEquals(lastCustomerEmail, "abdsert346@gmail.com");
        System.out.println("Last customer's email = " + lastCustomerEmail);
    }

    @Then("print specific customer name and verify")
    public void printSpecificCustomerNameAndVerify() throws SQLException {
        resultSet.absolute(99);
        String customerSsn = resultSet.getString("ssn");
        Assert.assertEquals(customerSsn, "450-56-4948");
        System.out.println(99 + ". customer's SSN = " + customerSsn);
    }

}
