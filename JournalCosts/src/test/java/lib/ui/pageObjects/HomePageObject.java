package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class HomePageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Journal costs",
            EXPENSES_BLOCK_TITLE = "Expenses",
            INCOMES_BLOCK_TITLE = "Incomes",
            BALANCE_BLOCK_TITLE = "Balance",
            ALL_EXPENSES_BLOCK_TITLE = "All expenses",
            ALL_INCOMES_BLOCK_TITLE = "All incomes",
            DEFAULT_CURRENCY = "USD",
            DEFAULT_SUM = "0.00";

    protected static String
            MAIN_TITLE_LOCATOR,
            TITLE_EXPENSE_LOCATOR,
            TITLE_INCOMES_LOCATOR,
            TITLE_BALANCE_LOCATOR,
            TITLE_ALL_EXPENSES_LOCATOR,
            TITLE_ALL_INCOMES_LOCATOR,
            ADD_EXPENSE_BUTTON_LOCATOR,
            ADD_INCOMES_BUTTON_LOCATOR,
            VIEW_BALANCE_BUTTON_LOCATOR,
            TODAY_EXPENSE_SUM_LOCATOR,
            WEEK_EXPENSE_SUM_LOCATOR,
            MONTH_EXPENSE_SUM_LOCATOR,
            EXPENCE_CURRENCY_VALUE_LOCATOR,
            INCOME_CURRENCY_VALUE_LOCATOR,
            BALANCE_CURRENCY_VALUE_LOCATOR,
            MONTH_INCOMES_SUM_LOCATOR,
            BALANCE_SUM_LOCATOR,
            ALL_EXPENSES_BUTTON_LOCATOR,
            ALL_INCOMES_BUTTON_LOCATOR,
            MENU_BUTTON_LOCATOR;

    public HomePageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getExpenseTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_EXPENSE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getIncomesTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_INCOMES_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getBalanceTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_BALANCE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getAllExpensesTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_ALL_EXPENSES_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getAllIncomesTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_ALL_INCOMES_LOCATOR);
        return title_element.getAttribute("text");
    }

    public void clickAddExpenseButton()
    {
        this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        this.waitForElementAndClick(ADD_EXPENSE_BUTTON_LOCATOR, "Cannot find add expense button by locator " + ADD_EXPENSE_BUTTON_LOCATOR);
    }

    public void clickAddIncomesButton()
    {
        this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        this.waitForElementAndClick(ADD_INCOMES_BUTTON_LOCATOR, "Cannot find add incomes button by locator " + ADD_INCOMES_BUTTON_LOCATOR);
    }

    public void clickViewBalanceButton()
    {
        this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        this.waitForElementAndClick(VIEW_BALANCE_BUTTON_LOCATOR, "Cannot find view balance button by locator " + VIEW_BALANCE_BUTTON_LOCATOR);
    }

    public void clickAllExpenseButton()
    {
        this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        this.waitForElementAndClick(ALL_EXPENSES_BUTTON_LOCATOR, "Cannot find All expenses button by locator " + ALL_EXPENSES_BUTTON_LOCATOR);
    }

    public void clickAllIncomesButton()
    {
        this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        this.waitForElementAndClick(ALL_INCOMES_BUTTON_LOCATOR, "Cannot find All incomes button by locator " + ALL_INCOMES_BUTTON_LOCATOR);
    }

    public void clickMenuButton()
    {
        this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        this.waitForElementAndClick(MENU_BUTTON_LOCATOR, "Cannot find All incomes button by locator " + MENU_BUTTON_LOCATOR);
    }

    public String getTodayExpenseSum()
    {
        WebElement title_element = this.waitForElementPresent(TODAY_EXPENSE_SUM_LOCATOR,"Cannot find Today expense sum by locator " + TODAY_EXPENSE_SUM_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getWeekExpenseSum()
    {
        WebElement title_element = this.waitForElementPresent(WEEK_EXPENSE_SUM_LOCATOR,"Cannot find Week expense sum by locator " + WEEK_EXPENSE_SUM_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getMonthExpenseSum()
    {
        WebElement title_element = this.waitForElementPresent(MONTH_EXPENSE_SUM_LOCATOR,"Cannot find Month expense sum by locator " + MONTH_EXPENSE_SUM_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getExpensesCurrencyValue()
    {
        WebElement title_element = this.waitForElementPresent(EXPENCE_CURRENCY_VALUE_LOCATOR,"Cannot find Expense Currency field by locator " + EXPENCE_CURRENCY_VALUE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getIncomesCurrencyValue()
    {
        WebElement title_element = this.waitForElementPresent(INCOME_CURRENCY_VALUE_LOCATOR,"Cannot find Income Currency field by locator " + INCOME_CURRENCY_VALUE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getBalanceCurrencyValue()
    {
        WebElement title_element = this.waitForElementPresent(BALANCE_CURRENCY_VALUE_LOCATOR,"Cannot find Balance Currency field by locator " + BALANCE_CURRENCY_VALUE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getMonthIncomesSum()
    {
        WebElement title_element = this.waitForElementPresent(MONTH_INCOMES_SUM_LOCATOR,"Cannot find Month incomes sum by locator " + MONTH_INCOMES_SUM_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getBalanceSum()
    {
        WebElement title_element = this.waitForElementPresent(BALANCE_SUM_LOCATOR,"Cannot find Balance sum by locator " + BALANCE_SUM_LOCATOR);
        return title_element.getAttribute("text");
    }

    public void swipeMenuToOpen()
    {
        this.swipeRight();
    }
}
