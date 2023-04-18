package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Login_Page {
    public Login_Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(css="li[id='account-menu'] a[class='dropdown-toggle nav-link']") public WebElement signInRegister;

    @FindBy(css="a[id='login-item'] span") public WebElement signIn;

    @FindBy(css="#username") public WebElement userName;

    @FindBy(css="#password") public WebElement newPassword;

    @FindBy(css="button[type='submit']") public WebElement submitButtonForLogin;

    @FindBy(xpath="//span[normalize-space()='User Name']") public WebElement userNameAfterLogin;
    @FindBy(css=".btn.btn-secondary") public WebElement cancelButton;

    @FindBy(css="li[id='entity-menu'] a[class='dropdown-toggle nav-link'] span") public WebElement myOperations;

    @FindBy (xpath = "//span[normalize-space()='Manage Customers']") public WebElement manageCustomers;

    @FindBy (xpath = "//span[normalize-space()='Manage Accounts']") public WebElement manageAccounts;

    @FindBy(css="div[role='alert'] span strong") public WebElement errorMessage;

    @FindBy(xpath="//span[normalize-space()='Did you forget your password?']") public WebElement didYouForgetYourPassword;

    @FindBy(css="div[class='col-md-8'] h1 span") public WebElement resetYourPassword;

    @FindBy(xpath="//span[normalize-space()='Register a new account']") public WebElement registerANewAccount;

    @FindBy(css="h1[id='register-title'] span") public WebElement registrationMessage;

    @FindBy(xpath="//span[normalize-space()='User Name']") public WebElement userNameButtonAfterLogin;

    @FindBy(xpath="//span[normalize-space()='User Info']") public WebElement userInfo;

    @FindBy (xpath = "//span[normalize-space()='Password']") public WebElement password;
    @FindBy(xpath="//span[normalize-space()='Sign out']") public WebElement signOutButton;

    @FindBy(css="#firstName") public WebElement firstNameOnUserSettingsPage;

    @FindBy(css="#lastName") public WebElement lastNameOnUserSettingsPage;

    @FindBy(css="#email") public WebElement emailOnUserSettingsPage;

    @FindBy(css="#langKey") public WebElement languageOnUserSettingsPage;

    @FindBy(css ="#langKey option") public List<WebElement> languageOptionsOnUserSettingsPage;

    @FindBy(css=".invalid-feedback") public WebElement errorMessageOnUserSettingsPageForEmail;






    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;




}

