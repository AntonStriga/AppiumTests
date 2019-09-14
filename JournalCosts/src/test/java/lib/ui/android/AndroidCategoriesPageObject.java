package lib.ui.android;

import lib.ui.pageObjects.CategoriesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidCategoriesPageObject extends CategoriesPageObject
{
    static {
        TITLE = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView']";
        BACK_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
    }

    public AndroidCategoriesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
