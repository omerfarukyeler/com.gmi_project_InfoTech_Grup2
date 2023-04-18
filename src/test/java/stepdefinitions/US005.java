package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Login_Page;
import utilities.CommenSteps;

public class US005 {
    Login_Page loginPage = new Login_Page();
    @And("User types the invalid username and valid password in the relevant fields")
    public void userTypesTheInvalidUsernameAndValidPasswordInTheRelevantFields() {
        loginPage.userName.sendKeys("user202"+ Keys.TAB);
        loginPage.newPassword.sendKeys("User.Name23");
    }

    @Then("User verifies error message")
    public void userVerifiesErrorMessage() {
        CommenSteps.waitForVisibility(loginPage.errorMessage,10);
        String errorMessage = loginPage.errorMessage.getText();
        System.out.println("errorMessage = " + errorMessage);
        Assert.assertTrue(errorMessage.contains("Failed to sign in!"));
    }

    @And("User types the valid username and invalid password in the relevant fields")
    public void userTypesTheValidUsernameAndInvalidPasswordInTheRelevantFields() {
        loginPage.userName.sendKeys("user2023"+ Keys.TAB);
        loginPage.newPassword.sendKeys("User.Name2");
    }

    @And("User types the invalid username and invalid password in the relevant fields")
    public void userTypesTheInvalidUsernameAndInvalidPasswordInTheRelevantFields() {
        loginPage.userName.sendKeys("user202"+ Keys.TAB);
        loginPage.newPassword.sendKeys("User.Name2");
    }

    @And("User clicks on the didYouForgetYourPassword button")
    public void userClicksOnTheDidYouForgetYourPasswordButton() {
        loginPage.didYouForgetYourPassword.click();
    }

    @Then("User verifies the message")
    public void userVerifiesTheMessage() {
        String message = loginPage.resetYourPassword.getText();
        Assert.assertTrue(message.contains("Reset your password"));
    }

    @And("User clicks on the registerANewAccount button")
    public void userClicksOnTheRegisterANewAccountButton() {
        loginPage.registerANewAccount.click();
    }

    @Then("User verifies the message for registration")
    public void userVerifiesTheMessageForRegistration() {
        String message = loginPage.registrationMessage.getText();
        Assert.assertTrue(message.equals("Registration"));
    }
}
