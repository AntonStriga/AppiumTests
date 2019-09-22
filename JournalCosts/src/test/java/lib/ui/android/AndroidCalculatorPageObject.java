package lib.ui.android;

import lib.ui.pageObjects.CalculatorPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidCalculatorPageObject extends CalculatorPageObject
{
    static {
        TITLE = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView'][1]";
        BACK_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
    }
    public AndroidCalculatorPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
