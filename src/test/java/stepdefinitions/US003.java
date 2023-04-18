package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;
import utilities.CommenSteps;
import utilities.Driver;

public class US003 {

    RegisterPage us001 =new RegisterPage();
    @And("User puts a lowercase char in new password")
    public void userPutsALowercaseCharInNewPassword() throws InterruptedException {

        CommenSteps.waitForClickablility(us001.password,5);
        us001.password.sendKeys("INTEGRAL26?k", Keys.TAB);
        Driver.wait(4);
    }

    @Then("User see the level chart change accordingly")
    public void userSeeTheLevelChartChangeAccordingly() {

        Assert.assertTrue(us001.strengthbar.getAttribute("style").contains("background-color: rgb(0, 255, 0);"));
    }

    @And("User puts a uppercase char in new Password")
    public void userPutsAUppercaseCharInNewPassword() {

        us001.password.sendKeys("ıntegral26?K");


    }

    @And("User puts a {int} digit in the new password")
    public void userPutsADigitInTheNewPassword(int arg0) {

        us001.password.sendKeys("ıntegraL?2");
    }

    @And("User puts a special character in new password")
    public void userPutsASpecialCharacterInNewPassword() {
        us001.password.sendKeys("ıntegraL26?");
    }

    @And("User puts  new password")
    public void userPutsNewPassword() {

        us001.password.sendKeys("Int265?");
    }

    @Then("check that the entered password is at least {int} long")
    public void checkThatTheEnteredPasswordIsAtLeastLong(int arg0) {

        Assert.assertTrue(us001.password.getAttribute("value").length()>=7);
    }
}
