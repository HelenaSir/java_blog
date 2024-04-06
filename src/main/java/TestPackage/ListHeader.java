package TestPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListHeader extends BasePage {



    @FindBy(id = "search")
    WebElement search;

    @FindBy(xpath = "//div[@class='b']/a[1]")
    WebElement myPage;

    @FindBy(xpath = "//div[@class='b']/a[2]")
    WebElement myNews;

    public ListHeader header() {
        search.click();
        return new ListHeader();

    }

    public ListHeader page() {
        myPage.click();
        return new ListHeader();

    }

    public ListHeader news() {
        myNews.click();
        return new ListHeader();

    }
}
