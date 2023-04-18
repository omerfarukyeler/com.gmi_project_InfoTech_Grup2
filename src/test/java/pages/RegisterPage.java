package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//li[@id='account-menu']//a[@class='dropdown-toggle nav-link']")
    public WebElement userButton;

    @FindBy(xpath  ="//span[normalize-space()='Register']")
    public WebElement registerButton;

    @FindBy(xpath="//input[@id='ssn']")
    public WebElement ssnLogin;

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")
    public WebElement ssnCheck;
    //div[normalize-space()='Please enter your social security number.']


    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement name;

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")
    public WebElement nameCheck;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")
    public WebElement lastNameCheck;

    @FindBy(xpath = "//input[@id='address']")
    public  WebElement adress;

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")
    public WebElement adresscheck;

    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")
    public WebElement phoneNumberCheck;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement repassword;

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")
    public WebElement passwordCheck;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")
    public WebElement emailCheck;

    @FindBy(xpath ="//div[@class='Toastify__toast-body']")
    public WebElement succesfullmessage;

    @FindBy(xpath = "//button[@id='register-submit']//span[contains(text(),'Register')]")
    public WebElement registerbuttonclick;

    @FindBy(xpath = "//div[normalize-space()='Please enter your social security number.']")
    public WebElement ssnFailedCheck;

    @FindBy(xpath = "//div[normalize-space()='Please enter your first name.']")
    public WebElement nameFailedCheck;

    @FindBy(xpath = "//div[normalize-space()='Please enter your last name.']")
    public WebElement lastNameFailedCheck;

    @FindBy(xpath = "//div[normalize-space()='Please enter your address.']")
    public WebElement adressFailedCheck;

    @FindBy(xpath = "//div[normalize-space()='Please enter your mobile phone number.']")
    public WebElement phoneNumberFailedCheck;

    @FindBy(xpath = "//div[normalize-space()='Your username is required.']")
    public WebElement usernameFailedCheck;

    @FindBy(xpath = "//div[normalize-space()='Please enter your email.']")
    public WebElement emailFailedCheck;

    @FindBy(xpath = "//div[normalize-space()='Your password is required.']")
    public WebElement passwordFailedCheck;

    @FindBy(xpath = "//div[normalize-space()='Your confirmation password is required.']")
    public WebElement repasswordFailedCheck;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnInvalid;

    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement telNumberInvalid;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailinvalid;

    @FindBy(xpath = "//div[@class='jh-card card']//li[4]")
    public  WebElement strengthbar;














}



