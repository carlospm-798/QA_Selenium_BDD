package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import org.openqa.selenium.By;
import aquality.selenium.forms.Form;

public class CurrentLocationPage extends Form {

    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By SEARCH_FIELD = By.xpath("//*[@class='search-input']");
    private final By CURRENT_LOCATION = By.xpath("//*[@class='search-bar-result current-location-result']");

    private final ITextBox textField = elementFactory.getTextBox(SEARCH_FIELD, "Search field");
    private final IButton currentLocation = elementFactory.getButton(CURRENT_LOCATION, "Current location");

    public CurrentLocationPage() {
        super(By.xpath("//*[@class='accuweather']"), "Main Page");
    }

    public void ClickTextField() {
        textField.state().waitForDisplayed();
        textField.click();
    }

    public boolean IsCurrentLocationDisplayed() {
        currentLocation.state().waitForDisplayed();
        return currentLocation.state().isDisplayed();
    }

}