package lib.ui.factories;

import lib.Platform;
import lib.ui.pageObjects.CategoriesPageObject;
import lib.ui.android.AndroidCategoriesPageObject;
import lib.ui.ios.iOSCategoriesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CategoriesPageObjectFactory
{
    public static CategoriesPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidCategoriesPageObject(driver);
        } else {
            return new iOSCategoriesPageObject(driver);
        }
    }
}
