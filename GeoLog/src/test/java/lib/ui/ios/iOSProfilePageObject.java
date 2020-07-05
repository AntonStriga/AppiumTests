package lib.ui.ios;

import lib.ui.pageObjects.ProfilePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSProfilePageObject extends ProfilePageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public iOSProfilePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
