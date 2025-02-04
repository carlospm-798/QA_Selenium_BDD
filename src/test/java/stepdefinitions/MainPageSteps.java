package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;
import static io.qameta.allure.Allure.step;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Given("Accuweather main page is opened")
    public void clickConsentDataUsage() {
        step("I consent data usage in the new page");
        mainPage.ClickPolicyButton();
    }

}