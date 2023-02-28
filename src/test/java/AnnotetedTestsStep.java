import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class AnnotetedTestsStep {
    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final String ISSUE_NUMBER = "#90";
    @Test
    public void testGithubIssues(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps speps = new WebSteps();
        speps.openURL();
        speps.searhRepository(REPOSITORY);
        speps.clickOnRepositiry(REPOSITORY);
        speps.clickOnIssues();
        speps.ShoulSeeIssuesWithNumber(ISSUE_NUMBER);
    }

}
