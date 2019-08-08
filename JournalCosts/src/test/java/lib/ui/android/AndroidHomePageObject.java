package lib.ui.android;

import lib.ui.HomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidHomePageObject extends HomePageObject
{
    static {
        TITLE = "";
    }

    public AndroidHomePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
