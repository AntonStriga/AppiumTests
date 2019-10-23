package lib.ui.android;

import lib.ui.pageObjects.HomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidHomePageObject extends HomePageObject
{
    static {
        MAIN_TITLE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/toolbar']//*[@class='android.widget.TextView']";
        TITLE_EXPENSE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/l1']//*[@class='android.widget.TextView']";
        TITLE_INCOMES_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/l2']//*[@class='android.widget.TextView']";
        TITLE_BALANCE_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/l3']//*[@class='android.widget.TextView']";
        TITLE_ALL_EXPENSES_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/ibtTopSummryCost']/following-sibling::*[@class='android.widget.TextView']";
        TITLE_ALL_INCOMES_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/ibtTopSummryProfit']/following-sibling::*[@class='android.widget.TextView']";
        ADD_EXPENSE_BUTTON_LOCATOR = "id:com.vitvov.profit:id/btTopAddCost";
        ADD_INCOMES_BUTTON_LOCATOR = "id:com.vitvov.profit:id/btTopAddProfit";
        VIEW_BALANCE_BUTTON_LOCATOR = "id:com.vitvov.profit:id/btTopBallanceMore";
        TODAY_EXPENSE_SUM_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/costListView']//*[@text='Today']/following-sibling::*[@resource-id='com.vitvov.profit:id/tvVal']";
        WEEK_EXPENSE_SUM_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/costListView']//*[@text='Week']/following-sibling::*[@resource-id='com.vitvov.profit:id/tvVal']";
        MONTH_EXPENSE_SUM_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/costListView']//*[@text='Month']/following-sibling::*[@resource-id='com.vitvov.profit:id/tvVal']";
        EXPENCE_CURRENCY_VALUE_LOCATOR = "id:com.vitvov.profit:id/tvMainCurrency";
        INCOME_CURRENCY_VALUE_LOCATOR = "id:com.vitvov.profit:id/tvMainCurrency2";
        BALANCE_CURRENCY_VALUE_LOCATOR = "id:com.vitvov.profit:id/tvMainCurrency3";
        MONTH_INCOMES_SUM_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/profitListView']//*[@text='Month']/following-sibling::*[@resource-id='com.vitvov.profit:id/tvVal']";
        BALANCE_SUM_LOCATOR = "xpath://*[@resource-id='com.vitvov.profit:id/balanceListView']//*[@text='Month']/following-sibling::*[@resource-id='com.vitvov.profit:id/tvVal']";
    }

    public AndroidHomePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
