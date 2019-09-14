package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class HomePageObject extends MainPageObject
{
    protected static String
        TITLE,
        TITLE_EXPENSE,
        TITLE_INCOMES,
        TITLE_BALANCE,
        TITLE_ALL_EXPENSES,
        TITLE_ALL_INCOMES,
        ADD_EXPENSE_BUTTON,
        ADD_INCOMES_BUTTON,
        VIEW_BALANCE_BUTTON,
        TODAY_EXPENSE_SUM,
        WEEK_EXPENSE_SUM,
        MONTH_EXPENSE_SUM,
        EXPENCE_CURRENCY_VALUE,
        INCOME_CURRENCY_VALUE,
        BALANCE_CURRENCY_VALUE,
        MONTH_INCOMES_SUM,
        BALANCE_SUM;

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

    public String getAllExpensesTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_ALL_EXPENSES);
        return title_element.getAttribute("text");
    }

    public String getAllIncomesTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE_ALL_INCOMES);
        return title_element.getAttribute("text");
    }

    public void clickAddExpenseButton()
    {
        this.waitForTitleElement(TITLE);
        this.waitForElementAndClick(ADD_EXPENSE_BUTTON, "Cannot find add expense button by locator " + ADD_EXPENSE_BUTTON);
    }

    public void clickAddIncomesButton()
    {
        this.waitForTitleElement(TITLE);
        this.waitForElementAndClick(ADD_INCOMES_BUTTON, "Cannot find add incomes button by locator " + ADD_INCOMES_BUTTON);
    }

    public void clickViewBalanceButton()
    {
        this.waitForTitleElement(TITLE);
        this.waitForElementAndClick(VIEW_BALANCE_BUTTON, "Cannot find view balance button by locator " + VIEW_BALANCE_BUTTON);
    }

    public String getTodayExpenseSum() {
        WebElement title_element = this.waitForElementPresent(TODAY_EXPENSE_SUM,"Cannot find Today expense sum by locator " + TODAY_EXPENSE_SUM);
        return title_element.getAttribute("text");
    }

    public String getWeekExpenseSum() {
        WebElement title_element = this.waitForElementPresent(WEEK_EXPENSE_SUM,"Cannot find Week expense sum by locator " + WEEK_EXPENSE_SUM);
        return title_element.getAttribute("text");
    }

    public String getMonthExpenseSum() {
        WebElement title_element = this.waitForElementPresent(MONTH_EXPENSE_SUM,"Cannot find Month expense sum by locator " + MONTH_EXPENSE_SUM);
        return title_element.getAttribute("text");
    }

    public String getExpensesCurrencyValue() {
        WebElement title_element = this.waitForElementPresent(EXPENCE_CURRENCY_VALUE,"Cannot find Expense Currency field by locator " + EXPENCE_CURRENCY_VALUE);
        return title_element.getAttribute("text");
    }

    public String getIncomesCurrencyValue() {
        WebElement title_element = this.waitForElementPresent(INCOME_CURRENCY_VALUE,"Cannot find Income Currency field by locator " + INCOME_CURRENCY_VALUE);
        return title_element.getAttribute("text");
    }

    public String getBalanceCurrencyValue() {
        WebElement title_element = this.waitForElementPresent(BALANCE_CURRENCY_VALUE,"Cannot find Balance Currency field by locator " + BALANCE_CURRENCY_VALUE);
        return title_element.getAttribute("text");
    }

    public String getMonthIncomesSum() {
        WebElement title_element = this.waitForElementPresent(MONTH_INCOMES_SUM,"Cannot find Month incomes sum by locator " + MONTH_INCOMES_SUM);
        return title_element.getAttribute("text");
    }

    public String getBalanceSum() {
        WebElement title_element = this.waitForElementPresent(BALANCE_SUM,"Cannot find Balance sum by locator " + BALANCE_SUM);
        return title_element.getAttribute("text");
    }


}
