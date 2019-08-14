package lib.ui.factories;

import lib.Platform;
import lib.ui.ExpensesPageObject;
import lib.ui.android.AndroidExpensesPageObject;
import lib.ui.ios.iOSExpensesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExpensesPageObjectFactory
{
    public static ExpensesPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidExpensesPageObject(driver);
        } else {
            return new iOSExpensesPageObject(driver);
        }
    }
}
