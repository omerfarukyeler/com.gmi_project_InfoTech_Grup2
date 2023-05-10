package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;

public class US009 {
    SignInPage signInPage = new SignInPage();
    LoginPasswordPage loginPasswordPage = new LoginPasswordPage();
    GmiBankHomePage gmiBankHomePage = new GmiBankHomePage();
    Login_Page loginPage = new Login_Page();
    CreateOrEditACustomerPage createOrEditACustomerPage = new CreateOrEditACustomerPage();
    @And("User clicks on the my operatıons button")
    public void userClicksOnTheMyOperatıonsButton() {
        loginPage.myOperations.click();
    }

    @And("User clicks on the manage customer button")
    public void userClicksOnTheManageCustomerButton() {
        loginPage.manageCustomers.click();
    }

    @And("User clicks on the create a new customer button")
    public void userClicksOnTheCreateANewCustomerButton() {
        loginPage.createANewCustomer.click();
    }

    @And("User types SSN  in the relevant field on the Page")
    public void userTypesSSNInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.ssn.sendKeys("124-15-1269");
    }

    @And("User types first name  in the relevant field on the Page")
    public void userTypesFirstNameInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.firstName.sendKeys("ahmet");
    }

    @And("User types last name  in the relevant field on the Page")
    public void userTypesLastNameInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.lastName.sendKeys("guclu");
    }

    @And("User types email  in the relevant field on the Page")
    public void userTypesEmailInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.email.sendKeys("ahmetguclu@gmail.com");
    }

    @And("User types zip code  in the relevant field on the Page")
    public void userTypesZipCodeInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.zipCode.sendKeys("32358");
    }

    @Then("User verifies the customer that created new")
    public void userVerifiesTheCustomerThatCreatedNew() {
        Boolean errorStatus=null;
        try{
            String errorMessage=createOrEditACustomerPage.InternalServerError.getText();
            if (errorMessage.contains("Internal server error")){
                errorStatus=true;
            }
        }catch (Exception e){
            errorStatus=false;
        }
        Assert.assertFalse(errorStatus);
    }

    @And("User types middle Initial in the relevant field on the Page")
    public void userTypesMiddleInitialInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.middleInitial.sendKeys("tarik");
    }

    @And("User types Mobile Phone Number  in the relevant field on the Page")
    public void userTypesMobilePhoneNumberInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.mobilePhoneNumber.sendKeys("145-158-1681");
    }

    @And("User types Phone Number  in the relevant field on the Page")
    public void userTypesPhoneNumberInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.phoneNumber.sendKeys("158-258-6582");
    }

    @And("User types address  in the relevant field on the Page")
    public void userTypesAddressInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.addressTextBox.sendKeys("karaali sok.");
    }

    @And("User types city in the relevant field on the Page")
    public void userTypesCityInTheRelevantFieldOnThePage() {
        createOrEditACustomerPage.city.sendKeys("ankara");
    }

    @And("User clicks on the save button on the same Page")
    public void userClicksOnTheSaveButtonOnTheSamePage() {
        createOrEditACustomerPage.save.click();
    }
}
