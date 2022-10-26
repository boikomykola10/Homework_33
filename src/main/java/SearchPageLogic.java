import com.codeborne.selenide.Condition;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;

public class SearchPageLogic extends SearchPageElements {

    public String getTitleOfFirstProduct() {
        String titleFirstProductText = firstProductTitle.text();
        return titleFirstProductText;
    }

    public SearchPageLogic addProductToCart(){
        firstProductBtn.shouldBe(Condition.visible).click();
        return this;
    }

    public SearchPageLogic checkNumberInBasket() {
        checkNumberInCart.shouldHave(text("1"));
        return this;
    }
    public SearchPageLogic openCart(){
        cartBtn.click();
        return this;
    }
    public String getTitleProductInBasket() {
        String titleBasketProductText = titleOfProductInCart.text();
        return titleBasketProductText;
    }
    public SearchPageLogic checkTitleInCart(String expectedTitleText) {
        String titleBasketProductText =  getTitleProductInBasket();
        Assert.assertEquals(titleBasketProductText, expectedTitleText);
        return this;
    }

}
