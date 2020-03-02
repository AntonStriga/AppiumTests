package lib.ui.ios;

import lib.ui.pageObjects.HomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSHomePageObject extends HomePageObject

{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public iOSHomePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
