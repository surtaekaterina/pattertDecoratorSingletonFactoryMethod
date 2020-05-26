package pageobject_model.driver;

import org.openqa.selenium.WebDriver;

public class FireFoxBrowser extends Browser {
    public FireFoxBrowser(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebDriver getInstance() {
        return driver;
    }
}
