package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class UserManagementPage {
    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement signInLink;
    @FindBy (id = "username")
    public WebElement usernameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInButton;
    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administrationLink;
    @FindBy(xpath = "//span[text()='User management']")
    public WebElement userManagementLink;
    @FindBy(id="modified-date-sort")
    public WebElement modifiedDate;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement activationButton;
    @FindBy(xpath = "//span[text()='Activated']")
    public WebElement activationStuation;
    @FindBy(xpath = "//span[text()='View']")
    public WebElement viewButton;
    @FindBy(xpath = "//span[text()='Admin Strator']")
    public WebElement administratorMenu;
    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButton;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;
    @FindBy(xpath = "//div[text()='A user is updated with identifier alikundilli']")
    public WebElement editUpdate;
    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButton;
    @FindBy(xpath = "(//button[@type='button'])[26]")
    public WebElement deleteButton2;
    @FindBy(xpath = "//div[text()='A user is deleted with identifier alikundilli']")
    public WebElement deletedUpdate;
    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOutLink;
    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButtonEmployee;
    @FindBy(xpath = "//option[@value='ROLE_EMPLOYEE']")
    public WebElement roleButtonEmployee;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButtonEmployee;
    @FindBy(xpath = "//div[text()='A user is updated with identifier alikundilli']")
    public WebElement editUpdateEmployee;
    @FindBy(xpath = "//option[@value='ROLE_CUSTOMER']")
    public WebElement roleButtonCustomer;
    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButtonManager;
    @FindBy(xpath = "//option[@value='ROLE_MANAGER']")
    public WebElement roleButtonManager;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButtonManager;
    @FindBy(xpath = "//div[text()='A user is updated with identifier alikundilli']")
    public WebElement editUpdateManager;
    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButtonAdmin;
    @FindBy(xpath = "//option[@value='ROLE_ADMIN']")
    public WebElement roleButtonAdmin;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButtonAdmin;
    @FindBy(xpath = "//div[text()='A user is updated with identifier alikundilli']")
    public WebElement editUpdateAdmin;
}