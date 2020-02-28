package lib.ui.android;

import lib.ui.pageObjects.AllIncomesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidAllIncomesPageObject extends AllIncomesPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public AndroidAllIncomesPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
