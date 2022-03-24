package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

public class GMIBankPage {

    public GMIBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement singInDropDown;


    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement singIn;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInButton;


    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstnameTextBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastnameTextBox;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressTextBox;


    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement mobilephoneTextBox;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement RegistrationUsernameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement firstPasswordTextBox;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement secondPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButton;








}
