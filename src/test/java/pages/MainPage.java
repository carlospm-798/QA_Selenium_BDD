package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import org.openqa.selenium.By;
import aquality.selenium.forms.Form;

public class MainPage extends Form {

    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By POLICY_BUTTON = By.xpath("//div[@class='banner-button policy-accept']");
    private final IButton clickPolicyButton = elementFactory.getButton(POLICY_BUTTON, "Policy");

    public MainPage() {
        super(By.xpath("//*[@class='accuweather']"), "Main Page");
    }

    public void ClickPolicyButton() {
        clickPolicyButton.click();
    }

}