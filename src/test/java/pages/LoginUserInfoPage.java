package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginUserInfoPage {
    public LoginUserInfoPage(){PageFactory.initElements(Driver.getDriver(),this); }
}
