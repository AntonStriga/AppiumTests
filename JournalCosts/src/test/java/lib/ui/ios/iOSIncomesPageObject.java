package lib.ui.ios;

import lib.ui.pageObjects.IncomesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSIncomesPageObject extends IncomesPageObject
{
    static {
        TITLE = "";
    }
    public iOSIncomesPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
