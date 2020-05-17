package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidStructurePageObject;
import lib.ui.ios.iOSStructurePageObject;
import lib.ui.pageObjects.StructurePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StructurePageObjectFactory 
{
    public static StructurePageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidStructurePageObject(driver);
        } else {
            return new iOSStructurePageObject(driver);
        }
    }
}
