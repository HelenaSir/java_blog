package TestPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LoginSwabs extends BasePage {

    @FindBy(id = "login_credentials")
    private List<WebElement> loginElements;
    public List<String> logins;

    @FindBy(id = "user-name")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]")
    public List<WebElement> pasElements;
    public List<String> passwords;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    public WebElement loginButton;


    public void getLoginsList() {
        logins = new ArrayList<>();
        String usernamesText = loginElements.get(0).getText();
        String[] usernames = usernamesText.split("\n");
        for (String username : usernames) {
            if (!username.startsWith("Accepted usernames")) {
                logins.add(username);
            }
        }
        System.out.println(logins);
    }

    public void getPasswordlist() {
        passwords = new ArrayList<>();
        String passwordsText = pasElements.get(0).getText();
        String[] passwordsArray = passwordsText.split("\n");
        for (String password : passwordsArray) {
            passwords.add(password);

        }
        System.out.println(passwords);
    }


    public void enterUsername() {
        getLoginsList();
        usernameInput.click();
        usernameInput.sendKeys(logins.get(0));
    }

    public void enterPassword() {
        getPasswordlist();
        if (!passwords.isEmpty()) {
            passwordInput.click();
            passwordInput.sendKeys(passwords.get(1));
        } else {
            System.out.println("No passwords found.");
        }
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void checkHeaderTtle() {
        String  ActualTitle = driver.getTitle();
        String  ExpectedTitle = "Swag Labs";

        if (ActualTitle.equals(ExpectedTitle)){

            System.out.println("Passed");

        }else{
            System.out.println("Fail");
        }
    }

}