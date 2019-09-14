package lib.ui.android;

import lib.ui.pageObjects.ExpensesPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidExpensesPageObject extends ExpensesPageObject
{
    static {
        TITLE = "xpath://*[@resource-id='com.vitvov.profit:id/action_bar']//*[@class='android.widget.TextView']";
        BACK_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
        DATE_PICKER = "id:com.vitvov.profit:id/transactionDate";
        DATE_PICKER_DATE_BUTTON = "xpath://*[@resource-id='android:id/month_view']//*[@text='20']";
        DATE_PICKER_OK_BUTTON = "xpath://*[@resource-id='android:id/button1'][@text='OK']";
        DATE_PICKER_CANCEL_BUTTON = "xpath://*[@resource-id='android:id/button2'][@text='Cancel']";
        TIME_PICKER = "id:com.vitvov.profit:id/transactionTime";
        TIME_PICKER_OK_BUTTON = "xpath://*[@resource-id='android:id/button1'][@text='OK']";
        TIME_PICKER_CANCEL_BUTTON = "xpath://*[@resource-id='android:id/button2'][@text='Cancel']";
        TIME_PICKER_HOUR_BUTTON = "id:android:id/hours";
        TIME_PICKER_HOUR_NUMBER_BUTTON = "xpath://*[@resource-id='android:id/radial_picker']//*[@content-desc='10']";
        TIME_PICKER_MINUTES_BUTTON = "id:android:id/minutes";
        TIME_PICKER_MINUTES_NUMBER_BUTTON = "xpath://*[@resource-id='android:id/radial_picker']//*[@content-desc='35']";
        TIME_PICKER_AM_BUTTON = "id:android:id/am_label";
        TIME_PICKER_PM_BUTTON = "id:android:id/pm_label";
        CATEGORY_LINK = "id:com.vitvov.profit:id/transactionCategoryText";
    }

    public AndroidExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}