package pageobject_model.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//Browser это отличный декоратор для вебдрайвера
public abstract class Browser {

    public static WebDriver driver;
    public WebDriverWait webDriverWait;

    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    public abstract WebDriver getInstance();

    public String getTextFromTheElement(String elementId) {
        webDriverWait = new WebDriverWait(driver, 10);
        WebElement element = driver.findElement(By.id(elementId));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
        return element.getText().trim();
    }

    public void openPage(String url) {
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.get(url);

    }

    public void quit() {
        driver.quit();
        driver = null;

    }
}
