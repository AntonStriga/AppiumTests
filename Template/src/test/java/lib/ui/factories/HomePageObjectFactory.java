package lib.ui.factories;

import lib.Platform;
import lib.ui.pageObjects.HomePageObject;
import lib.ui.android.AndroidHomePageObject;
import lib.ui.ios.iOSHomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePageObjectFactory
{
    public static HomePageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidHomePageObject(driver);
        } else {
            return new iOSHomePageObject(driver);
        }
    }
}
