package tests;

import lib.CoreTestCase;
import lib.ui.pageObjects.CategoriesPageObject;
import lib.ui.pageObjects.ExpensesPageObject;
import lib.ui.pageObjects.HomePageObject;
import lib.ui.factories.CategoriesPageObjectFactory;
import lib.ui.factories.ExpensesPageObjectFactory;
import lib.ui.factories.HomePageObjectFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExpensesPageTests extends CoreTestCase
{
    private static String
        MAIN_TITLE = "Journal costs",
        EXPENSES_PAGE_TITLE = "Expense",
        DATA_PICKER_TITLE = "Date",
        TIME_PICKER_TITLE = "Time",
        CATEGORY_BLOCK_TITLE = "Category",
        AMOUNT_BLOCK_TITLE = "Amount";

    @Test
    public void openExpensePageAndBack()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.clickBackButton();

        String title_element = HomePageObject.getTitle();
        assertEquals(
                title_element,
                MAIN_TITLE,
                "We didn't return to the main page"
        );
    }

    @Test
    public  void datePickerTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getDataPickerTitle();

        assertEquals(
                title_element,
                DATA_PICKER_TITLE,
                "Title of the Data Picker is incorrect."
        );

    }

    @Test
    public  void timePickerTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getTimePickerTitle();

        assertEquals(
                title_element,
                TIME_PICKER_TITLE,
                "Title of the Time Picker is incorrect."
        );

    }

    @Test
    public  void categoryBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getCategoryBlockTitle();

        assertEquals(
                title_element,
                CATEGORY_BLOCK_TITLE,
                "Title of the Category block is incorrect."
        );

    }

    @Test
    public  void amountBlockTitleVerification()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getAmountBlockTitle();

        assertEquals(
                title_element,
                AMOUNT_BLOCK_TITLE,
                "Title of the Amount block is incorrect."
        );

    }

    @Test
    public void openDatePickerAndCancel()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openDatePicker();
        ExpensesPageObject.cancelDatePicker();
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                title_element,
                EXPENSES_PAGE_TITLE,
                "We didn't close Date picker"
        );
    }

    @Test
    public void setDateInDataPicker()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String selected_date = ExpensesPageObject.setDate();
        String expense_date = ExpensesPageObject.getDate();

        assertEquals(
                expense_date,
                selected_date,
                "Date wasn't seted correctly"
        );
    }

    @Test
    public void openTimePickerAndCancel()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openTimePicker();
        ExpensesPageObject.cancelTimePicker();
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                title_element,
                EXPENSES_PAGE_TITLE,
                "We didn't close Date picker"
        );
    }

    @Test
    public void setTimeInTimePicker()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String selected_time = "22:35";
        ExpensesPageObject.setTime();
        String result_time = ExpensesPageObject.getTime();

        assertEquals(
                result_time,
                selected_time,
                "Time wasn't set correctly"
        );
    }

    @Test
    public void openCategoryAndCancel()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openCategory();

        CategoriesPageObject CategoriesPageObject = CategoriesPageObjectFactory.get(driver);
        CategoriesPageObject.getTitle();
        CategoriesPageObject.clickBackButton();

        String title_element = ExpensesPageObject.getTitle();
        assertEquals(
                title_element,
                EXPENSES_PAGE_TITLE,
                "We didn't return to the Expense page"
        );
    }

    @Test
    public void selectCategory()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();

        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openCategory();

        CategoriesPageObject CategoriesPageObject = CategoriesPageObjectFactory.get(driver);
        CategoriesPageObject.getTitle();
        CategoriesPageObject.selectCategoryByName("Different");

        String selected_category = CategoriesPageObject.getCategoryValue();
        assertEquals(
                selected_category,
                "Different",
                "Expected category didn't select"
        );
    }


}
