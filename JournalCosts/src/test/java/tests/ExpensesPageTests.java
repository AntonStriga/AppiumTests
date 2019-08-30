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

    @Test
    public void openDatePickerAndCloseTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openDatePicker();
        ExpensesPageObject.cancelDatePicker();
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                "Expense",
                title_element,
                "We didn't close Date picker"
        );
    }

    @Test
    public void setDateInDataPickerTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String selected_date = ExpensesPageObject.setDate();
        String expense_date = ExpensesPageObject.getDate();

        assertEquals(
                selected_date,
                expense_date,
                "Date wasn't seted correctly"
        );
    }

    @Test
    public void openTimePickerAndCloseTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openTimePicker();
        ExpensesPageObject.cancelTimePicker();
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                "Expense",
                title_element,
                "We didn't close Date picker"
        );
    }

    @Test
    public void setTImeInTimePickerTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String selected_time = "22:35";
        ExpensesPageObject.setTime();
        String result_time = ExpensesPageObject.getTime();

        assertEquals(
                selected_time,
                result_time,
                "Time wasn't seted correctly"
        );
    }

    @Test
    public void openCategoryAndCloseTest()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openCategory();
    }
}
