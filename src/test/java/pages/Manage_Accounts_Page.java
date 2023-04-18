package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Manage_Accounts_Page {
    public Manage_Accounts_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='table']/tbody/tr/td[4]")
    public List<WebElement> accounttypes;

    @FindBy(xpath = "//*[@class='table']/tbody/tr/td[3]")
    public List<WebElement> balances;

    @FindBy (xpath = "//a[@class='btn btn-info btn-sm']")
    public List<WebElement> views;

    @FindBy(id="jh-create-entity")
    public WebElement createANewAccount;



}
