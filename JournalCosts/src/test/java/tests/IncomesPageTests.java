package tests;

import lib.CoreTestCase;
import lib.ui.factories.CalculatorPageObjectFactory;
import lib.ui.factories.CategoriesPageObjectFactory;
import lib.ui.factories.HomePageObjectFactory;
import lib.ui.factories.IncomesPageObjectFactory;
import lib.ui.pageObjects.CalculatorPageObject;
import lib.ui.pageObjects.CategoriesPageObject;
import lib.ui.pageObjects.HomePageObject;
import lib.ui.pageObjects.IncomesPageObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IncomesPageTests extends CoreTestCase
{
    @BeforeMethod
    private void precondition()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickAddIncomesButton();
    }

    @Test
    public void openIncomesPageAndBack()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        IncomesPageObject.clickBackButton();

        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        String title_element = HomePageObject.getTitle();
        assertEquals(
                title_element,
                HomePageObject.MAIN_TITLE,
                "We didn't return to the main page"
        );
    }

    @Test (groups = {"title"})
    public  void datePickerTitleVerification()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        String title_element = IncomesPageObject.getDataPickerTitle();

        assertEquals(
                title_element,
                IncomesPageObject.DATA_PICKER_TITLE,
                "Title of the Data Picker is incorrect."
        );
    }

    @Test (groups = {"title"})
    public  void timePickerTitleVerification()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        String title_element = IncomesPageObject.getTimePickerTitle();

        assertEquals(
                title_element,
                IncomesPageObject.TIME_PICKER_TITLE,
                "Title of the Time Picker is incorrect."
        );
    }

    @Test (groups = {"title"})
    public  void categoryBlockTitleVerification()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        String title_element = IncomesPageObject.getCategoryBlockTitle();

        assertEquals(
                title_element,
                IncomesPageObject.CATEGORY_BLOCK_TITLE,
                "Title of the Category block is incorrect."
        );
    }

    @Test (groups = {"title"})
    public  void amountBlockTitleVerification()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        String title_element = IncomesPageObject.getAmountBlockTitle();

        assertEquals(
                title_element,
                IncomesPageObject.AMOUNT_BLOCK_TITLE,
                "Title of the Amount block is incorrect."
        );
    }

    @Test (groups = {"title"})
    public  void currencyBlockTitleVerification()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        String title_element = IncomesPageObject.getCurrencyBlockTitle();

        assertEquals(
                title_element,
                IncomesPageObject.CURRENCY_BLOCK_TITLE,
                "Title of the Currency block is incorrect."
        );
    }

    @Test
    public void openDatePickerAndCancel()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        IncomesPageObject.openDatePicker();
        IncomesPageObject.cancelDatePicker();
        String title_element = IncomesPageObject.getTitle();

        assertEquals(
                title_element,
                IncomesPageObject.MAIN_TITLE,
                "We didn't close Date picker"
        );
    }

    @Test (groups = {"smoke"})
    public void setDateInDataPicker()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        String selected_date = IncomesPageObject.setDate();
        String expense_date = IncomesPageObject.getDate();

        assertEquals(
                expense_date,
                selected_date,
                "Date wasn't seted correctly"
        );
    }

    @Test
    public void openTimePickerAndCancel()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        IncomesPageObject.openTimePicker();
        IncomesPageObject.cancelTimePicker();
        String title_element = IncomesPageObject.getTitle();

        assertEquals(
                title_element,
                IncomesPageObject.MAIN_TITLE,
                "We didn't close Date picker"
        );
    }

    @Test (groups = {"smoke"})
    public void setTimeInTimePicker()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        String selected_time = "22:35";
        IncomesPageObject.setTime();
        String result_time = IncomesPageObject.getTime();

        assertEquals(
                result_time,
                selected_time,
                "Time wasn't set correctly"
        );
    }

    @Test
    public void openCategoryAndCancel()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        IncomesPageObject.openCategory();

        CategoriesPageObject CategoriesPageObject = CategoriesPageObjectFactory.get(driver);
        CategoriesPageObject.getTitle();
        CategoriesPageObject.clickBackButton();

        String title_element = IncomesPageObject.getTitle();
        assertEquals(
                title_element,
                IncomesPageObject.MAIN_TITLE,
                "We didn't return to the Expense page"
        );
    }

    @Test (groups = {"smoke"})
    public void selectCategory()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        IncomesPageObject.openCategory();

        CategoriesPageObject CategoriesPageObject = CategoriesPageObjectFactory.get(driver);
        CategoriesPageObject.getTitle();
        CategoriesPageObject.selectCategoryByName("Premium");

        String selected_category = CategoriesPageObject.getCategoryValue();
        assertEquals(
                selected_category,
                "Premium",
                "Expected category didn't select"
        );
    }

    @Test
    public void openCalculatorAndBack()
    {
        IncomesPageObject IncomesPageObject = IncomesPageObjectFactory.get(driver);
        IncomesPageObject.getTitle();
        IncomesPageObject.openCalculator();

        CalculatorPageObject CalculatorPageObject = CalculatorPageObjectFactory.get(driver);
        CalculatorPageObject.getTitle();
        CalculatorPageObject.clickBackButton();

        String title_element = IncomesPageObject.getTitle();
        assertEquals(
                title_element,
                IncomesPageObject.MAIN_TITLE,
                "We didn't return to the Expense page"
        );
    }
}
