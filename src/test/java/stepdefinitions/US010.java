package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.CommenSteps;
import utilities.ConfigReader;
import utilities.Driver;

public class US010 {
    GmiBankHomePage gmiBankHomePage = new GmiBankHomePage();
    SignInPage signInPage = new SignInPage();
    Login_Page loginPage = new Login_Page();
    ManageCustomersPage manageCustomersPage = new ManageCustomersPage();
    CreateOrEditACustomerPage createOrEditACustomerPage = new CreateOrEditACustomerPage();

    @Given("User goes the GmiBank home page")
    public void userGoesTheGmiBankHomePage() {
            Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Manager clicks dropdown account menu")
    public void managerClicksDropdownAccountMenu() {
        CommenSteps.waitForClickablility(gmiBankHomePage.accountMenu,5);
        gmiBankHomePage.accountMenu.click();
    }

    @And("Manager clicks on the Sign in")
    public void managerClicksOnTheSignIn() {
        gmiBankHomePage.loginItem.click();
    }

    @And("Manager types the valid username in the relevant field")
    public void managerTypesTheValidUsernameInTheRelevantField() {
        CommenSteps.waitForClickablility(signInPage.userNameTextBox,5);
        signInPage.userNameTextBox.sendKeys(ConfigReader.getProperty("managerLoginName"));
    }

    @And("Manager types the valid password in the relevant field")
    public void managerTypesTheValidPasswordInTheRelevantField() {
        signInPage.newPasswordTextBox.sendKeys(ConfigReader.getProperty("managerLoginPassword"));
    }

    @And("Manager clicks on Sign in button")
    public void managerClicksOnSignInButton() {
        CommenSteps.waitForVisibility(signInPage.userNameTextBox,5);
        signInPage.signInButton.click();
    }

    @And("Manager clicks on My Operations menu")
    public void managerClicksOnMyOperationsMenu() {
        CommenSteps.waitForVisibility(loginPage.myOperations,5);
        loginPage.myOperations.click();
    }

    @And("Manager clicks on Manage Customers")
    public void managerClicksOnManageCustomers() {
        CommenSteps.waitForVisibility(loginPage.manageCustomers,5);
        loginPage.manageCustomers.click();
    }

    @And("Manager clicks on create a new customer button")
    public void managerClicksOnCreateANewCustomerButton() {
        manageCustomersPage.createANewCustomer.click();
    }

    @And("Manager types the address with street and number in the address box")
    public void managerTypesTheAddressWithStreetAndNumberInTheAddressBox() {
        createOrEditACustomerPage.addressTextBox.sendKeys("Test street 100");
    }

    @And("Manager clicks the city box")
    public void managerClicksTheCityBox() throws InterruptedException {
        createOrEditACustomerPage.cityTextBox.click();
        Driver.wait(1);
    }

    @Then("Manager does not see any error message for address box")
    public void managerDoesNotSeeAnyErrorMessageForAddressBox() {

        boolean forAddressBoxErrorMessage;
        try {
            createOrEditACustomerPage.forAddressTextBoxErrorMessage.isDisplayed();
            forAddressBoxErrorMessage=true;
        }catch (Exception e){
            forAddressBoxErrorMessage=false;
        }
        Assert.assertFalse(forAddressBoxErrorMessage);
    }

    @And("Manager types the city in the city box")
    public void managerTypesTheCityInTheCityBox() {
        createOrEditACustomerPage.addressTextBox.sendKeys("Test street 100");
        createOrEditACustomerPage.cityTextBox.sendKeys("Miami"+Keys.TAB);
    }

    @And("Manager clicks the country dropdown")
    public void managerClicksTheCountryDropdown() {
        createOrEditACustomerPage.countryDropDownMenu.click();
    }

    @Then("Manager does not see any error message for city box")
    public void managerDoesNotSeeAnyErrorMessageForCityBox(){
        boolean forCityTextBoxErrorMessage;
        try {
            createOrEditACustomerPage.forCityTextBoxErrorMessage.isDisplayed();
            forCityTextBoxErrorMessage=true;
        }catch (Exception e){
            forCityTextBoxErrorMessage=false;
        }
        Assert.assertFalse(forCityTextBoxErrorMessage);
    }

    @And("Manager selects USA from the country dropdown")
    public void managerSelectsUSAFromTheCountryDropdown() {
        createOrEditACustomerPage.addressTextBox.sendKeys("Test street 100");
        createOrEditACustomerPage.cityTextBox.sendKeys("Miami");
        createOrEditACustomerPage.countryDropDownMenu.click();
        createOrEditACustomerPage.countryDropDownMenu.sendKeys("USA"+Keys.TAB);
    }

    @And("Manager clicks the state box")
    public void managerClicksTheStateBox() {
        createOrEditACustomerPage.stateTextBox.click();
    }

    @Then("Manager does not see any error message for country dropdown")
    public void managerDoesNotSeeAnyErrorMessageForCountryDropdown() {
        boolean countryDropDownMenuText;
        try {
            createOrEditACustomerPage.countryDropDownMenuUSA.isSelected();
            countryDropDownMenuText=true;
        }catch (Exception e){
            countryDropDownMenuText=false;
        }
        Assert.assertTrue(countryDropDownMenuText);
    }

    @And("Manager types the state as USA state in the state box")
    public void managerTypesTheStateAsUSAStateInTheStateBox() {
        createOrEditACustomerPage.addressTextBox.sendKeys("Test street 100");
        createOrEditACustomerPage.cityTextBox.sendKeys("Miami");
        createOrEditACustomerPage.countryDropDownMenu.click();
        createOrEditACustomerPage.countryDropDownMenu.sendKeys("USA");
        createOrEditACustomerPage.stateTextBox.sendKeys("Florida"+Keys.TAB);
    }

    @And("Manager clicks the user dropdown")
    public void managerClicksTheUserDropdown() {
        createOrEditACustomerPage.userDropDownMenu.click();
    }
    @And("Manager types the {string}  in the address box")
    public void managerTypesTheInTheAddressBox(String address) {
        createOrEditACustomerPage.addressTextBox.sendKeys(address + Keys.TAB);
    }

    @Then("Manager sees an error message for address box")
    public void managerSeesAnErrorMessageForAddressBox() {

        boolean forAddressBoxErrorMessage;
        try {
            createOrEditACustomerPage.forAddressTextBoxErrorMessage.isDisplayed();
            forAddressBoxErrorMessage=true;
        }catch (Exception e){
            forAddressBoxErrorMessage=false;
        }
        Assert.assertTrue(forAddressBoxErrorMessage);
        CommenSteps.waitForVisibility(createOrEditACustomerPage.userAccountDownMenu,5);

    }

    @And("Manager clicks on sign out button")
    public void managerClicksOnSignOutButton() {
        CommenSteps.waitForClickablility(createOrEditACustomerPage.signOutButton,5);
        createOrEditACustomerPage.signOutButton.click();
    }

    @And("Manager leaves address field blank")
    public void managerLeavesAddressFieldBlank() {
        createOrEditACustomerPage.addressTextBox.sendKeys("");
    }

    @And("Manager leaves city field blank")
    public void managerLeavesCityFieldBlank() {
        createOrEditACustomerPage.addressTextBox.sendKeys("Test street 100");
        createOrEditACustomerPage.cityTextBox.sendKeys(""+Keys.TAB);

    }

    @Then("Manager sees an error message for city box")
    public void managerSeesAnErrorMessageForCityBox() {
        boolean expectedValue = true;
        boolean actualValue = createOrEditACustomerPage.forCityTextBoxErrorMessage.getText().contains("This field is required.");
        Assert.assertEquals(expectedValue,actualValue);

    }

    @And("Manager leaves country field blank")
    public void managerLeavesCountryFieldBlank() {
        createOrEditACustomerPage.addressTextBox.sendKeys("Test street 100");
        createOrEditACustomerPage.cityTextBox.sendKeys("Miami");
        createOrEditACustomerPage.countryDropDownMenu.click();
        createOrEditACustomerPage.countryDropDownMenu.sendKeys(""+Keys.TAB);
    }

    @Then("Manager sees an error message for country dropdown")
    public void managerSeesAnErrorMessageForCountryDropdown() {
        boolean countryDropDownMenuText;
        try {
            createOrEditACustomerPage.countryDropDownMenu.getText().isEmpty();
            countryDropDownMenuText=false;
        }catch (Exception e){
            countryDropDownMenuText=true;
        }
        Assert.assertTrue(countryDropDownMenuText);
    }

    @And("Manager leaves state field blank")
    public void managerLeavesStateFieldBlank() {
        createOrEditACustomerPage.addressTextBox.sendKeys("Test street 100");
        createOrEditACustomerPage.cityTextBox.sendKeys("Miami");
        createOrEditACustomerPage.countryDropDownMenu.click();
        createOrEditACustomerPage.countryDropDownMenu.sendKeys("USA");
        createOrEditACustomerPage.stateTextBox.sendKeys(""+Keys.TAB);
    }

    @Then("Manager sees an error message for state box")
    public void managerSeesAnErrorMessageForStateBox() {
        boolean stateTextBoxText;
        try {
            createOrEditACustomerPage.stateTextBox.getText().isEmpty();
            stateTextBoxText=false;
        }catch (Exception e){
            stateTextBoxText=true;
        }
        Assert.assertTrue(stateTextBoxText);
    }

    @Then("Manager types a {string} and sees an error message")
    public void managerTypesAAndSeesAnErrorMessage(String state) {
        boolean stateTextBoxText;
        try {
            createOrEditACustomerPage.addressTextBox.sendKeys("Test street 100");
            createOrEditACustomerPage.cityTextBox.sendKeys("Miami");
            createOrEditACustomerPage.countryDropDownMenu.click();
            createOrEditACustomerPage.countryDropDownMenu.sendKeys("USA");
            createOrEditACustomerPage.stateTextBox.sendKeys(state + Keys.TAB);
            stateTextBoxText=true;
        }catch (Exception e){
            stateTextBoxText=false;
        }
        Assert.assertFalse(stateTextBoxText);
    }

}
