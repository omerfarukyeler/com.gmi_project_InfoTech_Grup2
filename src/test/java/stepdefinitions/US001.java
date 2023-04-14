package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.RegisterPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {

    RegisterPages registerPages =new RegisterPages();
    @Given("Medunna ana sayfasina gider")
    public void medunnaAnaSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Sign in butonuna tiklar")
    public void signInButonunaTiklar() throws InterruptedException {

        registerPages.userButton.click();
        registerPages.signIn.click();
        Driver.wait(2);



    }
}
