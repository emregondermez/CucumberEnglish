package stepdefinitions;

import io.cucumber.java.en.*;
import pages.GMIBankPage;
import utilities.ConfigReader;
import utilities.Driver;

public class GMIBankStepDefinitions {

    @Given("user on the GMI main page")
    public void user_on_the_gmi_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));
    }

    GMIBankPage gmiBankPage = new GMIBankPage();
    @Given("user clicks on the login dropdown")
    public void user_clicks_on_the_login_dropdown() {
        gmiBankPage.singInDropDown.click();

    }
    @Given("user click on the sign in button")
    public void user_click_on_the_signin_button() {
        gmiBankPage.singIn.click();
    }
    @Given("user sends username like {string}")
    public void user_sendUsername(String username) {
    gmiBankPage.usernameTextBox.sendKeys(username);
    }

    @Given("user sends password like {string}")
    public void user_sendPassword(String password) {
    gmiBankPage.passwordTextBox.sendKeys(password);
    }


  

}
