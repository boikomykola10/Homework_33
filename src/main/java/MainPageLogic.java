import com.codeborne.selenide.Condition;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MainPageLogic extends  MainPageElements {

    public CategoryPageLogic clickOnCategoryJS() {
        laptopsAndCompCategory.shouldBe(Condition.visible);
        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click()", laptopsAndCompCategory);
        return page(CategoryPageLogic.class);
    }
}
