package tests;

import lib.CoreTestCase;
import lib.ui.factories.HomePageObjectFactory;
import lib.ui.factories.IncomesPageObjectFactory;
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
}
