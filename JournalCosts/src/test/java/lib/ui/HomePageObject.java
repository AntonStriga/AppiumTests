package lib.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class HomePageObject extends MainPageObject
{
    protected static String
        TITLE,
        TITLE_EXPENSE,
        TITLE_INCOMES,
        TITLE_BALANCE;

    public HomePageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public WebElement waitForTitleElement()
    {
        return this.waitForElementPresent(TITLE, "Cannot find title.");
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement();
        return title_element.getAttribute("text");
    }

    public String getExpenseTitle()
    {
        this.waitForTitleElement();
        WebElement title_element = this.waitForElementPresent(TITLE_EXPENSE, "Cannot find Expense block title.");
        return title_element.getAttribute("text");
    }

    public String getIncomesTitle()
    {
        this.waitForTitleElement();
        WebElement title_element = this.waitForElementPresent(TITLE_INCOMES, "Cannot find Incomes block title.");
        return title_element.getAttribute("text");
    }

    public String getBalanceTitle()
    {
        this.waitForTitleElement();
        WebElement title_element = this.waitForElementPresent(TITLE_BALANCE, "Cannot find Balance block title.");
        return title_element.getAttribute("text");
    }
}
