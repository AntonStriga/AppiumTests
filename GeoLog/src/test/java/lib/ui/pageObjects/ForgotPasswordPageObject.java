package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ForgotPasswordPageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Не помню пароль",
            MAIN_DESCRIPTION = "Для смены пароля\n" + "обратитесь к администратору",
            ADMIN_NAME = "Паину Андрею";

    protected static String
            MAIN_TITLE_LOCATOR,
            MAIN_DESCRIPTION_LOCATOR,
            ADMIN_NAME_LOCATOR,
            BACK_BUTTON_LOCATOR,
            MAIN_PICTURE_LOCATOR;

    public ForgotPasswordPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getMainDescription()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_DESCRIPTION_LOCATOR);
        return title_element.getAttribute("text");
    }

    public String getAdminName()
    {
        WebElement title_element = this.waitForTitleElement(ADMIN_NAME_LOCATOR);
        return title_element.getAttribute("text");
    }

    public void checkPicturePresence()
    {
        this.waitForElementPresent(MAIN_PICTURE_LOCATOR, "Can't find picture by locator = " + MAIN_PICTURE_LOCATOR);
    }

    public void clickBackButton()
    {
        this.waitForElementAndClick(BACK_BUTTON_LOCATOR, "Can't find Back button by locator = " + BACK_BUTTON_LOCATOR);
    }
}
