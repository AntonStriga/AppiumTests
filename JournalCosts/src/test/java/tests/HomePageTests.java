package tests;

import lib.CoreTestCase;
import lib.ui.ExpensesPageObject;
import lib.ui.HomePageObject;
import lib.ui.factories.ExpensesPageObjectFactory;
import lib.ui.factories.HomePageObjectFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HomePageTests extends CoreTestCase
{
    @Test
    public void titleVerificationTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getTitle();

        assertEquals(
                "Journal costs",
                title_element,
                "Title is incorrect."
        );
    }

    @Test
    public void expensesTitleVerificationTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getExpenseTitle();

        assertEquals(
                "Expenses",
                title_element,
                "Expenses block title is incorrect."
        );
    }

    @Test
    public void incomesTitleVerificationTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getIncomesTitle();

        assertEquals(
                "Incomes",
                title_element,
                "Incomes block title is incorrect."
        );
    }

    @Test
    public void balanceTitleVerificationTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getBalanceTitle();

        assertEquals(
                "Balance",
                title_element,
                "Balance block title is incorrect."
        );
    }

    @Test
    public void addExpenseButtonTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                "Expense",
                title_element,
                "Opened page is not 'Expense'"
        );
    }
}
