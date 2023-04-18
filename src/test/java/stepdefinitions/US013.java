package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CreateAccountPage;
import pages.Login_Page;
import pages.Manage_Accounts_Page;
import utilities.CommenSteps;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US013 {
    Manage_Accounts_Page manageAccountsPage = new Manage_Accounts_Page();
    CreateAccountPage createAccountPage= new CreateAccountPage();
    List<String> options=new ArrayList<>();
    List<String> optionsStatus=new ArrayList<>();
    Login_Page loginPage= new Login_Page();
    @Given("Go to the GmiBank home page")
    public void go_to_the_gmi_bank_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("Click on Create a New Account")
    public void click_on_create_a_new_account() {

        manageAccountsPage.createANewAccount.click();

    }

    @When("Click on Description text box")
    public void click_on_description_text_box() {
        createAccountPage.description.click();
    }
    @When("Click on Balance text box")
    public void click_on_balance_text_box() {
       createAccountPage.balance.click();
    }
    @Then("You should see the error message under the textbox This field is required.")
    public void you_should_see_the_error_message_under_the_textbox_this_field_is_required() {
        Assert.assertTrue(createAccountPage.descriptionFeedback.isDisplayed());
    }
    @When("Enter a valid value in the definition test box")
    public void enter_a_valid_value_in_the_definition_test_box() {
        createAccountPage.description.sendKeys("Definition1");
    }
    @Then("You should not see the error message under the textbox This field is required.")
    public void you_should_not_see_the_error_message_under_the_textbox_this_field_is_required() {
        CommenSteps.verifyElementNotDisplayed(createAccountPage.balanceFeedback);

    }
    @When("Enter a a number in the balance test box")
    public void enter_a_a_number_in_the_balance_test_box() {
        createAccountPage.description.sendKeys("a");
        createAccountPage.balance.sendKeys("123");
    }

    @Then("I should not see the error message under the textbox This field should be a number.")
    public void i_should_not_see_the_error_message_under_the_textbox_this_field_should_be_a_number() {
        CommenSteps.verifyElementNotDisplayed(createAccountPage.balanceFeedback);
    }
    @When("Enter a character in the balance test box")
    public void enter_a_character_in_the_balance_test_box() {
        createAccountPage.balance.sendKeys("a");
    }
    @When("Click on Account Type dropdown")
    public void click_on_account_type_dropdown() {
        createAccountPage.accountType.click();
    }
    @Then("I should see the error message under the text box This field should be a number.")
    public void i_should_see_the_error_message_under_the_text_box_this_field_should_be_a_number() {
        Assert.assertEquals(createAccountPage.descriptionFeedback.getText(),"This field should be a number.");
    }

    @When("Enter a special character in the balance test box")
    public void enter_a_special_character_in_the_balance_test_box() {
        createAccountPage.balance.sendKeys("@");
    }


    @When("I should select the an account type CHECKING")
    public void i_should_select_the_an_account_type_checking() {
        Select select = new Select(createAccountPage.accountType);
        List<WebElement> allOptions=select.getOptions();

        for (WebElement option:allOptions) {
            options.add(option.getText());
        }
        Assert.assertTrue(options.contains("CHECKING"));


    }
    @When("I should select the an account type SAVING")
    public void i_should_select_the_an_account_type_saving() {
        Assert.assertTrue(options.contains("SAVING"));


    }
    @When("I should select the an account type CREDIT_CARD")
    public void i_should_select_the_an_account_type_credit_card() {
        Assert.assertTrue(options.contains("CREDIT_CARD"));
    }
    @Then("I should select the an acount type INVESTING")
    public void i_should_select_the_an_acount_type_investing() {
        Assert.assertTrue(options.contains("INVESTING"));
    }

    @When("Click on Account Status dropdown")
    public void click_on_account_status_dropdown() {
        createAccountPage.accountStatusType.click();
    }
    @When("I should select the an account status ACTIVE")
    public void i_should_select_the_an_account_status_active() {
        Select select = new Select(createAccountPage.accountStatusType);
        List<WebElement> allOptions=select.getOptions();

        for (WebElement option:allOptions) {
            optionsStatus.add(option.getText());
        }
        Assert.assertTrue(optionsStatus.contains("ACTIVE"));
    }
    @When("I should select the an account status SUSPENDED")
    public void i_should_select_the_an_account_status_suspended() {
        Assert.assertTrue(optionsStatus.contains("SUESPENDED"));
    }
    @Then("I should select the an account status CLOSED")
    public void i_should_select_the_an_account_status_closed() {
        Assert.assertTrue(optionsStatus.contains("CLOSED"));
    }
    @When("Click on Employee dropdown")
    public void click_on_employee_dropdown() {
        createAccountPage.employee.click();
    }
    @Then("You should select an employee from the drop-down")
    public void you_should_select_an_employee_from_the_drop_down() {
        Select select = new Select(createAccountPage.employee);
        List<WebElement> allOptions=select.getOptions();
        Assert.assertFalse(allOptions.size()>1);
    }

    @And("Provide the username of the applicant as employee")
    public void provideTheUsernameOfTheApplicantAsEmployee() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("employeeSehri"));
    }
}
