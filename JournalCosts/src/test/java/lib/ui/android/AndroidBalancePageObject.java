package lib.ui.android;

import lib.ui.pageObjects.BalancePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidBalancePageObject extends BalancePageObject
{
    static {
        TITLE = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView']";
    }
    public AndroidBalancePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
