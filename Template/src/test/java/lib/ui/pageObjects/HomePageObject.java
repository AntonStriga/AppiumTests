package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class HomePageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Journal costs";

    protected static String
            MAIN_TITLE_LOCATOR,
            ADD_EXPENSE_BUTTON_LOCATOR;

    public HomePageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public void clickAddExpenseButton()
    {
        this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        this.waitForElementAndClick(ADD_EXPENSE_BUTTON_LOCATOR, "Cannot find add expense button by locator " + ADD_EXPENSE_BUTTON_LOCATOR);
    }

    public void swipeMenuToOpen()
    {
        this.swipeRight();
    }
}
