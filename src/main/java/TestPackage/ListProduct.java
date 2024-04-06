package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ListProduct extends BasePage {
    @FindBy(xpath = "//*[@id=\"contentr\"]/div[3]/div")
    WebElement resultItems;

    public String getSearchResult() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            WebElement announcements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='contentr']/div[@class='glheader']")));
            String searchResultText = announcements.getText();
            System.out.println("Search result: " + searchResultText);
            return searchResultText;
        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
            return null;
        }

    }


}

