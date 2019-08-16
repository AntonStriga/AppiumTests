package lib.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ExpensesPageObject extends MainPageObject
{
    protected static String
        TITLE,
        BACK_BUTTON;

    public ExpensesPageObject(RemoteWebDriver driver)
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
