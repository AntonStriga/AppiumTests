package lib.ui.android;

import lib.ui.pageObjects.IncomesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidIncomesPageObject extends IncomesPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView']";
        BACK_BUTTON_LOCATOR = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
    }
    public AndroidIncomesPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
