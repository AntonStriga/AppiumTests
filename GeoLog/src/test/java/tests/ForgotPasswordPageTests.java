package tests;

import io.appium.java_client.AppiumDriver;
import lib.CoreTestCase;
import lib.ui.factories.ForgotPasswordPageObjectFactory;
import lib.ui.factories.LoginPageObjectFactory;
import lib.ui.pageObjects.ForgotPasswordPageObject;
import lib.ui.pageObjects.LoginPageObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordPageTests extends CoreTestCase
{
    @BeforeMethod
    private void preconditions()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.getForgotPasswordButtonTitle();
        ((AppiumDriver)driver).hideKeyboard();
        LoginPageObject.clickForgotPasswordButton();
    }

    @Test
    public void mainDescriptionVerification()
    {
        ForgotPasswordPageObject ForgotPasswordPageObject = ForgotPasswordPageObjectFactory.get(driver);
        String title_element = ForgotPasswordPageObject.getMainDescription();
        assertEquals(
                title_element,
                ForgotPasswordPageObject.MAIN_DESCRIPTION,
                "Main description text is incorrect."
        );
    }

    @Test
    public void adminNameVerification()
    {
        ForgotPasswordPageObject ForgotPasswordPageObject = ForgotPasswordPageObjectFactory.get(driver);
        String title_element = ForgotPasswordPageObject.getAdminName();
        assertEquals(
                title_element,
                ForgotPasswordPageObject.ADMIN_NAME,
                "Admin name is incorrect."
        );
    }

    @Test
    public void mainIconPresenceVerification()
    {
        ForgotPasswordPageObject ForgotPasswordPageObject = ForgotPasswordPageObjectFactory.get(driver);
        ForgotPasswordPageObject.getAdminName();
        ForgotPasswordPageObject.checkPicturePresence();
    }

    @Test
    public void backToLoginPage()
    {
        ForgotPasswordPageObject ForgotPasswordPageObject = ForgotPasswordPageObjectFactory.get(driver);
        ForgotPasswordPageObject.getAdminName();
        ForgotPasswordPageObject.clickBackButton();

        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        String title_element = LoginPageObject.getTitle();

        assertEquals(
                title_element,
                LoginPageObject.MAIN_TITLE,
                "Login page isn't opened."
        );
    }
}
