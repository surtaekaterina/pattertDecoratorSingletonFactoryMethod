package pageobject_model.test;

import org.testng.annotations.Test;
import pageobject_model.page.SeleniumBeginnersGuideHomePage;

public class MouseOverThisAlertTest extends CommonConditions {


    @Test(description = "Jira ticket Task8")
    public void closeMouseOverThisAlert() {
        new SeleniumBeginnersGuideHomePage(browser).
                openPage()
                .goToChapterFourPage()
                .hoverMouseToElement()
                .closeMouseOverThisAlert();

    }

}
