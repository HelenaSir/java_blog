package TestPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ListMenu extends BasePage{


    @FindBy(xpath = "//span[@class='s']/a")
    WebElement realEstate;
    @FindBy(xpath = "//*[@id=\"menu\"]/span/label")
    WebElement burgerMenu;
    @FindBy(xpath = "/html//div[@id='menu']/div//div[@class='c']//a[@href='/category/60']")
    WebElement Apaprments;

    @FindBy(xpath = "//div[@class ='at']/div[@class='lsw']")
    WebElement region;

    @FindBy(xpath = "//*[@id=\"ff\"]/div[1]/div/div[2]/div[2]/div[6]/input")
    WebElement chooseRegion;
    //*[@id="ff"]/div[1]/div/div[2]/div[2]/div[6]/input
    //*[@id="ff"]//div[@class ='at']/div[@class='lsw']/div[@class='l ms']/div[6]/input']

    @FindBy(xpath = "//*[@id=\"ff\"]/div[1]/div/div[2]/div[2]/div[@class='bt']/div[@class='b1']")
    WebElement chooseButton;
    //*[@id="ff"]//div[@class ='at']/div[@class='lsw']/div[@class='l ms']/div[@class='bt']/div[@class='b1']

    @FindBy(xpath = "//*[@id=\"idprice1\"]")
    WebElement startPrice;
    @FindBy(xpath = "//*[@id=\"idprice2\"]")
    WebElement endPrice;

    @FindBy(xpath = "//*[@id=\"ff\"]/div[3]/div[2]/div[2]/div/div[1]/div")
    WebElement currencyField;

    @FindBy(xpath = "//*[@id=\"ff\"]/div[3]/div[2]/div[2]/div/div[2]/div[2]")
    WebElement currencyUSD;


    public void ChooseApprtment() {

        Actions actions = new Actions(driver);

        actions.moveToElement(burgerMenu).perform();
        actions.moveToElement(realEstate).perform();
        Apaprments.click();
    }

    public void clikcOnRegion(){
        region.click();
    }
    public void clikcOnChoosenRegion(){
        chooseRegion.click();
    }

    public void clikcOnChooseButton(){
        chooseButton.click();
    }
    public void enterPriceRange(){
        startPrice.sendKeys("500");
        endPrice.sendKeys("50000");
    }
    public void chooseCurrencyField(){
        currencyField.click();
    }
    public void chooseCurrency(){
        currencyUSD.click();
    }

}

