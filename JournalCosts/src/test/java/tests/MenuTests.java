package tests;

import lib.CoreTestCase;
import lib.ui.factories.CurrencyPageObjectFactory;
import lib.ui.factories.HomePageObjectFactory;
import lib.ui.factories.MenuPageObjectFactory;
import lib.ui.pageObjects.CurrencyPageObject;
import lib.ui.pageObjects.HomePageObject;
import lib.ui.pageObjects.MenuPageObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class MenuTests extends CoreTestCase
{
    @BeforeMethod
    private void preconditions()
    {
        HomePageObject HomePageObject = HomePageObjectFactory.get(driver);
        HomePageObject.clickMenuButton();
    }

    @Test
    public void closeMenuByClicking()
    {
        MenuPageObject MenuPageObject = MenuPageObjectFactory.get(driver);
        MenuPageObject.checkIfMenuIsOpen();

        MenuPageObject.tapMenuToClose();
        assertFalse(
                MenuPageObject.checkIfMenuIsOpen(),
                "Menu is not closed by swipping"
        );
    }

    @Test
    public void closeMenuBySwiping()
    {
        MenuPageObject MenuPageObject = MenuPageObjectFactory.get(driver);
        MenuPageObject.checkIfMenuIsOpen();

        MenuPageObject.swipeMenuToClose();
        assertFalse(
                MenuPageObject.checkIfMenuIsOpen(),
                "Menu is not closed by swiping"
        );
    }

    @Test
    public void openDefaultCurrencyPage()
    {
        MenuPageObject MenuPageObject = MenuPageObjectFactory.get(driver);
        MenuPageObject.checkIfMenuIsOpen();
        MenuPageObject.clickDefaultCurrencyButton();

        CurrencyPageObject CurrencyPageObject = CurrencyPageObjectFactory.get(driver);
        String title_element = CurrencyPageObject.getTitle();
    }
}
