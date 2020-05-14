package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidForgotPasswordPageObject;
import lib.ui.ios.iOSForgotPasswordPageObject;
import lib.ui.pageObjects.ForgotPasswordPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ForgotPasswordPageObjectFactory
{
    public static ForgotPasswordPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidForgotPasswordPageObject(driver);
        } else {
            return new iOSForgotPasswordPageObject(driver);
        }
    }
}
