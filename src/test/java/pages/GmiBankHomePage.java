package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GmiBankHomePage {

    public GmiBankHomePage(){PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (css = "li[id='account-menu']")
    public WebElement accountMenu;
    @FindBy (css = "a[id='login-item']")
    public WebElement loginItem;
    @FindBy (xpath = "//*[text()='Register']")
    public WebElement registerItem;

}
