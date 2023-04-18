package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GmiBankHomePage;
import pages.LoginPasswordPage;
import pages.Login_Page;
import pages.SignInPage;
import utilities.CommenSteps;
import utilities.ConfigReader;
import utilities.Driver;

public class US008 {
    SignInPage signInPage = new SignInPage();
    LoginPasswordPage loginPasswordPage = new LoginPasswordPage();
    GmiBankHomePage gmiBankHomePage = new GmiBankHomePage();
    Login_Page loginPage = new Login_Page();

    @Given("User goes GmiBank home page")
    public void userGoesGmiBankHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("User clicks dropdown account menu")
    public void userClicksDropdownAccountMenu() {
        gmiBankHomePage.accountMenu.click();
    }

    @And("User clicks on the Sign in")
    public void userClicksOnTheSignIn() {
        gmiBankHomePage.loginItem.click();
    }

    @And("User types the valid username in the relevant field")
    public void userTypesTheValidUsernameInTheRelevantField() {
        CommenSteps.waitForClickablility(signInPage.userNameTextBox,5);
        signInPage.userNameTextBox.sendKeys(ConfigReader.getProperty("ibrahimsTestUserName"));
    }

    @And("User types the valid password in the relevant field")
    public void userTypesTheValidPasswordInTheRelevantField() {
        signInPage.newPasswordTextBox.sendKeys(ConfigReader.getProperty("ibrahimsTestUserPassword"));
    }

    @And("User clicks on Sign in button")
    public void userClicksOnSignInButton() {
        signInPage.signInButton.click();
    }

    @And("User clicks on Password")
    public void userClicksOnPassword() {
        CommenSteps.waitForClickablility(loginPage.password,5);
        loginPage.password.click();
    }

    @And("User types the current password in the current password box")
    public void userTypesTheCurrentPasswordInTheCurrentPasswordBox() {
        loginPasswordPage.currentPasswordTextBox.sendKeys(ConfigReader.getProperty("ibrahimsTestUserPassword"));
    }

    @And("User types the current password in the new password box")
    public void userTypesTheCurrentPasswordInTheNewPasswordBox() {
        loginPasswordPage.newPasswordTextBox.sendKeys(ConfigReader.getProperty("ibrahimsTestUserPassword"));
    }

    @And("User clicks the new password confirmation box")
    public void userClicksTheNewPasswordConfirmationBox() {loginPasswordPage.confirmPasswordTextBox.click(); }

    @Then("User sees new password should be different from the current one error message")
    public void userSeesNewPasswordShouldBeDifferentFromTheCurrentOneErrorMessage() {
        String expectedMessage = "New password should be different from the current one.";
        String actualMessage = loginPasswordPage.newPasswordErrorMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @And("User types one lowercase letter for password in the new password box")
    public void userTypesOneLowercaseLetterForPasswordInTheNewPasswordBox() {
        loginPasswordPage.newPasswordTextBox.sendKeys("n");
    }

    @Then("User sees strength level does not change")
    public void userSeesStrengthLevelDoesNotChange() {
        boolean expectedVisible = true;
        boolean actualVisible = loginPasswordPage.passwordStrengthFirstPoint.isDisplayed();
        Assert.assertEquals(expectedVisible,actualVisible);
    }

    @And("User types at least one uppercase letter for password in the new password box")
    public void userTypesAtLeastOneUppercaseLetterForPasswordInTheNewPasswordBox() {
        loginPasswordPage.newPasswordTextBox.sendKeys("nE");
    }

    @Then("User sees strength level is second level")
    public void userSeesStrengthLevelIsSecondLevel() {
        boolean expectedVisible = true;
        boolean actualVisible = loginPasswordPage.passwordStrengthSecondPoint.isDisplayed();
        Assert.assertEquals(expectedVisible,actualVisible);
    }

    @And("User types at least one digit for password in the new password box")
    public void userTypesAtLeastOneDigitForPasswordInTheNewPasswordBox() {
        loginPasswordPage.newPasswordTextBox.sendKeys("nE1");
    }

    @Then("User sees strength level is third level")
    public void userSeesStrengthLevelIsThirdLevel() {
        boolean expectedVisible = true;
        boolean actualVisible = loginPasswordPage.passwordStrengthThirdPoint.isDisplayed();
        Assert.assertEquals(expectedVisible,actualVisible);
    }

    @And("User types at least one special char for password in the new password box")
    public void userTypesAtLeastOneSpecialCharForPasswordInTheNewPasswordBox() {
        loginPasswordPage.newPasswordTextBox.sendKeys("nE1?");
    }

    @Then("User sees strength level is fourth level")
    public void userSeesStrengthLevelIsFourthLevel() {
        boolean expectedVisible = true;
        boolean actualVisible = loginPasswordPage.passwordStrengthFourthPoint.isDisplayed();
        Assert.assertEquals(expectedVisible,actualVisible);
    }

    @And("User types at least seven char for password in the new password box")
    public void userTypesAtLeastSevenCharForPasswordInTheNewPasswordBox() {
        loginPasswordPage.newPasswordTextBox.sendKeys("Npass1?");
    }

    @Then("User sees strength level is fifth level")
    public void userSeesStrengthLevelIsFifthLevel() {
        boolean expectedVisible = true;
        boolean actualVisible = loginPasswordPage.passwordStrengthFifthPoint.isDisplayed();
        Assert.assertEquals(expectedVisible,actualVisible);
    }

    @And("User types the valid new password in the new password box")
    public void userTypesTheValidNewPasswordInTheNewPasswordBox() {
        loginPasswordPage.newPasswordTextBox.sendKeys("NewPassword123?");
    }

    @And("User types the valid new password in the new password confirmation box")
    public void userTypesTheValidNewPasswordInTheNewPasswordConfirmationBox() {
        loginPasswordPage.newPasswordTextBox.sendKeys("NewPassword123?");
    }

    @And("User clicks on the save button")
    public void userClicksOnTheSaveButton() {
        loginPasswordPage.saveButton.click();
    }

    @Then("User confirms new password")
    public void userConfirmsNewPassword() {
        boolean expectedValue = false;
        boolean actualValue = loginPasswordPage.newPasswordConfirmationErrorMessage.isDisplayed();
        Assert.assertEquals(expectedValue,actualValue);
    }
}
