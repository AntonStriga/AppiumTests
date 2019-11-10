package tests;

import lib.CoreTestCase;
import lib.ui.factories.CalculatorPageObjectFactory;
import lib.ui.pageObjects.CalculatorPageObject;
import lib.ui.pageObjects.CategoriesPageObject;
import lib.ui.pageObjects.ExpensesPageObject;
import lib.ui.pageObjects.HomePageObject;
import lib.ui.factories.CategoriesPageObjectFactory;
import lib.ui.factories.ExpensesPageObjectFactory;
import lib.ui.factories.HomePageObjectFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExpensesPageTests extends CoreTestCase
{
    @BeforeMethod(alwaysRun = true)
    private void preconditions()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddExpenseButton();
    }

    @Test
    public void openExpensePageAndBack()
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.clickBackButton();

        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getTitle();
        assertEquals(
                title_element,
                HomePageObject.MAIN_TITLE,
                "We didn't return to the main page"
        );
    }

    @Test (groups = {"title"}, priority = 2)
    public  void datePickerTitleVerification()
    {
        System.out.println("priority = 2");
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getDataPickerTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.DATA_PICKER_TITLE,
                "Title of the Data Picker is incorrect."
        );

    }

    @Test (groups = {"title"}, priority = 3)
    public  void timePickerTitleVerification()
    {
        System.out.println("test-1, priority = 3");
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getTimePickerTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.TIME_PICKER_TITLE,
                "Title of the Time Picker is incorrect."
        );

    }

    @Test (groups = {"title"}, priority = 1)
    public  void categoryBlockTitleVerification()
    {
        System.out.println("test-1, priority = 1");
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getCategoryBlockTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.CATEGORY_BLOCK_TITLE,
                "Title of the Category block is incorrect."
        );

    }

    @Test (groups = {"title"}, priority = 1)
    public  void amountBlockTitleVerification()
    {
        System.out.println("test-1, priority = 1");
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getAmountBlockTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.AMOUNT_BLOCK_TITLE,
                "Title of the Amount block is incorrect."
        );

    }

    @Test (groups = {"title"}, priority = 0)
    public  void currencyBlockTitleVerification()
    {
        System.out.println("test-1, priority = 0");
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getCurrencyBlockTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.CURRENCY_BLOCK_TITLE,
                "Title of the Currency block is incorrect."
        );

    }

    @Test
    public void openDatePickerAndCancel()
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openDatePicker();
        ExpensesPageObject.cancelDatePicker();
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.MAIN_TITLE,
                "We didn't close Date picker"
        );
    }

    @Test (groups = {"smoke"})
    public void setDateInDataPicker()
    {
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
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openTimePicker();
        ExpensesPageObject.cancelTimePicker();
        String title_element = ExpensesPageObject.getTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.MAIN_TITLE,
                "We didn't close Date picker"
        );
    }

    @Test (groups = {"smoke"})
    public void setTimeInTimePicker()
    {
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
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openCategory();

        CategoriesPageObject CategoriesPageObject = CategoriesPageObjectFactory.get(driver);
        CategoriesPageObject.getTitle();
        CategoriesPageObject.clickBackButton();

        String title_element = ExpensesPageObject.getTitle();
        assertEquals(
                title_element,
                ExpensesPageObject.MAIN_TITLE,
                "We didn't return to the Expense page"
        );
    }

    @Test (groups = {"smoke"})
    public void selectCategory()
    {
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

    @Test
    public void openCalculatorAndBack()
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.openCalculator();

        CalculatorPageObject CalculatorPageObject = CalculatorPageObjectFactory.get(driver);
        CalculatorPageObject.getTitle();
        CalculatorPageObject.clickBackButton();

        String title_element = ExpensesPageObject.getTitle();
        assertEquals(
                title_element,
                ExpensesPageObject.MAIN_TITLE,
                "We didn't return to the Expense page"
        );
    }
}
