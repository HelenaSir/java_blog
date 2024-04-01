package TestPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsSwab extends BasePage {

    @FindBy(className = "shopping_cart_link")
    public WebElement basket;

    public void watchBasket() {
        basket.click();

    }
}
