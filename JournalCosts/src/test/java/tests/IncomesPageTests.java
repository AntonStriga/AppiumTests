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


}
