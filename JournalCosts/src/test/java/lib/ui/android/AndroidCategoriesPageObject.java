package lib.ui.android;

import lib.ui.CategoriesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidCategoriesPageObject extends CategoriesPageObject
{
    static {
        TITLE = "";
    }

    public AndroidCategoriesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
