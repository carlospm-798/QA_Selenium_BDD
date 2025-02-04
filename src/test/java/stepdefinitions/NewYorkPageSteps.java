package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.NewYorkPage;

public class NewYorkPageSteps {

    NewYorkPage newYorkPage = new NewYorkPage();

    @Then("Search result list is displayed")
    public void checkingResultList() {
        Assert.assertTrue(newYorkPage.IsResultContainerDisplayed(),
                "Result container is not displayed");
    }

}