package tests;

import lib.CoreTestCase;
import lib.ui.ExpensesPageObject;
import lib.ui.HomePageObject;
import lib.ui.factories.ExpensesPageObjectFactory;
import lib.ui.factories.HomePageObjectFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExpensesPageTests extends CoreTestCase
{
    @Test
    public void openExpensePageAndBackTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.clickBackButton();

        String title_element = HomePageObject.getTitle();

        assertEquals(
                "Journal costs",
                title_element,
                "We didn't return to the main page"
        );
    }
}
