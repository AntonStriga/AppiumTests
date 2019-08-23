package lib.ui.android;

import lib.ui.ExpensesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidExpensesPageObject extends ExpensesPageObject
{
    static {
        TITLE = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView']";
        BACK_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
        DATE_PICKER = "id:com.vitvov.profit:id/transactionDate";
        DATE_PICKER_CANCEL_BUTTON = "xpath://*[@resource-id='android:id/button2'][@text='Cancel']";
        DATE_PICKER_DATE_BUTTON = "xpath://*[@resource-id='android:id/month_view']//*[@text='20']";
        DATE_PICKER_OK_BUTTON = "xpath://*[@resource-id='android:id/button1'][@text='OK']";
    }

    public AndroidExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}