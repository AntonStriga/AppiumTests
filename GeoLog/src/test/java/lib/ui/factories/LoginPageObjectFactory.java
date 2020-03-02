package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidLoginPageObject;
import lib.ui.ios.iOSLoginPageObject;
import lib.ui.pageObjects.LoginPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageObjectFactory
{
    public static LoginPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidLoginPageObject(driver);
        } else {
            return new iOSLoginPageObject(driver);
        }
    }
}
