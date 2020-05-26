package pageobject_model.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobject_model.driver.Browser;

public class SeleniumBeginnersGuideHomePage extends AbstractPage {

    private static final String HOMEPAGE_URL = "http://book.theautomatedtester.co.uk";

    @FindBy(xpath = "//a[@href='/chapter1']")
    private WebElement chapterOneLink;

    @FindBy(xpath = "//a[@href='/chapter4']")
    private WebElement chapterFourLink;



    public SeleniumBeginnersGuideHomePage(Browser browser) {
        super(browser);

    }

    public SeleniumBeginnersGuideHomePage openPage() {
        browser.openPage(HOMEPAGE_URL);
        return this;

    }

    public SeleniumBeginnersGuideChapterOnePage goToChapterOnePage() throws InterruptedException {
        chapterOneLink.click();
        return new SeleniumBeginnersGuideChapterOnePage(browser);
    }

    public SeleniumBeginnersGuideChapterFourPage goToChapterFourPage() {
        chapterFourLink.click();
        return new SeleniumBeginnersGuideChapterFourPage(browser);
    }


}
