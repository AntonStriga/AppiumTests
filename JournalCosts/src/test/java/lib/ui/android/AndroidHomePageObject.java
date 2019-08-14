package lib.ui.android;

import lib.ui.HomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidHomePageObject extends HomePageObject
{
    static {
        TITLE = "xpath://*[@resource-id='com.vitvov.profit:id/toolbar']//*[@class='android.widget.TextView']";
        TITLE_EXPENSE = "xpath://*[@resource-id='com.vitvov.profit:id/l1']//*[@class='android.widget.TextView']";
        TITLE_INCOMES = "xpath://*[@resource-id='com.vitvov.profit:id/l2']//*[@class='android.widget.TextView']";
        TITLE_BALANCE = "xpath://*[@resource-id='com.vitvov.profit:id/l3']//*[@class='android.widget.TextView']";
    }

    public AndroidHomePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
