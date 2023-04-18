package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPasswordPage {
    public LoginPasswordPage(){ PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy (css = "input[id='currentPassword']") public WebElement currentPasswordTextBox;
    @FindBy (xpath = "(//*[text()='Your password is required.'])[1]") public WebElement currentPasswordErrorMessage;
    @FindBy (css = "input[id='newPassword']") public WebElement newPasswordTextBox;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]") public WebElement newPasswordErrorMessage;
    @FindBy (xpath = "//li[@class='point'][1]") public WebElement passwordStrengthFirstPoint;
    @FindBy (xpath = "//li[@class='point'][2]") public WebElement passwordStrengthSecondPoint;
    @FindBy (xpath = "//li[@class='point'][3]") public WebElement passwordStrengthThirdPoint;
    @FindBy (xpath = "//li[@class='point'][4]") public WebElement passwordStrengthFourthPoint;
    @FindBy (xpath = "//li[@class='point'][5]") public WebElement passwordStrengthFifthPoint;
    @FindBy (css = "input[id='confirmPassword']") public WebElement confirmPasswordTextBox;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[2]") public WebElement newPasswordConfirmationErrorMessage;
    @FindBy (xpath = "//*[text()='Your confirmation password is required.']") public WebElement confirmPasswordErrorMessage;
    @FindBy (css = "button[class='btn btn-success']") public WebElement saveButton;

}
