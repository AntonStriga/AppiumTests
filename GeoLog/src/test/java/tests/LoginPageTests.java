package tests;

import lib.CoreTestCase;
import lib.ui.factories.LoginPageObjectFactory;
import lib.ui.pageObjects.LoginPageObject;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginPageTests extends CoreTestCase
{
    @Test(groups = {"title","smoke"})
    public void mainTitleVerification()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        String title_element = LoginPageObject.getTitle();

        assertEquals(
                title_element,
                LoginPageObject.MAIN_TITLE,
                "Title of the Login page is incorrect."
        );
    }

    @Test(groups = {"smoke"})
    public void mainDescriptionVerification()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        String title_element = LoginPageObject.getDescription();

        assertEquals(
                title_element,
                LoginPageObject.MAIN_DESCRIPTION,
                "Description of the Login page is incorrect."
        );
    }

    @Test
    public void loginApp()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.getDescription();
        LoginPageObject.clearLogin();
        LoginPageObject.setLogin("admin");
        LoginPageObject.clearPassword();
        LoginPageObject.setPassword("Bandit177rus");
        LoginPageObject.clickEnterButton();
    }
}
