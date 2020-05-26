package pageobject_model.test;

import org.testng.annotations.*;
import pageobject_model.driver.Browser;
import pageobject_model.driver.Configuration;

public class CommonConditions {

    protected Browser browser;


    @Parameters({"browserName"})
    @BeforeClass(alwaysRun = true)
    public void browserSetup(@Optional String browserName) throws Exception {
        browser = Configuration.getBrowser(browserName);
    }


    @AfterSuite(alwaysRun = true)
    public void browserTearDown() {
        Configuration.quit();


    }
}
