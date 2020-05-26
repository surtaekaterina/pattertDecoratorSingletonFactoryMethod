package pageobject_model.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pageobject_model.driver.Browser;

public class SeleniumBeginnersGuideChapterFourPage extends AbstractPage {


    @FindBy(xpath = "//div[@class = 'secondajax']")
    private WebElement mouseOverThisElement;

    @FindBy(id = "dateInput")
    private WebElement dateInputElement;

    @FindBy(xpath = "//input[@type = 'text']")
    private WebElement textFieldElement;


    protected SeleniumBeginnersGuideChapterFourPage(Browser browser) {
        super(browser);
    }

    protected AbstractPage openPage() {
        return null;
    }

    public SeleniumBeginnersGuideChapterFourPage hoverMouseToElement() {
        new Actions(browser.getInstance()).moveToElement(mouseOverThisElement).build().perform();
        return this;

    }

    public SeleniumBeginnersGuideChapterFourPage closeMouseOverThisAlert() {
        browser.getInstance().switchTo().alert().accept();
        return this;

    }

    public SeleniumBeginnersGuideChapterFourPage inputTextToTheElement(String text) {
        new Actions(browser.getInstance()).sendKeys(dateInputElement, text).build().perform();
        return this;
    }

    public String getTextFromTheElement() {
        return browser.getTextFromTheElement("dateInput");
/*        new WebDriverWait(browser.getInstance(), 5).until(new ExpectedCondition<Boolean>() {
        public Boolean apply(WebDriver d) {
            return d.findElement(By.id("dateInput")).getText().length() != 0;
        }
    });
        return dateInputElement.getText();*/
    }
}
