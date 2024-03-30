import TestPackage.InitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  {

    @BeforeMethod
    public void setUp(){
        InitDriver.driverinit();
        WebDriverManager.chromedriver().setup();

    }

//    @AfterMethod
//    public void close(){
//        WebDriver driver = InitDriver.driver;
//        driver.quit();
//    }
    public void waitforme(){
        try{
            Thread.sleep(1000);
        }
        catch (Exception e) {
        }
    }
}

