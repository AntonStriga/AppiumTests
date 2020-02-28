package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidCurrencyPageObject;
import lib.ui.ios.iOSHomeCurrencyPageObject;
import lib.ui.pageObjects.CurrencyPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CurrencyPageObjectFactory
{
    public static CurrencyPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidCurrencyPageObject(driver);
        } else {
            return new iOSHomeCurrencyPageObject(driver);
        }
    }
}
