package lib.ui.android;

import lib.ui.pageObjects.CurrencyPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidCurrencyPageObject extends CurrencyPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public AndroidCurrencyPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
