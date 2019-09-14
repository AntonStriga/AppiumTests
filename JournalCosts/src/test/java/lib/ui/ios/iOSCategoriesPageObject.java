package lib.ui.ios;

import lib.ui.pageObjects.CategoriesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSCategoriesPageObject extends CategoriesPageObject
{
    static {
        TITLE = "";
    }

    public iOSCategoriesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
