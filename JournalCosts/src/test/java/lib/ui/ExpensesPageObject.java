package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ExpensesPageObject extends MainPageObject
{
    protected static String
        TITLE;

    public ExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

}
