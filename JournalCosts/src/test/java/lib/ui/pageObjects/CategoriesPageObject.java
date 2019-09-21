package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class CategoriesPageObject extends MainPageObject
{
    protected static String
        TITLE,
        BACK_BUTTON,
        CATEGORY_LOCATOR,
        CATEGORY_NAME;

    public CategoriesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    /* TEMPLATE METHODS */
    private static String getCategoryLocatorByName(String category_name)
    {
        return CATEGORY_LOCATOR.replace("{NAME}",category_name);
    }
    /* TEMPLATE METHODS */

    public String getTitle()
    {
        WebElement element = this.waitForTitleElement(TITLE);
        return element.getAttribute("text");
    }

    public void clickBackButton()
    {
        this.waitForElementAndClick(BACK_BUTTON, "Cannot find Back button by locator " + BACK_BUTTON);
    }

    public void selectCategoryByName(String category_name)
    {
        String category_locator = getCategoryLocatorByName(category_name);
        this.waitForElementAndClick(category_locator,"Cannot find category by locator: " + category_locator);
    }

    public String getCategoryValue()
    {
        WebElement element = this.waitForTitleElement(CATEGORY_NAME);
        return element.getAttribute("text");
    }
}
