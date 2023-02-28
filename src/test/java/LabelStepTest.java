import com.beust.ah.A;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LabelStepTest {

    @Test
    @Owner("Karabetskaia")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Задачи в репозитории")
    @DisplayName("Мой Ллюбимый тест")
    @Story("Просмотр созданных задач в репозитории")//пользовательский сценарий
    @Link(value = "Тестинг", url = "https://github.com")
    public void testAnnotated(){

    }
    @Test
    public void testCode(){
        Allure.label("owner", "Karabetskaiai");
        Allure.label("severity", SeverityLevel.CRITICAL.value());
        Allure.feature("Задачи в репозитории");
        Allure.story("Просмотр созданных задач в репозитории");
        Allure.link("Тестинг","https://github.com");
    }
}
