package lib.ui.ios;

import lib.ui.pageObjects.StructurePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSStructurePageObject extends StructurePageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public iOSStructurePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
