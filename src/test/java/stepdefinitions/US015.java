package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Login_Page;
import pages.Manage_Accounts_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US015 {
Login_Page loginPage= new Login_Page();
Manage_Accounts_Page manageAccountsPage= new Manage_Accounts_Page();
    @Given("Go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("you should navigate to sign in page")
    public void you_should_navigate_to_sign_in_page() {
        loginPage.signInRegister.click();
        loginPage.signIn.click();

    }

    @When("Provide the username of the applicant as user")
    public void provide_the_username_of_the_applicant_as_user() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("userSehri"));
    }

    @When("Provide the password of the applicant")
    public void provide_the_password_of_the_applicant() {
        loginPage.newPassword.sendKeys("Nemo5775.");
    }
    @When("Click on Sign In")
    public void click_on_sign_in() {
        loginPage.submitButtonForLogin.click();
    }
    @When("Click on My Operations")
    public void click_on_my_operations() {
        loginPage.myOperations.click();
    }
    @When("Click on Manage Account")
    public void click_on_manage_account() {
       loginPage.manageAccounts.click();
    }
    @Then("You should see all account types")
    public void you_should_see_all_account_types() {
        List<WebElement> accountTypes= manageAccountsPage.accounttypes;
        int counterCredit=0;
        int counterChecking=0;
        int counterSaving=0;
        int counterInvesting=0;
        for (WebElement accountType: accountTypes) {
            if (accountType.getText().contains("CREDIT_CARD")){
                counterCredit++;
            }
            if (accountType.getText().contains("INVESTING")){
                counterInvesting++;
            }
            if (accountType.getText().contains("CHECKING")){
                counterChecking++;
            }
            if (accountType.getText().contains("SAVING")){
                counterSaving++;
            }

        }

        Assert.assertTrue(counterCredit>0);
        Assert.assertTrue(counterChecking>0);
        Assert.assertTrue(counterInvesting>0);
        Assert.assertTrue(counterSaving>0);

    }

    @Then("You should see all balance populated")
    public void you_should_see_all_balance_populated() {
        System.out.println(manageAccountsPage.balances.toString());
        Assert.assertTrue(manageAccountsPage.balances.size()>0);
    }
    @Then("You should see view transaction")
    public void you_should_see_view_transaction() {

        List<WebElement> views= manageAccountsPage.views;
        Assert.assertTrue(views.get(0).getText().contains("View"));
    }

    @And("Click on Sign Out")
    public void clickOnSignOut() {
        loginPage.signInRegister.click();
        loginPage.signOutButton.click();
    }
}
