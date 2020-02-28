package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidMenuPageObject;
import lib.ui.ios.iOSMenuPageObject;
import lib.ui.pageObjects.MenuPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MenuPageObjectFactory
{
    public static MenuPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidMenuPageObject(driver);
        } else {
            return new iOSMenuPageObject(driver);
        }
    }
}
