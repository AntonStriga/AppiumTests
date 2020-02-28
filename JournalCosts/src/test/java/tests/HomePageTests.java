package tests;

import lib.CoreTestCase;
import lib.ui.factories.*;
import lib.ui.pageObjects.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends CoreTestCase
{
    @Test (groups = {"title","smoke"})
    public void mainTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getTitle();

        assertEquals(
                title_element,
                HomePageObject.MAIN_TITLE,
                "Title of the Home page is incorrect."
        );
    }

    @Test (groups = {"title"})
    public void expensesBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getExpenseTitle();

        assertEquals(
                title_element,
                HomePageObject.EXPENSES_BLOCK_TITLE,
                "Expenses block title is incorrect."
        );
    }

    @Test (groups = {"title"})
    public void incomesBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getIncomesTitle();

        assertEquals(
                title_element,
                HomePageObject.INCOMES_BLOCK_TITLE,
                "Incomes block title is incorrect."
        );
    }

    @Test (groups = {"title"})
    public void balanceBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getBalanceTitle();

        assertEquals(
                title_element,
                HomePageObject.BALANCE_BLOCK_TITLE,
                "Balance block title is incorrect."
        );
    }

    @Test (groups = {"title"})
    public void allExpensesBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getAllExpensesTitle();

        assertEquals(
                title_element,
                HomePageObject.ALL_EXPENSES_BLOCK_TITLE,
                "All expenses block title is incorrect."
        );
    }

    @Test (groups = {"title"})
    public void allIncomesBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getAllIncomesTitle();

        assertEquals(
                title_element,
                HomePageObject.ALL_INCOMES_BLOCK_TITLE,
                "All expenses block title is incorrect."
        );
    }

    @Test (groups = {"default"})
    public void defaultCurrencyVerification()
    {
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

    @Test (groups = {"default"})
    public void todayExpenseDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String today_expense_sum = HomePageObject.getTodayExpenseSum();

        assertEquals(
                today_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Today expense sum is incorrect."
        );
    }

    @Test (groups = {"default"})
    public void weekExpenseDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getWeekExpenseSum();

        assertEquals(
                week_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Week expense sum is incorrect."
        );
    }

    @Test (groups = {"default"})
    public void monthExpenseDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getMonthExpenseSum();

        assertEquals(
                week_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Month expense sum is incorrect."
        );
    }

    @Test (groups = {"default"})
    public void monthIncomesDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getMonthIncomesSum();

        assertEquals(
                week_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Month incomes sum is incorrect."
        );
    }

    @Test (groups = {"default"})
    public void balanceDefaultSumVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String week_expense_sum = HomePageObject.getBalanceSum();

        assertEquals(
                week_expense_sum,
                HomePageObject.DEFAULT_SUM,
                "Default value of Balance sum is incorrect."
        );
    }

    @Test (groups = {"smoke"})
    public void openExpesePageByAddButton()
    {
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

    @Test (groups = {"smoke"})
    public void openIncomePageByAddButton()
    {
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

    @Test (groups = {"smoke"})
    public void openBalancePageByViewBalanceButton()
    {
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

    @Test (groups = {"smoke"})
    public void openAllExpensesPageByButton()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAllExpenseButton();

        AllExpensesPageObject AllExpensePageObject = AllExpensesPageObjectFactory.get(driver);
        String title_element = AllExpensePageObject.getTitle();

        assertEquals(
                title_element,
                AllExpensePageObject.MAIN_TITLE,
                "Opened page is not 'All expenses'"
        );
    }

    @Test (groups = {"smoke"})
    public void openAllIncomesPageByButton()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAllIncomesButton();

        AllIncomesPageObject AllIncomesPageObject = AllIncomesPageObjectFactory.get(driver);
        String title_element = AllIncomesPageObject.getTitle();

        assertEquals(
                title_element,
                AllIncomesPageObject.MAIN_TITLE,
                "Opened page is not 'All expenses'"
        );
    }

    @Test (groups = {"smoke"})
    public void openMenuByButton()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickMenuButton();

        MenuPageObject MenuPageObject = MenuPageObjectFactory.get(driver);
        assertTrue(
                MenuPageObject.checkIfMenuIsOpen(),
                "Menu is not opened by clicking icon"
        );
    }

    @Test (groups = {"smoke"})
    public void openMenuBySwiping()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.swipeMenuToOpen();

        MenuPageObject MenuPageObject = MenuPageObjectFactory.get(driver);
        assertTrue(
                MenuPageObject.checkIfMenuIsOpen(),
                "Menu is not opened by swipping"
        );
    }
}
