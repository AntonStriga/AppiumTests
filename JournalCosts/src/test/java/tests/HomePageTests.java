package tests;

import lib.CoreTestCase;
import lib.ui.pageObjects.BalancePageObject;
import lib.ui.pageObjects.ExpensesPageObject;
import lib.ui.pageObjects.HomePageObject;
import lib.ui.pageObjects.IncomesPageObject;
import lib.ui.factories.BalancePageObjectFactory;
import lib.ui.factories.ExpensesPageObjectFactory;
import lib.ui.factories.HomePageObjectFactory;
import lib.ui.factories.IncomesPageObjectFactory;
import org.testng.annotations.Test;

import javax.xml.bind.ValidationException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends CoreTestCase
{
    private static String
        MAIN_TITLE = "Journal costs",
        EXPENSES_BLOCK_TITLE = "Expenses",
        EXPENSES_PAGE_TITLE = "Expense",
        INCOMES_BLOCK_TITLE = "Incomes",
        INCOMES_PAGE_TITLE = "Income",
        BALANCE_BLOCK_TITLE = "Balance",
        BALANCE_PAGE_TITLE = "Year balance",
        ALL_EXPENSES_BLOCK_TITLE = "All expenses",
        ALL_INCOMES_BLOCK_TITLE = "All incomes",
        DEFAULT_CURRENCY = "USD",
        DEFAULT_SUM = "0.00";

    @Test
    public void mainTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getTitle();

        assertEquals(
                title_element,
                MAIN_TITLE,
                "Title of the Home page is incorrect."
        );
    }

    @Test
    public void expensesBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getExpenseTitle();

        assertEquals(
                title_element,
                EXPENSES_BLOCK_TITLE,
                "Expenses block title is incorrect."
        );
    }

    @Test
    public void incomesBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getIncomesTitle();

        assertEquals(
                title_element,
                INCOMES_BLOCK_TITLE,
                "Incomes block title is incorrect."
        );
    }

    @Test
    public void balanceBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getBalanceTitle();

        assertEquals(
                title_element,
                BALANCE_BLOCK_TITLE,
                "Balance block title is incorrect."
        );
    }

    @Test
    public void allExpensesBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getAllExpensesTitle();

        assertEquals(
                title_element,
                ALL_EXPENSES_BLOCK_TITLE,
                "All expenses block title is incorrect."
        );
    }

    @Test
    public void allIncomesBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getAllIncomesTitle();

        assertEquals(
                title_element,
                ALL_INCOMES_BLOCK_TITLE,
                "All expenses block title is incorrect."
        );
    }

    @Test
    public void defaultCurrencyVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String default_currency_value;
        boolean all_default_currencies_correct = true;

        try {
            default_currency_value = HomePageObject.getExpensesCurrencyValue();
            if (!default_currency_value.equals(DEFAULT_CURRENCY)) {
                throw new ValidationException("Default Expenses currency is not " + DEFAULT_CURRENCY + ".");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            all_default_currencies_correct = false;
        }

        try {
            default_currency_value = HomePageObject.getIncomesCurrencyValue();
            if (!default_currency_value.equals(DEFAULT_CURRENCY)) {
                throw new ValidationException("Default Incomes currency is not " + DEFAULT_CURRENCY + ".");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            all_default_currencies_correct = false;
        }

        try {
            default_currency_value = HomePageObject.getBalanceCurrencyValue();
            if (!default_currency_value.equals(DEFAULT_CURRENCY)) {
                throw new ValidationException("Default Balance currency is not " + DEFAULT_CURRENCY + ".");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            all_default_currencies_correct = false;
        }

        assertTrue(
                all_default_currencies_correct,
                "Default values of currency are not correct."
        );
    }

    @Test
    public void todayExpenseDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String today_expense_sum = HomePageObject.getTodayExpenseSum();

        assertEquals(
                today_expense_sum,
                DEFAULT_SUM,
                "Default value of Today expense sum is incorrect."
        );
    }

    @Test
    public void weekExpenseDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getWeekExpenseSum();

        assertEquals(
                week_expense_sum,
                DEFAULT_SUM,
                "Default value of Week expense sum is incorrect."
        );
    }

    @Test
    public void monthExpenseDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getMonthExpenseSum();

        assertEquals(
                week_expense_sum,
                DEFAULT_SUM,
                "Default value of Month expense sum is incorrect."
        );
    }

    @Test
    public void monthIncomesDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getMonthIncomesSum();

        assertEquals(
                week_expense_sum,
                DEFAULT_SUM,
                "Default value of Month incomes sum is incorrect."
        );
    }

    @Test
    public void balanceDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getBalanceSum();

        assertEquals(
                week_expense_sum,
                DEFAULT_SUM,
                "Default value of Balance sum is incorrect."
        );
    }

    @Test
    public void openExpesePageByAddButton()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                title_element,
                EXPENSES_PAGE_TITLE,
                "Opened page is not 'Expense'"
        );
    }

    @Test
    public void openIncomePageByAddButton()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddIncomesButton();

        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        String title_element = IncomesPageObject.getTitle();

        assertEquals(
                title_element,
                INCOMES_PAGE_TITLE,
                "Opened page is not 'Income'"
        );
    }

    @Test
    public void openBalancePageByViewBalanceButton()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickViewBalanceButton();

        BalancePageObject BalancePageObject = BalancePageObjectFactory.get(driver);
        String title_element = BalancePageObject.getTitle();

        assertEquals(
                title_element,
                BALANCE_PAGE_TITLE,
                "Opened page is not 'Year balance'"
        );
    }
}
