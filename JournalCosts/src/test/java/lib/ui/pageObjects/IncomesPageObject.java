package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class IncomesPageObject extends MainPageObject
{
    protected static String
        TITLE;

    public IncomesPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(TITLE);
        return title_element.getAttribute("text");
    }
}
