package tests;

import lib.CoreTestCase;
import lib.ui.HomePageObject;
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
                "We have wrong title."
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
                "We have wrong expenses block title."
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
                "We have wrong incomes block title."
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
                "We have wrong balance block title."
        );
    }
}
