import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {

    SelenideElement laptopsAndCompCategory = $(By.xpath("//a[@class='menu-categories__link']"));
}
