package lib.ui.android;

import lib.ui.pageObjects.IncomesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidIncomesPageObject extends IncomesPageObject
{
    static {
        TITLE = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView']";
    }
    public AndroidIncomesPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}