package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.CommenSteps;
import utilities.ConfigReader;
import utilities.Driver;


public class US001 {
    RegisterPage us001 =new RegisterPage();

    @Given("User goes to home pages")
    public void UserGoesToHomePages() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User clicks the user button")
    public void userClicksTheUserButton() {
        CommenSteps.waitForClickablility(us001.userButton,10);
        us001.userButton.click();
    }
    @And("User clicks on register tab")
    public void userClicksOnRegisterTab() {
        us001.registerButton.click();
    }


    @And("Enters the appropriate SSN number")
    public void entersTheAppropriateSSNNumber() {
        us001.ssnLogin.sendKeys("768-99-5641");
    }
    @And("Enters the appropriate name")
    public void entersTheAppropriateName() {

        us001.name.sendKeys("asln2693");
    }
    @And("Enters the appropriate lastname")
    public void entersTheAppropriateLastname() {
        us001.lastName.sendKeys("ouderoey26");

    }

    @And("Enters the appropriate adress")
    public void entersTheAppropriateAdress() {

        us001.adress.sendKeys("austrae 064 564075 Heilbronn");
    }
    @And("Enters the appropriate Phone Number")
    public void entersTheAppropriatePhoneNumber() {
        us001.phoneNumber.sendKeys("6334560239");
    }
    @And("Enters the user name")
    public void entersTheUserName() {
        us001.username.sendKeys("fedeileruu");
    }
    @And("Enters the appropriate emailAdress")
    public void entersTheAppropriateEmailAdress() {
        us001.email.sendKeys("haayaller66@hotmail.com");
    }

    @And("Enters the appropriate new password")
    public void entersTheAppropriateNewPassword() {
        us001.password.sendKeys("Deter232??");
    }

    @And("Enters the appropriate renew pasword")
    public void entersTheAppropriateRenewPasword() throws InterruptedException {

        us001.repassword.sendKeys("Deter232??");

    }
    @And("Click the register button")
    public void clickTheRegisterButton() throws InterruptedException {

        us001.registerbuttonclick.click();
        Driver.wait(3);
    }

    @Then("Checks success message")
    public void checksSuccessMessage() {
        try {
            Assert.assertTrue(us001.succesfullmessage.getText().contains("Registration saved"));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    @Then("Checks failed message")
    public void checksFailedMessage() {
        try {
            Assert.assertTrue(us001.succesfullmessage.getText().contains("translation-not-found[error.ssnexists]"));

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
