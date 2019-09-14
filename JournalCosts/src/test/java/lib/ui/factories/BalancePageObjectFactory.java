package lib.ui.factories;

import lib.Platform;
import lib.ui.pageObjects.BalancePageObject;
import lib.ui.android.AndroidBalancePageObject;
import lib.ui.ios.iOSBalancePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BalancePageObjectFactory
{
    public static BalancePageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidBalancePageObject(driver);
        } else {
            return new iOSBalancePageObject(driver);
        }
    }
}
