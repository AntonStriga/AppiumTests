package lib.ui.ios;

import lib.ui.pageObjects.ExpensesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSExpensesPageObject extends ExpensesPageObject
{
    static {
        TITLE = "";
    }

    public iOSExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
