package stepdefinitions;

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
        System.out.println("Tablodaki satır sayısı => " + count);
        Assert.assertEquals(count, 3227);

    }

    @Then("print first user name and verify")
    public void printFirstUserNameAndVerify() throws SQLException {
        resultSet.first();
        String val = resultSet.getString("email");
        Assert.assertEquals(val, "anonymous@localhost");
        System.out.println("ilk kullanicinin email adresi = " + val);
    }

    @Then("print last user name and verify")
    public void printLastUserNameAndVerify() throws SQLException {
        resultSet.last();
        String val = resultSet.getString("first_name");
        Assert.assertEquals(val, "Julieann");
        System.out.println("son kullanici ismi = " + val);
    }

    @Then("print spesific user name and verify")
    public void printSpesificUserNameAndVerify() throws SQLException {
        resultSet.absolute(10);
        String val = resultSet.getString("login");
        Assert.assertEquals(val, "rolland.kassulke");
        System.out.println(10 + ". kullanicinin login name = " + val);
    }
}
