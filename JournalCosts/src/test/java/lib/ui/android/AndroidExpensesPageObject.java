package lib.ui.android;

import lib.ui.ExpensesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidExpensesPageObject extends ExpensesPageObject
{
    static {
        TITLE = "";
    }

    public AndroidExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
