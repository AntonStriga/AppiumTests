package tests;

import lib.CoreTestCase;
import lib.ui.factories.*;
import lib.ui.pageObjects.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class StructurePageTests extends CoreTestCase
{
    @Test (groups = {"title","smoke"})
    public void mainTitleVerification()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        String title_element = StructurePageObject.getTitle();

        assertEquals(
                title_element,
                StructurePageObject.MAIN_TITLE,
                "Title of the Home page is incorrect."
        );
    }

//    @Test (groups = {"smoke"})
//    public void openExpesePageByAddButton()
//    {
//        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
//        StructurePageObject.clickAddExpenseButton();
//
//        ExpensesPageObject ExpensesPageObject = ExpensesPageObjectFactory.get(driver);
//        String title_element = ExpensesPageObject.getTitle();
//
//        assertEquals(
//                title_element,
//                ExpensesPageObject.MAIN_TITLE,
//                "Opened page is not 'Expense'"
//        );
//    }
}
