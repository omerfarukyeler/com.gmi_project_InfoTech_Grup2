package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.Login_Page;
import utilities.CommenSteps;

import java.util.ArrayList;
import java.util.List;

public class US006 {

    Login_Page loginPage = new Login_Page();
    @And("User clicks on the userName button")
    public void userClicksOnTheUserNameButton() {
        loginPage.userNameButtonAfterLogin.click();
    }

    @And("User clicks on the user info button")
    public void userClicksOnTheUserInfoButton() {
        loginPage.userInfo.click();
    }

    @Then("User verifies that the first name, last name, e-mail and language fields are editable")
    public void userVerifiesThatTheFirstNameLastNameEMailAndLanguageFieldsAreEditable() {
        Boolean fieldsIsEditable;
        try{
            CommenSteps.doubleClick(loginPage.firstNameOnUserSettingsPage);
            loginPage.firstNameOnUserSettingsPage.sendKeys("First123"+ Keys.TAB);
            System.out.println("first name is typed");
            loginPage.lastNameOnUserSettingsPage.sendKeys("Last123"+ Keys.TAB);
            System.out.println("last name is typed");
            loginPage.emailOnUserSettingsPage.sendKeys("user2020@gmail.com"+ Keys.TAB);
            System.out.println("email is typed");
            loginPage.languageOnUserSettingsPage.sendKeys("English");
            System.out.println("language is typed");
            fieldsIsEditable=true;

        }catch (Exception e){
            fieldsIsEditable=false;
        }
        Assert.assertTrue(fieldsIsEditable);
    }

    @Then("User verifies that there are two languages English and Turkish")
    public void userVerifiesThatThereAreTwoLanguagesEnglishAndTurkish() {
        List<WebElement> listOfWebElements = loginPage.languageOptionsOnUserSettingsPage;

        List<String> listOfLanguages = new ArrayList<>();
        listOfLanguages.add(listOfWebElements.get(0).getText());
        listOfLanguages.add(listOfWebElements.get(1).getText());
       // int size=listOfLanguages.size();
        //System.out.println("size = " + size);
        //System.out.println(listOfLanguages.get(0));
        //System.out.println(listOfLanguages.get(1));
        Assert.assertEquals("English",listOfLanguages.get(0));
        Assert.assertEquals("Türkçe",listOfLanguages.get(1));
    }



}
