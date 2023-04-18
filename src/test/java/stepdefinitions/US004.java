package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Login_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US004 {
    Login_Page loginPage = new Login_Page();
    @Given("User goes to the GmiBank home page")
    public void userGoesToTheGmiBankHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User clicks on the signInRegister button")
    public void userClicksOnTheSignInRegisterButton() {
        loginPage.signInRegister.click();
    }

    @And("User clicks on the signIn button")
    public void userClicksOnTheSignInButton() {
        loginPage.signIn.click();    }

    @And("User types the valid username and valid password in the relevant fields")
    public void userTypesTheValidUsernameAndValidPasswordInTheRelevantFields() {
        loginPage.userName.sendKeys("user2023"+ Keys.TAB);
        loginPage.newPassword.sendKeys("User.Name23");
    }

    @And("User clicks on the submit button")
    public void userClicksOnTheSubmitButton() {
        loginPage.submitButtonForLogin.click();
    }

    @Then("User verifies successful login")
    public void userVerifiesSuccessfulLogin() {
        String actualValue = loginPage.userNameAfterLogin.getText();
        String expectedValue ="User Name";
        Assert.assertEquals(expectedValue,actualValue);
        //Boolean elementIsDisplayed = loginPage.myOperations.isDisplayed();
        //Assert.assertTrue(elementIsDisplayed);
    }


    @Then("User verifies that the cancel button is clickable")
    public void userVerifiesThatTheCancelButtonIsClickable() {
        Boolean actualValue =loginPage.cancelButton.isEnabled();
        Boolean expectedValue= true;
        Assert.assertEquals(expectedValue,actualValue);
    }
}
