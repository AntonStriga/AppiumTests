package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class BalancePageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Year balance";

    protected static String
            MAIN_TITLE_LOCATOR;

    public BalancePageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }
}
