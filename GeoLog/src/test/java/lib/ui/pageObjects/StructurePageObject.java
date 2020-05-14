package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class StructurePageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "";

    protected static String
            MAIN_TITLE_LOCATOR;

    public StructurePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }
}
