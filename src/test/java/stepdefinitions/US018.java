package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;
import utilities.CommenSteps;

public class US018 {
    GmiBankHomePage gmiBankHomePage = new GmiBankHomePage();
    SignInPage signInPage = new SignInPage();
    Login_Page loginPage = new Login_Page();
    ManageCustomersPage manageCustomersPage = new ManageCustomersPage();
    CreateOrEditACustomerPage createOrEditACustomerPage = new CreateOrEditACustomerPage();
    @Then("Manager validates the customers fact {string}")
    public void managerValidatesTheCustomersFact(String sheetHeaders) {
        boolean expectedValue = true;
        boolean actualValue = manageCustomersPage.customersInfoHeads.getText().contains(sheetHeaders);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Then("Manager validates view option button all for all customers")
    public void managerValidatesViewOptionButtonAllForAllCustomers() {
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

    @Then("Manager validates view edit button all for all customers")
    public void managerValidatesViewEditButtonAllForAllCustomers() {
        CommenSteps.verifyElementDisplayed(manageCustomersPage.customersFirstLineEditButton);
        CommenSteps.verifyElementDisplayed(manageCustomersPage.customersTenthLineEditButton);
        CommenSteps.verifyElementDisplayed(manageCustomersPage.customersTwentiethLineEditButton);
    }

    @And("Manager clicks any customer edit button in the customer table")
    public void managerClicksAnyCustomerEditButtonInTheCustomerTable() {
        manageCustomersPage.customersTenthLineEditButton.click();
    }

    @Then("Manager validates that the edit customers button is available with the data on the next page")
    public void managerValidatesThatTheEditCustomersButtonIsAvailableWithTheDataOnTheNextPage() {
        CommenSteps.verifyElementDisplayed(createOrEditACustomerPage.customerIdTextBox);
    }

    @And("Manager clicks any customer delete button in the customer table")
    public void managerClicksAnyCustomerDeleteButtonInTheCustomerTable() {
        manageCustomersPage.customersFirstLineDeleteButton.click();
    }

    @Then("Manager sees a question message about wanting to delete")
    public void managerSeesAQuestionMessageAboutWantingToDelete() {
        CommenSteps.waitForVisibility(manageCustomersPage.deleteQuestionDialog,5);
        Assert.assertTrue(manageCustomersPage.deleteQuestionDialog.getText().contains("Are you sure you want to delete Customer"));
    }
}
