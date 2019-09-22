package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidCalculatorPageObject;
import lib.ui.ios.iOSCalculatorPageObject;
import lib.ui.pageObjects.CalculatorPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CalculatorPageObjectFactory
{
    public static CalculatorPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidCalculatorPageObject(driver);
        } else {
            return new iOSCalculatorPageObject(driver);
        }
    }
}
