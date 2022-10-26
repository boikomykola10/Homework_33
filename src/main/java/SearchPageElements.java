import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageElements {

    SelenideElement firstProductBtn = $(
            By.xpath("//button[@class='buy-button goods-tile__buy-button ng-star-inserted']"));

    SelenideElement firstProductTitle = $(By.xpath("//span[@class='goods-tile__title']"));

    SelenideElement checkNumberInCart = $(
            By.xpath("//span[@class='counter counter--green ng-star-inserted']"));

    SelenideElement cartBtn = $(
            By.xpath("//button[@class='header__button ng-star-inserted header__button--active']"));

    SelenideElement titleOfProductInCart = $(By.xpath("//a[@class='cart-product__title']"));

}
