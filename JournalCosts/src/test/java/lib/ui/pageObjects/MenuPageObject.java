package lib.ui.pageObjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class MenuPageObject extends MainPageObject
{
    protected static String
        MENU_BODY_LOCATOR,
        DEFAULT_CURRENCY_BUTTON;

    public MenuPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    public boolean checkIfMenuIsOpen()
    {
        try {
            this.waitForElementPresent(MENU_BODY_LOCATOR, "Cannot find Balance sum by locator " + MENU_BODY_LOCATOR);
            return true;
        } catch (Exception error) {
            return false;
        }
    }

    public void swipeMenuToClose()
    {
        waitForElementPresent(MENU_BODY_LOCATOR, "Cannot find Balance sum by locator " + MENU_BODY_LOCATOR);
        swipeLeft();
    }

    public void tapMenuToClose()
    {
        waitForElementPresent(MENU_BODY_LOCATOR, "Cannot find Balance sum by locator " + MENU_BODY_LOCATOR);
        this.tapOnEmptySpace();
    }

    private void tapOnEmptySpace()
    {
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * 0.95);
        int y = size.height / 2;
        this.tapByLocation(x,y);
    }

    public void clickDefaultCurrencyButton()
    {
        this.waitForElementAndClick(DEFAULT_CURRENCY_BUTTON, "Cannot find Default currency line in Menu by locator " + DEFAULT_CURRENCY_BUTTON);
    }
}