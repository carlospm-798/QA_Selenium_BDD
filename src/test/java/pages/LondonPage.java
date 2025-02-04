package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.time.Duration;

public class LondonPage extends Form {

    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By SEARCH_FIELD = By.xpath("//*[@class='search-input']");
    private final By FIRST_RESULT = By.xpath("//*[@class='search-bar-result__name']");
    private final By HEADER = By.xpath("//*[@class='header-loc']");
    private final By CLICK_ACCUWEATHER_LOGO = By.xpath("//*[@class='header-logo']");
    private final By FIRST_RESENT_LOCATION = By.xpath("//*[@class='featured-locations__locations']//div[@class='recent-locaton-name-wrapper']");
    private final By SKIP_BUTTON = By.xpath("//div[@id='dismiss-button']");
    private final By MAP_CONTAINER = By.xpath("//div[@class='recommended-map-container  is-en']");

    private final ITextBox textField = elementFactory.getTextBox(SEARCH_FIELD, "Search field");
    private final ITextBox firstResult = elementFactory.getTextBox(FIRST_RESULT, "First result");
    private final ITextBox header = elementFactory.getTextBox(HEADER, "Header result");
    private final ITextBox accuweatherHeader = elementFactory.getTextBox(CLICK_ACCUWEATHER_LOGO, "Accuweather logo");
    private final IButton clickToFirstResentLocation = elementFactory.getButton(FIRST_RESENT_LOCATION, "First resent location");
    private final ITextBox skipButton = elementFactory.getTextBox(SKIP_BUTTON, "skip button");
    private final ILabel mapContainer = elementFactory.getLabel(MAP_CONTAINER, "Map container");

    public LondonPage() {
        super(By.xpath("//*[@class='accuweather']"), "Main Page");
    }

    public void CleanAndWrite(String search) {
        textField.clearAndType(search);
    }

    public void ClickTheFirstResult() {
        firstResult.state().waitForDisplayed();
        firstResult.clickAndWait();
    }

    public boolean IsHeaderSearchDisplayed(String place) {
        header.state().waitForDisplayed();
        return header.getText().contains(place);
    }

    public void ClickTheAccuweatherLogo() {
        mapContainer.state().waitForDisplayed();

        accuweatherHeader.state().waitForDisplayed();
        accuweatherHeader.click();
    }

    public boolean IsMainPageDisplayed() {
        textField.state().waitForDisplayed();
        return textField.state().isDisplayed();
    }

    public void clickingFirstResentLocation() {
        clickToFirstResentLocation.state().waitForDisplayed();
        clickToFirstResentLocation.click();

        clickSkipButton();
    }

    public void clickSkipButton() {
        AqualityServices.getBrowser().getDriver().switchTo().frame(
                AqualityServices.getBrowser().getDriver().findElement(By.xpath("//iframe[@name='google_ads_iframe_/6581/web/gb/interstitial/news_info/country_home_0']")));


        if (skipButton.state().isDisplayed()){
            skipButton.click();
        } else {
            System.out.println("The skip button where no found");
        }

        AqualityServices.getBrowser().getDriver().switchTo().defaultContent();
    }

}