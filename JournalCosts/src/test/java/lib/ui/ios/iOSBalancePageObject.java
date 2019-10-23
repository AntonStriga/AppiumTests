package lib.ui.ios;

import lib.ui.pageObjects.BalancePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSBalancePageObject extends BalancePageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }
    public iOSBalancePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
