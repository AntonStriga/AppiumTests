package tests;

import lib.CoreTestCase;
import lib.ui.factories.ForgotPasswordPageObjectFactory;
import lib.ui.factories.LoginPageObjectFactory;
import lib.ui.pageObjects.ForgotPasswordPageObject;
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

    @Test(groups = {"smoke"})
    public void loginFieldTitleVerification()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        String title_element = LoginPageObject.getLoginFieldTitle();

        assertEquals(
                title_element,
                LoginPageObject.LOGIN_FIELD_TITLE,
                "Login field title is incorrect."
        );
    }

    @Test(groups = {"smoke"})
    public void passwordFieldTitleVerification()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        String title_element = LoginPageObject.getPasswordFieldTitle();

        assertEquals(
                title_element,
                LoginPageObject.PASSWORD_FIELD_TITLE,
                "Password field title is incorrect."
        );
    }

    @Test(groups = {"smoke"})
    public void enterButtonTitleVerification()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        String title_element = LoginPageObject.getEnterButtonTitle();

        assertEquals(
                title_element,
                LoginPageObject.ENTER_BUTTON_TITLE,
                "Enter button title is incorrect."
        );
    }

    @Test(groups = {"smoke"})
    public void forgotPasswordButtonTitleVerification()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        String title_element = LoginPageObject.getForgotPasswordButtonTitle();

        assertEquals(
                title_element,
                LoginPageObject.FORGOT_PASSWORD_BUTTON_TITLE,
                "Enter button title is incorrect."
        );
    }

    @Test
    public void enterForgotPasswordPage()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.getForgotPasswordButtonTitle();
        LoginPageObject.clickForgotPasswordButton();

        ForgotPasswordPageObject ForgotPasswordPageObject = ForgotPasswordPageObjectFactory.get(driver);
        String title_element = ForgotPasswordPageObject.getTitle();
        assertEquals(
                title_element,
                ForgotPasswordPageObject.MAIN_TITLE,
                "Forgot password page is't opened."
        );
    }

    @Test
    public void loginApp()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.getDescription();
        LoginPageObject.clearLogin();
        LoginPageObject.setLogin(LoginPageObject.LOGIN);
        LoginPageObject.clearPassword();
        LoginPageObject.setPassword(LoginPageObject.PASSWORD);
        LoginPageObject.clickEnterButton();


    }
}
