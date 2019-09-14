package lib.ui.factories;

import lib.Platform;
import lib.ui.pageObjects.IncomesPageObject;
import lib.ui.android.AndroidIncomesPageObject;
import lib.ui.ios.iOSIncomesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IncomesPageObjectFactory
{
    public static IncomesPageObject get (RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidIncomesPageObject(driver);
        } else {
            return new iOSIncomesPageObject(driver);
        }
    }
}
