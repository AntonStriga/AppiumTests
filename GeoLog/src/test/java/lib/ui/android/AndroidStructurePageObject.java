package lib.ui.android;

import lib.ui.pageObjects.StructurePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidStructurePageObject extends StructurePageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public AndroidStructurePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
