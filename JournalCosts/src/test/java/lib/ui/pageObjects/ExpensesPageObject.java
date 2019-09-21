package lib.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ExpensesPageObject extends MainPageObject
{
    protected static String
        TITLE,
        BACK_BUTTON,
        DATE_PICKER,
        DATA_PICKER_TITLE,
        DATE_PICKER_CANCEL_BUTTON,
        DATE_PICKER_DATE_BUTTON,
        DATE_PICKER_OK_BUTTON,
        TIME_PICKER,
        TIME_PICKER_TITLE,
        TIME_PICKER_OK_BUTTON,
        TIME_PICKER_CANCEL_BUTTON,
        TIME_PICKER_HOUR_BUTTON,
        TIME_PICKER_HOUR_NUMBER_BUTTON,
        TIME_PICKER_MINUTES_BUTTON,
        TIME_PICKER_MINUTES_NUMBER_BUTTON,
        TIME_PICKER_AM_BUTTON,
        TIME_PICKER_PM_BUTTON,
        CATEGORY_LINK,
        CATEGORY_BLOCK_TITLE,
        AMOUNT_BLOCK_TITLE;

    public ExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    /* TEMPLATE METHODS */

    /* TEMPLATE METHODS */

    public String getTitle()
    {
        WebElement element = this.waitForTitleElement(TITLE);
        return element.getAttribute("text");
    }

    public void clickBackButton()
    {
        this.waitForElementAndClick(BACK_BUTTON, "Cannot find Back button by locator " + BACK_BUTTON);
    }

    public void  openDatePicker()
    {
        this.waitForElementAndClick(DATE_PICKER,"Cannot find Date picker by locator " + DATE_PICKER);
    }

    public void cancelDatePicker()
    {
        this.waitForElementAndClick(DATE_PICKER_CANCEL_BUTTON, "Cannot find Date picker Cancel button by locator " + DATE_PICKER_CANCEL_BUTTON);
    }

    private void selectDate()
    {
        this.waitForElementAndClick(DATE_PICKER_DATE_BUTTON, "Cannot select date in Date picker by locator " + DATE_PICKER_DATE_BUTTON);
    }

    private void clikDataPickerOkButton()
    {
        this.waitForElementAndClick(DATE_PICKER_OK_BUTTON, "Cannot find OK button in Date picker by locator " + DATE_PICKER_OK_BUTTON);
    }

    public String setDate()
    {
        this.openDatePicker();
        this.selectDate();
        WebElement selected_element = this.waitForElementPresent(DATE_PICKER_DATE_BUTTON, "Cannot select date in Date picker by locator " + DATE_PICKER_DATE_BUTTON);
        String selected_date = selected_element.getAttribute("name");
        this.clikDataPickerOkButton();
        return selected_date.substring(0,6) + selected_date.substring(selected_date.lastIndexOf(" "));
    }

    public String getDate()
    {
        WebElement date_element = this.waitForElementPresent(DATE_PICKER,"Cannot find Date picker by locator " + DATE_PICKER);
        return date_element.getAttribute("text");
    }

    public void openTimePicker()
    {
        this.waitForElementAndClick(TIME_PICKER,"Cannot find Date picker by locator " + TIME_PICKER);
    }

    private void selectHour()
    {
        this.waitForElementAndClick(TIME_PICKER_HOUR_BUTTON,"Cannot find Hour set button by locator " + TIME_PICKER_HOUR_BUTTON);
        this.waitForElementAndClick(TIME_PICKER_HOUR_NUMBER_BUTTON,"Cannot find Hour number by locator " + TIME_PICKER_HOUR_NUMBER_BUTTON);
    }

    private void selectMinutes()
    {
        this.waitForElementAndClick(TIME_PICKER_MINUTES_BUTTON,"Cannot find Minutes set button by locator " + TIME_PICKER_MINUTES_BUTTON);
        this.waitForElementAndClick(TIME_PICKER_MINUTES_NUMBER_BUTTON,"Cannot find Minutes set button by locator " + TIME_PICKER_MINUTES_NUMBER_BUTTON);
    }

    private void selectPM()
    {
        this.waitForElementAndClick(TIME_PICKER_PM_BUTTON,"Cannot find PM set button by locator " + TIME_PICKER_PM_BUTTON);
    }

    public void clickTimePickerOKButton()
    {
        this.waitForElementAndClick(TIME_PICKER_OK_BUTTON, "Cannot find Date picker Cancel button by locator " + TIME_PICKER_OK_BUTTON);
    }

    public void cancelTimePicker()
    {
        this.waitForElementAndClick(TIME_PICKER_CANCEL_BUTTON, "Cannot find Date picker Cancel button by locator " + TIME_PICKER_CANCEL_BUTTON);
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
        WebElement date_element = this.waitForElementPresent(TIME_PICKER,"Cannot find Time picker by locator " + TIME_PICKER);
        return date_element.getAttribute("text");
    }

    public void openCategory()
    {
        this.waitForElementAndClick(CATEGORY_LINK,"Cannot find Category link by locator " + CATEGORY_LINK);
    }

    public String getDataPickerTitle()
    {
        WebElement element = this.waitForTitleElement(DATA_PICKER_TITLE);
        return element.getAttribute("text");
    }

    public String getTimePickerTitle()
    {
        WebElement element = this.waitForTitleElement(TIME_PICKER_TITLE);
        return element.getAttribute("text");
    }

    public String getCategoryBlockTitle()
    {
        WebElement element = this.waitForTitleElement(CATEGORY_BLOCK_TITLE);
        return element.getAttribute("text");
    }

    public String getAmountBlockTitle()
    {
        WebElement element = this.waitForTitleElement(AMOUNT_BLOCK_TITLE);
        return element.getAttribute("text");
    }
}
