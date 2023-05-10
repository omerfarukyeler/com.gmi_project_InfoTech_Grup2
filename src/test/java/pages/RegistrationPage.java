package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="account-menu")
    public WebElement accountMenu;
    @FindBy(xpath = "//span[text()='Register']")
    public WebElement registerLink;
    @FindBy(id = "ssn")
    public WebElement ssnBox;
    @FindBy(id = "firstname")
    public WebElement firstName;
    @FindBy(id= "lastname")
    public WebElement lastName;
    @FindBy(id= "address")
    public WebElement address;
    @FindBy(id= "mobilephone")
    public WebElement mobilePhone;
    @FindBy(id="username")
    public WebElement userName;
    @FindBy(id="email")
    public WebElement email;
    @FindBy(id="firstPassword")
    public WebElement firstPassword;
    @FindBy(id="secondPassword")
    public WebElement secondPassword;
    @FindBy(id="register-submit")
    public WebElement registerButton;
    @FindBy(xpath = "//strong[text()='Registration saved!']")
    public WebElement registrationSaved;
}