package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Login_Page;

public class US007 {
    Login_Page loginPage = new Login_Page();
    @Then("User types the {string} on the email section")
    public void userTypesTheOnTheEmailSection(String invalidEmail) {
        loginPage.lastNameOnUserSettingsPage.sendKeys("Name"+ Keys.TAB);
        loginPage.emailOnUserSettingsPage.sendKeys(invalidEmail+ Keys.TAB);
        String errorMessage =loginPage.errorMessageOnUserSettingsPageForEmail.getText();
        Assert.assertEquals("This field is invalid",errorMessage);
    }

    @And("User clicks on sign out Button")
    public void userClicksOnSignOutButton() {
        loginPage.signOutButton.click();
    }

    @Then("User verifies that is not an option of any other language other than English or Turkish")
    public void userVerifiesThatIsNotAnOptionOfAnyOtherLanguageOtherThanEnglishOrTurkish() {
        Boolean isThereOtherLanguage;
        try {
            loginPage.languageOnUserSettingsPage.sendKeys("Germany");
            isThereOtherLanguage=true;
        }catch (Exception e){
            isThereOtherLanguage=false;
        }
        System.out.println("isThereOtherLanguage = " + isThereOtherLanguage);
        Assert.assertFalse(isThereOtherLanguage);
    }
}
