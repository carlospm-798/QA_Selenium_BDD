package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class NewYorkPage extends Form {

    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By RESULT_CONTAINER = By.xpath("//div[@class='results-container']");
    private final ITextBox resultContainer = elementFactory.getTextBox(RESULT_CONTAINER, "Result container");


    public NewYorkPage() {
        super(By.xpath("//*[@class='accuweather']"), "Main Page");
    }

    public boolean IsResultContainerDisplayed() {
        resultContainer.state().waitForDisplayed();
        return resultContainer.state().isDisplayed();
    }

}