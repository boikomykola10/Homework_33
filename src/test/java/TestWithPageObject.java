import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestWithPageObject {
    private String titleFirstProductText;


    @BeforeMethod
    public void before() {
        Configuration.browserSize = "1200x860";
        Configuration.timeout = 5000;
        open("https://rozetka.com.ua/");
    }

    @Test
    public void testSelenide(){
         titleFirstProductText = new MainPageLogic().clickOnCategoryJS()
                 .clickCategory(new CategoryPageLogic().laptopsCategory)
                 .getTitleOfFirstProduct();
         new SearchPageLogic().addProductToCart()
                 .checkNumberInBasket()
                 .openCart()
                 .checkTitleInCart(titleFirstProductText);
    }
}
