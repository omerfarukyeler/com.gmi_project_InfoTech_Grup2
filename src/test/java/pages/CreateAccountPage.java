package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateAccountPage {

    public CreateAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="tp-account-description")
    public WebElement description;

    @FindBy(id = "tp-account-balance")
    public WebElement balance;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountType;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusType;

    @FindBy(id = "tp-account-createDate")
    public WebElement createDate;

    @FindBy(id = "tp-account-closedDate")
    public WebElement closedDate;

    @FindBy(id = "tp-account-employee")
    public WebElement employee;

    @FindBy(id = "save-entity")
    public WebElement save;

    @FindBy(className = "invalid-feedback")
    public WebElement descriptionFeedback;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement balanceFeedback;


}
