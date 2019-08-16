package lib.ui.android;

import lib.ui.ExpensesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidExpensesPageObject extends ExpensesPageObject
{
    static {
        TITLE = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView']";
        BACK_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
    }

    public AndroidExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}