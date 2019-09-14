package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class CategoriesPageObject extends MainPageObject
{
    protected static String
        TITLE,
        BACK_BUTTON;

    public CategoriesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement element = this.waitForTitleElement(TITLE);
        return element.getAttribute("text");
    }

    public void clickBackButton()
    {
        this.waitForElementAndClick(BACK_BUTTON, "Cannot find Back button by locator " + BACK_BUTTON);
    }
}
