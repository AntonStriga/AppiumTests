package lib.ui.ios;

import lib.ui.HomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSHomePageObject extends HomePageObject

{
    static {
        TITLE = "";
    }

    public iOSHomePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
