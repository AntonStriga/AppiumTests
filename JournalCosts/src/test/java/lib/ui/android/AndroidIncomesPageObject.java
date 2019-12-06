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
        DATE_PICKER_DATE_BUTTON_LOCATOR = "xpath://*[@resource-id='android:id/month_view']//*[@text='20']";
        DATE_PICKER_OK_BUTTON_LOCATOR = "xpath://*[@resource-id='android:id/button1'][@text='OK']";
        DATE_PICKER_CANCEL_BUTTON_LOCATOR = "xpath://*[@resource-id='android:id/button2'][@text='Cancel']";
        TIME_PICKER_LOCATOR = "id:com.vitvov.profit:id/transactionTime";
        TIME_PICKER_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/transactionTimeClick']/*[@class='android.widget.TextView'][1]";
        TIME_PICKER_OK_BUTTON_LOCATOR = "xpath://*[@resource-id='android:id/button1'][@text='OK']";
        TIME_PICKER_CANCEL_BUTTON_LOCATOR = "xpath://*[@resource-id='android:id/button2'][@text='Cancel']";
        TIME_PICKER_HOUR_BUTTON_LOCATOR = "id:android:id/hours";
        TIME_PICKER_HOUR_NUMBER_BUTTON_LOCATOR = "xpath://*[@resource-id='android:id/radial_picker']//*[@content-desc='10']";
        TIME_PICKER_MINUTES_BUTTON_LOCATOR = "id:android:id/minutes";
        TIME_PICKER_MINUTES_NUMBER_BUTTON_LOCATOR = "xpath://*[@resource-id='android:id/radial_picker']//*[@content-desc='35']";
        TIME_PICKER_AM_BUTTON_LOCATOR = "id:android:id/am_label";
        TIME_PICKER_PM_BUTTON_LOCATOR = "id:android:id/pm_label";
        CATEGORY_LINK_LOCATOR = "id:com.vitvov.profit:id/transactionCategoryText";
        CATEGORY_BLOCK_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/transactionCategory']//*[@class='android.widget.TextView'][1]";
        AMOUNT_BLOCK_TITLE_LOCATOR = "id:com.vitvov.profit:id/textView2";
        CALCULATOR_LINK_LOCATOR = "id:com.vitvov.profit:id/ibtCostCalc";
        CURRENCY_BLOCK_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/transactionCurrency']//*[@class='android.widget.TextView'][1]";
    }
    public AndroidIncomesPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
