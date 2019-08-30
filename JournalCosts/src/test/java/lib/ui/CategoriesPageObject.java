package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class CategoriesPageObject extends MainPageObject
{
    protected static String
        TITLE;

    public CategoriesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }


}
