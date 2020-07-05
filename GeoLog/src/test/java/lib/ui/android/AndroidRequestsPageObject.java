package lib.ui.android;

import lib.ui.pageObjects.RequestsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidRequestsPageObject extends RequestsPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
        MAIN_ICON_LOCATOR = "id:com.geolog:id/requests_toolbar_iv_marker";
    }

    public AndroidRequestsPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
