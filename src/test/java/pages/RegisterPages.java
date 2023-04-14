package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPages {

    public RegisterPages() {PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']//*[name()='svg']")
    public WebElement userButton;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement signIn;


}
