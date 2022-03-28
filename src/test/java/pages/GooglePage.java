package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[text()='Ik ga akkoord']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement searchBox;

}
