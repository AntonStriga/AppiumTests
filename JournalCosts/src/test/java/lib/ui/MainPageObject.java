package lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Pattern;

public class MainPageObject
{
    protected RemoteWebDriver driver;
    private WebDriverWait wait;

    public MainPageObject(RemoteWebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, 60);
    }

    public WebElement waitForElementPresent(String locator, String error_message)
    {
        By by = this.generateLocatorByString(locator);
        wait.withMessage(error_message + "\n");
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitForElementAndClick(String locator, String error_message)
    {
        WebElement element = this.waitForElementPresent(locator, error_message);
        element.click();
    }

    public WebElement waitForTitleElement(String locator)
    {
        return this.waitForElementPresent(locator, "Cannot find title element by locator "+ locator);
    }

    private By generateLocatorByString(String locator_with_type)
    {
        String [] exploded_locator = locator_with_type.split(Pattern.quote(":"), 2);
        String by_type = exploded_locator[0];
        String locator = exploded_locator[1];

        if (by_type.equals("xpath")) {
            return By.xpath(locator);
        } else if (by_type.equals("id")) {
            return By.id(locator);
        } else {
            throw new IllegalArgumentException("Cannot detect type of locator. Locator: " + locator_with_type);
        }
    }
}
