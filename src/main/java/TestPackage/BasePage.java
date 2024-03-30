package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public BasePage() {
        driver = InitDriver.driver;
        PageFactory.initElements(driver, this);

    }
}
