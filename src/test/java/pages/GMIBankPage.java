package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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






}
