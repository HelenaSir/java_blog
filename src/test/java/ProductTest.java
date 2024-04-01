import TestPackage.LoginSwabs;
import TestPackage.ProductsSwab;
import jdk.jfr.Description;
import org.testng.annotations.Test;


public class ProductTest extends BaseTest{

    @Test
    @Description("Check Basket")
    public void watchBasket()  {
        ProductsSwab product = new ProductsSwab();
        LoginSwabs login = new LoginSwabs();

        login.enterUsername();
        login.enterPassword();
        login.clickLoginButton();
        product.watchBasket();
    }

}
