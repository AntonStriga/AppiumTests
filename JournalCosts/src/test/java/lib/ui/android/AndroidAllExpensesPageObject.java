package lib.ui.android;

import lib.ui.pageObjects.AllExpensesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidAllExpensesPageObject extends AllExpensesPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public AndroidAllExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
