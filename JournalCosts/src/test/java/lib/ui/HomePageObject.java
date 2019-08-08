package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class HomePageObject extends MainPageObject
{
    protected static String
        TITLE;

    public HomePageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
