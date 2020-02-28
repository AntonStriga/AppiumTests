package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidAllExpensesPageObject;
import lib.ui.ios.iOSAllExpensesPageObject;
import lib.ui.pageObjects.AllExpensesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AllExpensesPageObjectFactory
{
    public static AllExpensesPageObject get (RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidAllExpensesPageObject(driver);
        } else {
            return new iOSAllExpensesPageObject(driver);
        }
    }
}
