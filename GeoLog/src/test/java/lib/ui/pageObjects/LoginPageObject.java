package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class LoginPageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "GEO log",
            MAIN_DESCRIPTION = "“Мобильный офис ГЕО” - центр\n" + "управления крупными проектами ГРР",
            LOGIN = "admin",
            LOGIN_FIELD_TITLE = "Логин",
            PASSWORD = "Bandit177rus",
            PASSWORD_FIELD_TITLE = "Пароль",
            ENTER_BUTTON_TITLE = "Войти",
            FORGOT_PASSWORD_BUTTON_TITLE = "Не помню пароль";

    protected static String
            MAIN_TITLE_LOCATOR,
            MAIN_DESCRIPTION_LOCATOR,
            LOGIN_FIELD_LOCATOR,
            PASSWORD_FIELD_LOCATOR,
            PASSWORD_FIELD_TITLE_LOCATOR,
            ENTER_BUTTON_LOCATOR,
            LOGIN_FIELD_TITLE_LOCATOR,
            FORGOT_PASSWORD_BUTTON_LOCATOR;

    public LoginPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getDescription()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_DESCRIPTION_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getLoginFieldTitle()
    {
        WebElement title_element = this.waitForTitleElement(LOGIN_FIELD_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public void clearLogin()
    {
        this.waitForElementAndClear(LOGIN_FIELD_LOCATOR, "Can not find Login field by locator: " + LOGIN_FIELD_LOCATOR);
    }

    public void setLogin(String value)
    {
        this.waitForElementAndSendKeys(LOGIN_FIELD_LOCATOR, value, "Can not find Login field by locator: " + LOGIN_FIELD_LOCATOR);
    }

    public String getPasswordFieldTitle()
    {
        WebElement title_element = this.waitForTitleElement(PASSWORD_FIELD_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public void clearPassword()
    {
        this.waitForElementAndClear(PASSWORD_FIELD_LOCATOR, "Can not find Password field by locator: " + PASSWORD_FIELD_LOCATOR);
    }

    public void setPassword(String value)
    {
        this.waitForElementAndSendKeys(PASSWORD_FIELD_LOCATOR, value, "Can not find Password field by locator: " + PASSWORD_FIELD_LOCATOR);
    }

    public String getEnterButtonTitle()
    {
        WebElement title_element = this.waitForTitleElement(ENTER_BUTTON_LOCATOR);
        return title_element.getAttribute("text");
    }

    public void clickEnterButton()
    {
        this.waitForElementAndClick(ENTER_BUTTON_LOCATOR, "Can not fond Enter button by locator: " + ENTER_BUTTON_LOCATOR);
    }


    public String getForgotPasswordButtonTitle()
    {
        {
            WebElement title_element = this.waitForTitleElement(FORGOT_PASSWORD_BUTTON_LOCATOR);
            return title_element.getAttribute("text");
        }
    }

    public void clickForgotPasswordButton()
    {
        this.waitForElementAndClick(FORGOT_PASSWORD_BUTTON_LOCATOR, "Can not fond Forgot password button by locator: " + FORGOT_PASSWORD_BUTTON_LOCATOR);
    }
}
