package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {
    public SignInPage(){ PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy (css = "input[id='username']") public WebElement userNameTextBox;
    @FindBy (css = "input[id='password']") public WebElement newPasswordTextBox;
    @FindBy (xpath = "//*[text()='Did you forget your password?']") public WebElement forgetPasswordLink;
    @FindBy (xpath = "//*[text()='Register a new account']") public WebElement registerNewAccountLink;
    @FindBy (css = "button[class='btn btn-secondary']") public WebElement cancelButton;
    @FindBy (css = "button[class='btn btn-primary']") public WebElement signInButton;

}
