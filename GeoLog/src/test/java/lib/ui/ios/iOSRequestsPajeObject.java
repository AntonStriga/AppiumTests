package lib.ui.ios;

import lib.ui.pageObjects.RequestsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSRequestsPajeObject extends RequestsPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public iOSRequestsPajeObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
