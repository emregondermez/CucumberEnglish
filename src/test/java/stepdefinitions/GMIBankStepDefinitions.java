package stepdefinitions;

import io.cucumber.java.en.*;
import pages.*;
import utilities.*;


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
    public void user_click_on_the_sign_in_button() {
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


    @Given("user click on the second sign in button")
    public void user_click_on_the_login_button() {
        gmiBankPage.signInButton.click();
    }


    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankRegistrationPage"));
    }
    @Given("user enters ssn number as {string}")
    public void user_enters_ssn_number_as(String ssn) {
    gmiBankPage.ssnTextBox.sendKeys(ssn);
    }
    @Given("user enters firstname as {string}")
    public void user_enters_firstname_as(String firstname) {
    gmiBankPage.firstPasswordTextBox.sendKeys(firstname);
    }
    @Given("user enters lastname as {string}")
    public void user_enters_lastname_as(String lastname) {
    gmiBankPage.lastnameTextBox.sendKeys(lastname);
    }
    @Given("user provides address {string}")
    public void user_provides_address(String address) {
    gmiBankPage.addressTextBox.sendKeys(address);
    }
    @Given("user provides phone number {string}")
    public void user_provides_phone_number(String phone) {
    gmiBankPage.mobilephoneTextBox.sendKeys(phone);
    }
    @Given("user sends email address as {string}")
    public void user_sends_email_address_as(String email) {
    gmiBankPage.emailTextBox.sendKeys(email);
    }
    @Given("user provides password {string}")
    public void user_provides(String password) {
    gmiBankPage.firstPasswordTextBox.sendKeys(password);
    gmiBankPage.secondPasswordTextBox.sendKeys(password);
    }
    @Given("user click on the register button")
    public void user_click_on_the_register_button() {
    gmiBankPage.registerButton.click();
    }
    @Given("user see the successfully registrated message")
    public void user_see_the_successfully_registrated_message() {

    }
}
