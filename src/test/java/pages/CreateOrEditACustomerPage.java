package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditACustomerPage {
    public CreateOrEditACustomerPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (css = "input[id='tp-customer-address']")    public WebElement addressTextBox;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]") public WebElement forAddressTextBoxErrorMessage;
    @FindBy (xpath = "(//div[@class='text-danger form-group'])[2]") public WebElement forAddressGroupErrorMessage;
    @FindBy (xpath = "(//div[@class='text-danger form-group'])[2]") public WebElement forAddressTextBox;
    @FindBy (css = "input[id='tp-customer-city']")  public WebElement cityTextBox;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]") public WebElement forCityTextBoxErrorMessage;
    @FindBy (xpath = "(//div[@class='text-danger form-group'])[4]") public WebElement forCityGroupErrorMessage;
    @FindBy (css = "select[id='tp-customer-country']") public WebElement countryDropDownMenu;
    @FindBy (xpath = "//*[@id='tp-customer-country']/option[70]") public WebElement countryDropDownMenuUSA;
    @FindBy (css = "input[id='tp-customer-state']") public WebElement stateTextBox;
    @FindBy (css = "select[id='tp-customer-user']") public WebElement userDropDownMenu;

    @FindBy (css = "button[id='save-entity']") public WebElement saveButton;

    @FindBy (css = "a[id='cancel-save']") public WebElement backButton;
    @FindBy (css = "li[id='account-menu']") public WebElement userAccountDownMenu;
    @FindBy(xpath="//span[normalize-space()='Sign out']") public WebElement signOutButton;


    @FindBy(id = "tp-customer-createDate") public WebElement createDate;

    @FindBy(xpath = "//select[@name='user.id']")  public WebElement user;

    @FindBy(id = "tp-customer-zelleEnrolled")  public WebElement zelleEnrolled;

    @FindBy(id = "tp-customer-account")  public WebElement account;

    @FindBy(id = "search-ssn")  public WebElement searchSsn;

    @FindBy(xpath = "//button[text()='Search']")  public WebElement selectButton;

    @FindBy(id = "tp-customer-middleInitial")  public WebElement middleInitial;

    @FindBy(id = "tp-customer-phoneNumber")  public WebElement phoneNumber;

    @FindBy(id = "tp-customer-zipCode")  public WebElement zipCode;

    @FindBy(id = "tp-customer-city")  public WebElement city;

    @FindBy(xpath = "//div[@role='alert']")  public WebElement alert;
    @FindBy (css = "input[id='tp-customer-id']") public WebElement customerIdTextBox;

    @FindBy(id = "tp-customer-firstName") public WebElement firstName;

    @FindBy(id = "tp-customer-lastName")  public WebElement lastName;

    @FindBy(id = "tp-customer-ssn") public WebElement ssn;

    @FindBy(id = "tp-customer-mobilePhoneNumber")  public WebElement mobilePhoneNumber;

    @FindBy(id = "tp-customer-email")  public WebElement email;

}


