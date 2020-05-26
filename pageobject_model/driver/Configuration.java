package pageobject_model.driver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

//конфигурация отличное место для фэктори метода
public class Configuration {
    private static Browser browser;

    public static Browser getBrowser(String browserName) throws Exception {
        if (null == browser) {
            switch (browserName) {

                case "firefox": {
                    DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
                    browser = new FireFoxBrowser(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities));
                    break;
                    //return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
                }
                case "chrome": {
                    DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
                    browser = new ChromeBrowser(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities));
                    //return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
                    break;
                }
            }

        }
        return browser;
    }

    public static void quit(){
        browser.quit();
        browser = null;
    }


}
