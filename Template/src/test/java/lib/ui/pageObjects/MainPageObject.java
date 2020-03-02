package lib.ui.pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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

    public void waitForElementAndSendKeys(String locator, String value, String error_message)
    {
        WebElement element = this.waitForElementPresent(locator, error_message);
        element.sendKeys(value);
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

    public void swipe(int start_x, int start_y, int end_x, int end_y)
    {
        TouchAction action = new TouchAction((AppiumDriver) driver);
        action
                .press (PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(250)))
                .moveTo(PointOption.point(end_x, end_y))
                .release()
                .perform();
    }

    public void swipeRight()
    {
        Dimension size = driver.manage().window().getSize();
        int start_x = (int) (size.width * 0.05);
        int y = size.height / 2;
        int end_x = (int) (size.width * 0.95);
        this.swipe(start_x, y, end_x, y);
    }

    public void swipeLeft()
    {
        Dimension size = driver.manage().window().getSize();
        int start_x = (int) (size.width * 0.95);
        int y = size.height / 2;
        int end_x = (int) (size.width * 0.05);
        this.swipe(start_x, y, end_x, y);
    }

    public void swipeUp()
    {
        Dimension size = driver.manage().window().getSize();
        int x = size.width / 2;
        int start_y = (int) (size.height * 0.05);
        int end_y = (int) (size.height * 0.95);
        this.swipe(x, start_y, x, end_y);
    }

    public void swipeDown()
    {
        Dimension size = driver.manage().window().getSize();
        int x = size.width / 2;
        int start_y = (int) (size.height * 0.95);
        int end_y = (int) (size.height * 0.05);
        this.swipe(x, start_y, x, end_y);
    }

    protected void tapByLocation(int x, int y)
    {
        TouchAction action = new TouchAction((AppiumDriver) driver);
        action
                .press(PointOption.point(x, y))
                .release()
                .perform();
    }
}
