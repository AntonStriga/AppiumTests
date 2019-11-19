package lib.ui.android;

import lib.ui.pageObjects.IncomesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidIncomesPageObject extends IncomesPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView']";
        BACK_BUTTON_LOCATOR = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
        DATE_PICKER_LOCATOR = "id:com.vitvov.profit:id/transactionDate";
        DATA_PICKER_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/transactionDateClick']/*[@class='android.widget.TextView'][1]";
        TIME_PICKER_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/transactionTimeClick']/*[@class='android.widget.TextView'][1]";
        CATEGORY_BLOCK_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/transactionCategory']//*[@class='android.widget.TextView'][1]";
    }
    public AndroidIncomesPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
