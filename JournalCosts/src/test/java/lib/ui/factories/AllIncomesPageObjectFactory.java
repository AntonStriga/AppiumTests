package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidAllIncomesPageObject;
import lib.ui.ios.iOSAllIncomesPageObject;
import lib.ui.pageObjects.AllIncomesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AllIncomesPageObjectFactory
{
    public static AllIncomesPageObject get (RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidAllIncomesPageObject(driver);
        } else {
            return new iOSAllIncomesPageObject(driver);
        }
    }
}
