package pageobject_model.page;

import org.openqa.selenium.support.PageFactory;
import pageobject_model.driver.Browser;

public abstract class AbstractPage {

    protected Browser browser;

    protected abstract AbstractPage openPage();

    protected AbstractPage(Browser browser) {
        this.browser = browser;
        PageFactory.initElements(browser.getInstance(), this);
    }
}
