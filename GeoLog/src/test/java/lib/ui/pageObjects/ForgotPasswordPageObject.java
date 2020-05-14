package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ForgotPasswordPageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Не помню пароль",
            RESTORE_PASSWORD_DESCRIPTION = "Для смены пароля обратитесь к администратору",
            RESTORE_PASSWORD_ADMIN = "Паину Андрею ";

    protected static String
            MAIN_TITLE_LOCATOR,
            RESTORE_PASSWORD_DESCRIPTION_LOCATOR,
            RESTORE_PASSWORD_ADMIN_LOCATOR,
            BACK_BUTTON_LOCATOR,
            RESTORE_PASSWORD_PICTURE_LOCATOR;

    public ForgotPasswordPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }
}
