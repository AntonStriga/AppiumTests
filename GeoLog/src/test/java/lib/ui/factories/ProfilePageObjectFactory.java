package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidProfilePageObject;
import lib.ui.ios.iOSProfilePageObject;
import lib.ui.pageObjects.ProfilePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ProfilePageObjectFactory
{
    public static ProfilePageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidProfilePageObject(driver);
        } else {
            return new iOSProfilePageObject(driver);
        }
    }
}
