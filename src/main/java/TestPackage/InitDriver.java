package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitDriver {
    public static WebDriver driver;
    public static void driverinit(){
         String env = "https://www.saucedemo.com/";
        // String env = "https://demoqa.com/";

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(env);

    }
}
