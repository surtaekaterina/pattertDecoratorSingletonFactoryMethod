package pageobject_model.driver;

import org.openqa.selenium.WebDriver;

public class ChromeBrowser extends Browser {

    public ChromeBrowser(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebDriver getInstance() {
        return driver;
    }
}
