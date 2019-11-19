package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class IncomesPageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Income",
            DATA_PICKER_TITLE = "Date",
            TIME_PICKER_TITLE = "Time",
            CATEGORY_BLOCK_TITLE = "Category";

    protected static String
            MAIN_TITLE_LOCATOR,
            BACK_BUTTON_LOCATOR,
            DATE_PICKER_LOCATOR,
            DATA_PICKER_TITLE_LOCATOR,
            TIME_PICKER_TITLE_LOCATOR,
            CATEGORY_BLOCK_TITLE_LOCATOR;

    public IncomesPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public void clickBackButton()
    {
        this.waitForElementAndClick(BACK_BUTTON_LOCATOR, "Cannot find Back button by locator " + BACK_BUTTON_LOCATOR);
    }

    public String getDataPickerTitle()
    {
        WebElement element = this.waitForTitleElement(DATA_PICKER_TITLE_LOCATOR);
        return element.getAttribute("text");
    }

    public String getTimePickerTitle()
    {
        WebElement element = this.waitForTitleElement(TIME_PICKER_TITLE_LOCATOR);
        return element.getAttribute("text");
    }

    public String getCategoryBlockTitle()
    {
        WebElement element = this.waitForTitleElement(CATEGORY_BLOCK_TITLE_LOCATOR);
        return element.getAttribute("text");
    }
}
