package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ExpensesPageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Expense",
            DATA_PICKER_TITLE = "Date",
            TIME_PICKER_TITLE = "Time",
            CATEGORY_BLOCK_TITLE = "Category",
            AMOUNT_BLOCK_TITLE = "Amount",
            CURRENCY_BLOCK_TITLE = "Currency";

    protected static String
            MAIN_TITLE_LOCATOR,
            BACK_BUTTON_LOCATOR,
            DATE_PICKER_LOCATOR,
            DATA_PICKER_TITLE_LOCATOR,
            DATE_PICKER_CANCEL_BUTTON_LOCATOR,
            DATE_PICKER_DATE_BUTTON_LOCATOR,
            DATE_PICKER_OK_BUTTON_LOCATOR,
            TIME_PICKER_LOCATOR,
            TIME_PICKER_TITLE_LOCATOR,
            TIME_PICKER_OK_BUTTON_LOCATOR,
            TIME_PICKER_CANCEL_BUTTON_LOCATOR,
            TIME_PICKER_HOUR_BUTTON_LOCATOR,
            TIME_PICKER_HOUR_NUMBER_BUTTON_LOCATOR,
            TIME_PICKER_MINUTES_BUTTON_LOCATOR,
            TIME_PICKER_MINUTES_NUMBER_BUTTON_LOCATOR,
            TIME_PICKER_AM_BUTTON_LOCATOR,
            TIME_PICKER_PM_BUTTON_LOCATOR,
            CATEGORY_LINK_LOCATOR,
            CATEGORY_BLOCK_TITLE_LOCATOR,
            AMOUNT_BLOCK_TITLE_LOCATOR,
            CALCULATOR_LINK_LOCATOR,
            CURRENCY_BLOCK_TITLE_LOCATOR;

    public ExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    /* TEMPLATE METHODS */

    /* TEMPLATE METHODS */

    public String getTitle()
    {
        WebElement element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return element.getAttribute("text");
    }

    public void clickBackButton()
    {
        this.waitForElementAndClick(BACK_BUTTON_LOCATOR, "Cannot find Back button by locator " + BACK_BUTTON_LOCATOR);
    }

    public void  openDatePicker()
    {
        this.waitForElementAndClick(DATE_PICKER_LOCATOR,"Cannot find Date picker by locator " + DATE_PICKER_LOCATOR);
    }

    public void cancelDatePicker()
    {
        this.waitForElementAndClick(DATE_PICKER_CANCEL_BUTTON_LOCATOR, "Cannot find Date picker Cancel button by locator " + DATE_PICKER_CANCEL_BUTTON_LOCATOR);
    }

    private void selectDate()
    {
        this.waitForElementAndClick(DATE_PICKER_DATE_BUTTON_LOCATOR, "Cannot select date in Date picker by locator " + DATE_PICKER_DATE_BUTTON_LOCATOR);
    }

    private void clikDataPickerOkButton()
    {
        this.waitForElementAndClick(DATE_PICKER_OK_BUTTON_LOCATOR, "Cannot find OK button in Date picker by locator " + DATE_PICKER_OK_BUTTON_LOCATOR);
    }

    public String setDate()
    {
        this.openDatePicker();
        this.selectDate();
        WebElement selected_element = this.waitForElementPresent(DATE_PICKER_DATE_BUTTON_LOCATOR, "Cannot select date in Date picker by locator " + DATE_PICKER_DATE_BUTTON_LOCATOR);
        String selected_date = selected_element.getAttribute("name");
        this.clikDataPickerOkButton();
        return selected_date.substring(0,6) + selected_date.substring(selected_date.lastIndexOf(" "));
    }

    public String getDate()
    {
        WebElement date_element = this.waitForElementPresent(DATE_PICKER_LOCATOR,"Cannot find Date picker by locator " + DATE_PICKER_LOCATOR);
        return date_element.getAttribute("text");
    }

    public void openTimePicker()
    {
        this.waitForElementAndClick(TIME_PICKER_LOCATOR,"Cannot find Date picker by locator " + TIME_PICKER_LOCATOR);
    }

    private void selectHour()
    {
        this.waitForElementAndClick(TIME_PICKER_HOUR_BUTTON_LOCATOR,"Cannot find Hour set button by locator " + TIME_PICKER_HOUR_BUTTON_LOCATOR);
        this.waitForElementAndClick(TIME_PICKER_HOUR_NUMBER_BUTTON_LOCATOR,"Cannot find Hour number by locator " + TIME_PICKER_HOUR_NUMBER_BUTTON_LOCATOR);
    }

    private void selectMinutes()
    {
        this.waitForElementAndClick(TIME_PICKER_MINUTES_BUTTON_LOCATOR,"Cannot find Minutes set button by locator " + TIME_PICKER_MINUTES_BUTTON_LOCATOR);
        this.waitForElementAndClick(TIME_PICKER_MINUTES_NUMBER_BUTTON_LOCATOR,"Cannot find Minutes set button by locator " + TIME_PICKER_MINUTES_NUMBER_BUTTON_LOCATOR);
    }

    private void selectPM()
    {
        this.waitForElementAndClick(TIME_PICKER_PM_BUTTON_LOCATOR,"Cannot find PM set button by locator " + TIME_PICKER_PM_BUTTON_LOCATOR);
    }

    private void clickTimePickerOKButton()
    {
        this.waitForElementAndClick(TIME_PICKER_OK_BUTTON_LOCATOR, "Cannot find Date picker Cancel button by locator " + TIME_PICKER_OK_BUTTON_LOCATOR);
    }

    public void cancelTimePicker()
    {
        this.waitForElementAndClick(TIME_PICKER_CANCEL_BUTTON_LOCATOR, "Cannot find Date picker Cancel button by locator " + TIME_PICKER_CANCEL_BUTTON_LOCATOR);
    }

    public void setTime()
    {
        this.openTimePicker();
        this.selectHour();
        this.selectMinutes();
        this.selectPM();
        this.clickTimePickerOKButton();
    }

    public String getTime()
    {
        WebElement date_element = this.waitForElementPresent(TIME_PICKER_LOCATOR,"Cannot find Time picker by locator " + TIME_PICKER_LOCATOR);
        return date_element.getAttribute("text");
    }

    public void openCategory()
    {
        this.waitForElementAndClick(CATEGORY_LINK_LOCATOR,"Cannot find Category link by locator " + CATEGORY_LINK_LOCATOR);
    }

    public String getDataPickerTitle()
    {
        WebElement element = this.waitForTitleElement(DATA_PICKER_TITLE_LOCATOR);
        return element.getAttribute("text");
    }

    public String getTimePickerTitle()
    {
        WebElement element = this.waitForTitleElement(TIME_PICKER_TITLE_LOCATOR);
        return element.getAttribute("text");
    }

    public String getCategoryBlockTitle()
    {
        WebElement element = this.waitForTitleElement(CATEGORY_BLOCK_TITLE_LOCATOR);
        return element.getAttribute("text");
    }

    public String getAmountBlockTitle()
    {
        WebElement element = this.waitForTitleElement(AMOUNT_BLOCK_TITLE_LOCATOR);
        return element.getAttribute("text");
    }

    public String getCurrencyBlockTitle()
    {
        WebElement element = this.waitForTitleElement(CURRENCY_BLOCK_TITLE_LOCATOR);
        return element.getAttribute("text");
    }

    public void openCalculator()
    {
        this.waitForElementAndClick(CALCULATOR_LINK_LOCATOR,"Cannot find Calculator link by locator " + CALCULATOR_LINK_LOCATOR);
    }
}
