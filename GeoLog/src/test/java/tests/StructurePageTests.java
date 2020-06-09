package tests;

import io.appium.java_client.AppiumDriver;
import lib.CoreTestCase;
import lib.ui.factories.*;
import lib.ui.pageObjects.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StructurePageTests extends CoreTestCase
{
    @BeforeMethod
    public void precondition()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.getDescription();
        LoginPageObject.clearLogin();
        LoginPageObject.setLogin(LoginPageObject.LOGIN);
        LoginPageObject.clearPassword();
        LoginPageObject.setPassword(LoginPageObject.PASSWORD);
        ((AppiumDriver)driver).hideKeyboard();
        LoginPageObject.clickEnterButton();
    }

    @Test (groups = {"smoke"})
    public void iconVerification()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        String title_element = StructurePageObject.getTitle();



        assertEquals(
                title_element,
                StructurePageObject.MAIN_TITLE,
                "Title of the Sructure page is incorrect."
        );
    }
}
