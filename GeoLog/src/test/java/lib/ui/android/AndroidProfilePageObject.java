package lib.ui.android;

import lib.ui.pageObjects.ProfilePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidProfilePageObject extends ProfilePageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
        MAIN_ICON_LOCATOR = "id:com.geolog:id/profile_toolbar_iv_logo";
    }

    public AndroidProfilePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
