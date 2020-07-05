package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ProfilePageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "";

    protected static String
            MAIN_TITLE_LOCATOR,
            MAIN_ICON_LOCATOR;

    public ProfilePageObject(RemoteWebDriver driver) {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public Boolean isIconPresent()
    {
        this.waitForElementPresent(MAIN_ICON_LOCATOR, "Can not find title icon by locator: " + MAIN_ICON_LOCATOR);
        return true;
    }
}
