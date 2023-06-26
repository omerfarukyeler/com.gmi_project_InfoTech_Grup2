package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utilities.ReUsableMethods;
import utilities.ConfigReader;

public class US012 {
    GmiBankHomePage gmiBankHomePage = new GmiBankHomePage();
    SignInPage signInPage = new SignInPage();
    Login_Page loginPage = new Login_Page();
    ManageCustomersPage manageCustomersPage = new ManageCustomersPage();
    CreateOrEditACustomerPage createOrEditACustomerPage = new CreateOrEditACustomerPage();

    @When("Employee clicks dropdown account menu")
    public void employeeClicksDropdownAccountMenu() {
        ReUsableMethods.waitForClickablility(gmiBankHomePage.accountMenu,5);
        gmiBankHomePage.accountMenu.click();
    }

    @And("Employee clicks on the Sign in")
    public void employeeClicksOnTheSignIn() {
        gmiBankHomePage.loginItem.click();
    }

    @And("Employee types the valid username in the relevant field")
    public void employeeTypesTheValidUsernameInTheRelevantField() {
        ReUsableMethods.waitForClickablility(signInPage.userNameTextBox,5);
        signInPage.userNameTextBox.sendKeys(ConfigReader.getProperty("employeeLoginName"));
    }

    @And("Employee types the valid password in the relevant field")
    public void employeeTypesTheValidPasswordInTheRelevantField() {
        signInPage.newPasswordTextBox.sendKeys(ConfigReader.getProperty("employeeLoginPassword"));
    }

    @And("Employee clicks on Sign in button")
    public void employeeClicksOnSignInButton() {
        ReUsableMethods.waitForVisibility(signInPage.userNameTextBox,5);
        signInPage.signInButton.click();
    }

    @And("Employee clicks on My Operations menu")
    public void employeeClicksOnMyOperationsMenu() {
        ReUsableMethods.waitForVisibility(loginPage.myOperations,5);
        loginPage.myOperations.click();
    }

    @And("Employee clicks on Manage Customers")
    public void employeeClicksOnManageCustomers() {
        ReUsableMethods.waitForVisibility(loginPage.manageCustomers,5);
        loginPage.manageCustomers.click();
    }

    @Then("Employee validates the customers fact {string}")
    public void employeeValidatesTheCustomersFact(String sheetHeaders) {
        boolean expectedValue = true;
        boolean actualValue = manageCustomersPage.customersInfoHeads.getText().contains(sheetHeaders);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Then("Employee validates view option button all for all customers")
    public void employeeValidatesViewOptionButtonAllForAllCustomers() {
        boolean expectedValue = true;
        boolean actualValue = manageCustomersPage.customersFirstLineViewButton.isDisplayed();
        Assert.assertEquals(expectedValue,actualValue);

        boolean expectedValueTen = true;
        boolean actualValueTen = manageCustomersPage.customersTenthLineViewButton.isDisplayed();
        Assert.assertEquals(expectedValueTen,actualValueTen);

        boolean expectedValueTwenty = true;
        boolean actualValueTwenty = manageCustomersPage.customersTwentiethLineViewButton.isDisplayed();
        Assert.assertEquals(expectedValueTwenty,actualValueTwenty);
    }

    @And("Employee clicks any customer edit button in the customer table")
    public void employeeClicksAnyCustomerEditButtonInTheCustomerTable() {
        manageCustomersPage.customersTenthLineEditButton.click();
    }

    @Then("Employee validates that the edit customers button is available with the data on the next page")
    public void employeeValidatesThatTheEditCustomersButtonIsAvailableWithTheDataOnTheNextPage() {
        ReUsableMethods.verifyElementDisplayed(createOrEditACustomerPage.customerIdTextBox);
    }

    @Then("Employee validates view edit button all for all customers")
    public void employeeValidatesViewEditButtonAllForAllCustomers() {
        ReUsableMethods.verifyElementDisplayed(manageCustomersPage.customersFirstLineEditButton);
        ReUsableMethods.verifyElementDisplayed(manageCustomersPage.customersTenthLineEditButton);
        ReUsableMethods.verifyElementDisplayed(manageCustomersPage.customersTwentiethLineEditButton);
    }

    @And("Employee clicks any customer delete button in the customer table")
    public void employeeClicksAnyCustomerDeleteButtonInTheCustomerTable() {
        manageCustomersPage.customersFirstLineDeleteButton.click();
    }

    @Then("Employee sees a question message about wanting to delete")
    public void employeeSeesAQuestionMessageAboutWantingToDelete() {
        ReUsableMethods.waitForVisibility(manageCustomersPage.deleteQuestionDialog,5);
        Assert.assertTrue(manageCustomersPage.deleteQuestionDialog.getText().contains("Are you sure you want to delete Customer"));
    }
}
