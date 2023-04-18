package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;
import utilities.Driver;

public class US002 {

    RegisterPage us001 =new RegisterPage();
    Faker faker= new Faker();
    @And("User leaves SSN number blank")
    public void userLeavesSSNNumberBlank() {
     us001.ssnLogin.sendKeys(Keys.TAB);

    }

    @And("User leaves First Name blank")
    public void userLeavesFirstNameBlank() {
        us001.name.sendKeys(Keys.TAB);
    }

    @And("User leaves Last Name blank")
    public void userLeavesLastNameBlank() {
        us001.lastName.sendKeys(Keys.TAB);
    }

    @And("User leaves Adress blank")
    public void userLeavesAdressBlank() {
        us001.adress.sendKeys(Keys.TAB);
    }

    @And("User leaves Phone Number blank")
    public void userLeavesPhoneNumberBlank() {
        us001.phoneNumber.sendKeys(Keys.TAB);
    }

    @And("User leaves Username blank")
    public void userLeavesUsernameBlank() {
        us001.username.sendKeys(Keys.TAB);
    }

    @And("User leaves Email blank")
    public void userLeavesEmailBlank() {
        us001.email.sendKeys(Keys.TAB);
    }

    @And("User leaves New password blank")
    public void userLeavesNewPasswordBlank() {
        us001.password.sendKeys(Keys.TAB);
    }

    @And("User leaves New password confirmation blank")
    public void userLeavesNewPasswordConfirmationBlank() {

        us001.repassword.sendKeys(Keys.TAB);
    }

    @Then("User checks the  social security number failed")
    public void userChecksTheSocialSecurityNumberFailed() {
        Assert.assertTrue(us001.ssnFailedCheck.getAttribute("class").contains("invalid-feedback"));

    }

    @Then("User checks the   first name failed")
    public void userChecksTheFirstNameFailed() {
        Assert.assertTrue(us001.nameFailedCheck.getAttribute("class").contains("invalid-feedback"));

    }

    @Then("User checks the   last name failed")
    public void userChecksTheLastNameFailed() {
        Assert.assertTrue(us001.lastNameFailedCheck.getAttribute("class").contains("invalid-feedback"));

    }

    @Then("User checks the   address failed")
    public void userChecksTheAddressFailed() {
        Assert.assertTrue(us001.adressFailedCheck.getAttribute("class").contains("invalid-feedback"));
    }

    @Then("User checks the   mobile phone number failed")
    public void userChecksTheMobilePhoneNumberFailed() {
        Assert.assertTrue(us001.phoneNumberFailedCheck.getAttribute("class").contains("invalid-feedback"));

    }

    @Then("User checks the  username failed")
    public void userChecksTheUsernameFailed() {
        Assert.assertTrue(us001.usernameFailedCheck.getAttribute("class").contains("invalid-feedback"));
    }

    @Then("User checks the  email failed")
    public void userChecksTheEmailFailed() {
        Assert.assertTrue(us001.emailFailedCheck.getAttribute("class").contains("invalid-feedback"));
    }

    @Then("User checks the  password failed")
    public void userChecksThePasswordFailed() {
        Assert.assertTrue(us001.passwordFailedCheck.getAttribute("class").contains("invalid-feedback"));
    }

    @Then("User checks the  new password failed")
    public void userChecksTheNewPasswordFailed() {
        Assert.assertTrue(us001.repasswordFailedCheck.getAttribute("class").contains("invalid-feedback"));
    }

    @And("User puts a special character other than {string} between numbers")
    public void userPutsASpecialCharacterOtherThanBetweenNumbers(String arg0) throws InterruptedException {

        us001.ssnLogin.sendKeys("123?12!1234"+Keys.TAB);
        Driver.wait(3);
    }

    @Then("User checks the  social security number other failed")
    public void userChecksTheSocialSecurityNumberOtherFailed() {
        String expectedValue="123?12!1234";
        String actualValue=us001.ssnInvalid.getAttribute("value");
        Assert.assertNotEquals(expectedValue,actualValue);

    }

    @And("User puts a special character other than {string} between telephone  numbers")
    public void userPutsASpecialCharacterOtherThanBetweenTelephoneNumbers(String arg0) {

        us001.phoneNumber.sendKeys("123?321?1234"+Keys.TAB);
    }

    @Then("User checks the  telephone number other failed")
    public void userChecksTheTelephoneNumberOtherFailed() {
        String expecteValue="123?321?1234";
        String actualValue =us001.telNumberInvalid.getAttribute("value");
        Assert.assertNotEquals(expecteValue,actualValue);

    }

    @And("User puts a special character without {string} and {string}")
    public void userPutsASpecialCharacterWithoutAnd(String arg0, String arg1) throws InterruptedException {

        us001.emailinvalid.sendKeys("omerfarukyeler&hotmail^com",Keys.TAB);
        Driver.wait(2);
    }

    @Then("User checks the  email other failed")
    public void userChecksTheEmailOtherFailed() {
      Assert.assertTrue(us001.emailinvalid.getAttribute("class").contains("is-touched is-dirty av-invalid is-invalid form-control"));
    }
}
