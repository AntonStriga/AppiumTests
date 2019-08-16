package lib.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class HomePageObject extends MainPageObject
{
    protected static String
        TITLE,
        TITLE_EXPENSE,
        TITLE_INCOMES,
        TITLE_BALANCE,
        ADD_EXPENSE_BUTTON;

    public HomePageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE);
        return title_element.getAttribute("text");
    }

    public String getExpenseTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_EXPENSE);
        return title_element.getAttribute("text");
    }

    public String getIncomesTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_INCOMES);
        return title_element.getAttribute("text");
    }

    public String getBalanceTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_BALANCE);
        return title_element.getAttribute("text");
    }

    public void clickAddExpenseButton()
    {
        this.waitForTitleElement(TITLE);
        this.waitForElementAndClick(ADD_EXPENSE_BUTTON, "Cannot find add expense button by locator " + ADD_EXPENSE_BUTTON);
    }
}
