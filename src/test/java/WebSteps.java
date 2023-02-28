import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {
     @Step("ОТкрываем главную страницу")
    public void openURL(){
         open("https://github.com");
    }
    @Step("Ищем ропозиторий {repo}")
    public void searhRepository(String repo){
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repo);
        $(".header-search-input").submit();
     }
    @Step("Переходим по сылки репозиротория {repo}")
    public void clickOnRepositiry (String repo){
        $(By.linkText(repo)).click();

    }
    @Step("Кликаем на таб Issues ")
    public void clickOnIssues(){
        $("#issues-tab").click();

    }

    @Step("ПРоверяем, что существует Issue с номером {number}")
    public void ShoulSeeIssuesWithNumber(String number){
        $(withText(number)).should(Condition.visible);
        attachScreenshot();

    }
    @Attachment(value = "Мой любимый скриншот", type = "image/png", fileExtension = "png")
    public byte[] attachScreenshot(){
         return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);

    }
}
