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
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class HomePageTests extends CoreTestCase
{
    @Test (priority = 5)
    public void mainTitleVerification()
    {
        System.out.println("test-1, priority = 5");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getTitle();

        assertEquals(
                title_element,
                HomePageObject.MAIN_TITLE,
                "Title of the Home page is incorrect."
        );
    }

    @Test (priority = 5)
    public void expensesBlockTitleVerification()
    {
        System.out.println("test-2, priority = 5");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getExpenseTitle();

        assertEquals(
                title_element,
                HomePageObject.EXPENSES_BLOCK_TITLE,
                "Expenses block title is incorrect."
        );
    }

    @Test (priority = 4)
    public void incomesBlockTitleVerification()
    {
        System.out.println("test-3, priority = 4");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getIncomesTitle();

        assertEquals(
                title_element,
                HomePageObject.INCOMES_BLOCK_TITLE,
                "Incomes block title is incorrect."
        );
    }

    @Test (priority = 6)
    public void balanceBlockTitleVerification()
    {
        System.out.println("test-5, priority = 6");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getBalanceTitle();

        assertEquals(
                title_element,
                HomePageObject.BALANCE_BLOCK_TITLE,
                "Balance block title is incorrect."
        );
    }

    @Test (priority = 5)
    public void allExpensesBlockTitleVerification()
    {
        System.out.println("test-7, priority = 5");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getAllExpensesTitle();

        assertEquals(
                title_element,
                HomePageObject.ALL_EXPENSES_BLOCK_TITLE,
                "All expenses block title is incorrect."
        );
    }

    @Test (priority = 4)
    public void allIncomesBlockTitleVerification()
    {
        System.out.println("test-8, priority = 4");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getAllIncomesTitle();

        assertEquals(
                title_element,
                HomePageObject.ALL_INCOMES_BLOCK_TITLE,
                "All expenses block title is incorrect."
        );
    }

    @Test (priority = 2)
    public void defaultCurrencyVerification()
    {
        System.out.println("test-9, priority = 2");
        SoftAssert verification = new SoftAssert();
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String currency_value = HomePageObject.getExpensesCurrencyValue();
        verification.assertEquals(
                currency_value,
                HomePageObject.DEFAULT_CURRENCY,
                "Default Expenses currency is incorrect."
        );
        currency_value = HomePageObject.getIncomesCurrencyValue();
        verification.assertEquals(
                currency_value,
                HomePageObject.DEFAULT_CURRENCY,
                "Default Incomes currency is incorrect."
        );
        currency_value = HomePageObject.getBalanceCurrencyValue();
        verification.assertEquals(
                currency_value,
                HomePageObject.DEFAULT_CURRENCY,
                "Default Balance currency is incorrect."
        );
        verification.assertAll();
    }

    @Test ()
    public void todayExpenseDefaultSumVerification()
    {
        System.out.println("test-10, priority = ---");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String today_expense_sum = HomePageObject.getTodayExpenseSum();

        assertEquals(
                today_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Today expense sum is incorrect."
        );
    }

    @Test (priority = 1)
    public void weekExpenseDefaultSumVerification()
    {
        System.out.println("test-11, priority = 1");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getWeekExpenseSum();

        assertEquals(
                week_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Week expense sum is incorrect."
        );
    }

    @Test (priority = 1)
    public void monthExpenseDefaultSumVerification()
    {
        System.out.println("test-12, priority = 1");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getMonthExpenseSum();

        assertEquals(
                week_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Month expense sum is incorrect."
        );
    }

    @Test (priority = 1)
    public void monthIncomesDefaultSumVerification()
    {
        System.out.println("test-13, priority = 1");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getMonthIncomesSum();

        assertEquals(
                week_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Month incomes sum is incorrect."
        );
    }

    @Test (priority = 3)
    public void balanceDefaultSumVerification()
    {
        System.out.println("test-14, priority = 3");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getBalanceSum();

        assertEquals(
                week_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Balance sum is incorrect."
        );
    }

    @Test (priority = 0)
    public void openExpesePageByAddButton()
    {
        System.out.println("test-15, priority = 0");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.MAIN_TITLE,
                "Opened page is not 'Expense'"
        );
    }

    @Test (priority = 0)
    public void openIncomePageByAddButton()
    {
        System.out.println("test-16, priority = 0");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddIncomesButton();

        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        String title_element = IncomesPageObject.getTitle();

        assertEquals(
                title_element,
                IncomesPageObject.MAIN_TITLE,
                "Opened page is not 'Income'"
        );
    }

    @Test (priority = 0)
    public void openBalancePageByViewBalanceButton()
    {
        System.out.println("test-17, priority = 0");
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickViewBalanceButton();

        BalancePageObject BalancePageObject = BalancePageObjectFactory.get(driver);
        String title_element = BalancePageObject.getTitle();

        assertEquals(
                title_element,
                BalancePageObject.MAIN_TITLE,
                "Opened page is not 'Year balance'"
        );
    }
}
