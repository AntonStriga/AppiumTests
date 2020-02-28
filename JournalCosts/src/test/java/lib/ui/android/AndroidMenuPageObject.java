package lib.ui.android;

import lib.ui.pageObjects.MenuPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMenuPageObject extends MenuPageObject
{
    static {
        MENU_BODY_LOCATOR = "id:com.vitvov.profit:id/left_drawer";
        DEFAULT_CURRENCY_BUTTON = "xpath://*[@resource-id='com.vitvov.profit:id/title']//*[@text='Default currency']";
    }

    public AndroidMenuPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
