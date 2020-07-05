package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidRequestsPageObject;
import lib.ui.ios.iOSRequestsPajeObject;
import lib.ui.pageObjects.RequestsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RequestsPajeObjectFactory
{
    public static RequestsPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidRequestsPageObject(driver);
        } else {
            return new iOSRequestsPajeObject(driver);
        }
    }
}
