package lib.ui.android;

import lib.ui.pageObjects.HomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidHomePageObject extends HomePageObject
{
    static {
        MAIN_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/toolbar']//*[@class='android.widget.TextView']";
        ADD_EXPENSE_BUTTON_LOCATOR = "id:com.vitvov.profit:id/btTopAddCost";
    }

    public AndroidHomePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
