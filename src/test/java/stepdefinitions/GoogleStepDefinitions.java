package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.*;
import utilities.*;


public class GoogleStepDefinitions {

    GooglePage googlePage = new GooglePage();
    @Given("user on the google page")
    public void user_on_the_google_page() {
        Driver.getDriver().get(ConfigReader.getProperty("GoogleUrl"));
        googlePage.acceptCookies.click();

    }


    @When("user search for iphone")
    public void user_search_for_iphone() {
    googlePage.searchBox.sendKeys("iphone", Keys.ENTER);
    }

    @Then("verify the result has iphone related results")
    public void verify_the_result_has_iphone_related_results() {
        String title = Driver.getDriver().getTitle();
        String expectedResult="iphone";
        Assert.assertTrue(title.contains(expectedResult));

    }
    @Then("user close the application")
    public void user_close_the_application() {

        Driver.closeDriver();
    }


    @When("user search for {string}")
    public void user_search_for(String keyword) {
        googlePage.searchBox.sendKeys(keyword,Keys.ENTER);
    }
    @When("verify the result has {string} related results")
    public void verify_the_result_has_related_results(String keyword) {
       String title = Driver.getDriver().getTitle();
       Assert.assertTrue(title.contains(keyword));
    }
}
