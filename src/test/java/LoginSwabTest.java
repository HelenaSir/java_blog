import TestPackage.LoginSwabs;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import static TestPackage.InitDriver.driver;

public class LoginSwabTest extends BaseTest {
    @Test
    @Description("Login page without login pas")

    public void login () {
       LoginSwabs login = new LoginSwabs();
        waitforme();
        login.clickLoginButton();
    }
    @Test
    @Description("Login page with login ")

    public void loginwithLogin() {
        LoginSwabs login = new LoginSwabs();
        waitforme();
        login.enterUsername();
        login.clickLoginButton();
    }

    @Test
    @Description("Login page with pass ")

    public void loginwithPass() {
        LoginSwabs login = new LoginSwabs();
        waitforme();
        login.enterPassword();
        login.clickLoginButton();
    }

    @Test
    @Description("Login with correct login and password ")
    public void logiWithCorrectCredentials() {
        LoginSwabs login = new LoginSwabs();

        login.enterUsername();
        login.enterPassword();
        login.clickLoginButton();
        login.checkHeaderTtle();

    }

    @Test
    public void loginWithSecondLogin() {
        LoginSwabs login = new LoginSwabs();

        login.enterUsername();
        login.enterPassword();
        login.clickLoginButton();
        waitforme();
        driver.navigate().back();
    }
}
