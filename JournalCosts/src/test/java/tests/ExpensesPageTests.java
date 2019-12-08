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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertEquals;

public class ExpensesPageTests extends CoreTestCase
{
    @BeforeMethod (alwaysRun = true)
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

    @Test (groups = {"title"})
    public  void datePickerTitleVerification()
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getDataPickerTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.DATA_PICKER_TITLE,
                "Title of the Data Picker is incorrect."
        );

    }

    @Test (groups = {"title"})
    public  void timePickerTitleVerification()
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getTimePickerTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.TIME_PICKER_TITLE,
                "Title of the Time Picker is incorrect."
        );
    }

    @Test (groups = {"title"})
    public  void categoryBlockTitleVerification()
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getCategoryBlockTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.CATEGORY_BLOCK_TITLE,
                "Title of the Category block is incorrect."
        );
    }

    @Test (groups = {"title"})
    public  void amountBlockTitleVerification()
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        String title_element = ExpensesPageObject.getAmountBlockTitle();

        assertEquals(
                title_element,
                ExpensesPageObject.AMOUNT_BLOCK_TITLE,
                "Title of the Amount block is incorrect."
        );

    }

    @Test (groups = {"title"})
    public  void currencyBlockTitleVerification()
    {
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

    @Test
    @Parameters ({"amount_sum", "comment"})
    public void testParametersInTest (String amount_sum, String comment)
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.setAmmountSum(amount_sum);
        ExpensesPageObject.setComment(comment);

        SoftAssert verification = new SoftAssert();
        String resultSum = ExpensesPageObject.getAmountSumValue();
        verification.assertEquals(
                resultSum,
                amount_sum,
                "Sum was not send correctly"
        );

        String resultComment = ExpensesPageObject.getComment();
        verification.assertEquals(
                resultComment,
                comment,
                "Comment was not send correctly"
        );

        verification.assertAll();
    }

    @Test (dataProvider = "testData")
    public void testDataProvider (String amount_sum, String comment)
    {
        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
        ExpensesPageObject.getTitle();
        ExpensesPageObject.setAmmountSum(amount_sum);
        ExpensesPageObject.setComment(comment);

        SoftAssert verification = new SoftAssert();
        String resultSum = ExpensesPageObject.getAmountSumValue();
        verification.assertEquals(
                resultSum,
                amount_sum,
                "Sum was not send correctly"
        );

        String resultComment = ExpensesPageObject.getComment();
        verification.assertEquals(
                resultComment,
                comment,
                "Comment was not send correctly"
        );

        verification.assertAll();
    }

    @DataProvider
    public Iterator<Object[]> testData()
    {
        List<Object[]> data = new ArrayList<Object[]>();
        for (int i = 0; i < 10; i++) {
            data.add(new Object[]{generateSum(), generateComment()});
        }        
        return data.iterator();
    }

    private Object generateComment() {
        Object data = new Random().nextInt();
        return "comment" + data.toString();
    }

    private Object generateSum() {
        Object data = new Random().nextFloat() * 10000;
        return data.toString();
    }
}
