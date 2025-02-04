package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CurrentLocationPage;

import static io.qameta.allure.Allure.step;

public class CurrentLocationSteps {

    CurrentLocationPage currentLocationPage = new CurrentLocationPage();

    @When("I click the search field")
    public void ClickSearchField() {
        step("I click the search field");
        currentLocationPage.ClickTextField();
    }

    @Then("The current location label is displayed")
    public void CheckingCurrentLocation(){
        Assert.assertTrue(currentLocationPage.IsCurrentLocationDisplayed(),
                "Current location label is not displayed");
    }

}