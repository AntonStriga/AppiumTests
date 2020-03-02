package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ExpensesPageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Expense";

    protected static String
            MAIN_TITLE_LOCATOR;

    public ExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    /* TEMPLATE METHODS */

    /* TEMPLATE METHODS */

    public String getTitle()
    {
        WebElement element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return element.getAttribute("text");
    }
}
