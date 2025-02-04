package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LondonPage;

import static io.qameta.allure.Allure.step;

public class LondonPageSteps {

    LondonPage londonPage = new LondonPage();

    @When("I clean and write {string} in the search input")
    public void cleanAndWrite(String search) {
        step("I clean and write " + search + " in the search input");
        londonPage.CleanAndWrite(search);
    }

    @And("I click the first result")
    public void clickFirstResult() {
        step("I click the first result");
        londonPage.ClickTheFirstResult();
    }

    @Then("I check that {string} is in the header of the page")
    public void checkingHeaderPage(String search) {
        Assert.assertTrue(londonPage.IsHeaderSearchDisplayed(search),
                "Search " + search + " is not displayed in the header");
    }

    @When("I click the logo to return to menu")
    public void returnToMenu() {
        step("I click the logo to return to menu");
        londonPage.ClickTheAccuweatherLogo();
    }

    @Then("Main page is opened")
    public void checkingMainPage() {
        Assert.assertTrue(londonPage.IsMainPageDisplayed(),
                "Element of main page is not displayed");
    }

    @When("I click on the first resent search")
    public void clickingFirstResentSearch() {
        step("I click on the first resent search");
        londonPage.clickingFirstResentLocation();
    }

}