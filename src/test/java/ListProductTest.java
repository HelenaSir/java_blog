import TestPackage.ListMenu;
import TestPackage.ListProduct;
import org.testng.annotations.Test;

public class ListProductTest  extends BaseTest{

    @Test
    public void productlistcheck(){
        System.out.println("Անշարժ գույք>Տարածաշրջան Էրեբունի>Գին-1000-50000>Տարադրամ-AMD>1.\n" +
                "Առաջին արդյունքի գնի և տարածաշրջանի ստուգում 2.\n" +
                "Առաջին 5 արդյունքների անունների տպում(աշխատում ենք list-ով\n");
        ListMenu list = new ListMenu();
        ListProduct product = new ListProduct();

        list.ChooseApprtment();
        list.clikcOnRegion();
        list.clikcOnChoosenRegion();
        list.clikcOnChooseButton();
        waitforme();
        list.enterPriceRange();
        list.chooseCurrencyField();
        list.chooseCurrency();
        product.getSearchResult();

    }
}
