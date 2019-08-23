package lib.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class ExpensesPageObject extends MainPageObject
{
    protected static String
        TITLE,
        BACK_BUTTON,
        DATE_PICKER,
        DATE_PICKER_CANCEL_BUTTON,
        DATE_PICKER_DATE_BUTTON,
        DATE_PICKER_OK_BUTTON;

    public ExpensesPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

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

    private void clikOkButton()
    {
        this.waitForElementAndClick(DATE_PICKER_OK_BUTTON, "Cannot find OK button in Date picker by locator " + DATE_PICKER_OK_BUTTON);
    }

    public String setDate()
    {
        this.openDatePicker();
        this.selectDate();
        WebElement selected_element = this.waitForElementPresent(DATE_PICKER_DATE_BUTTON, "Cannot select date in Date picker by locator " + DATE_PICKER_DATE_BUTTON);
        String selected_date = selected_element.getAttribute("name");
        this.clikOkButton();
        return selected_date.substring(0,6) + selected_date.substring(selected_date.lastIndexOf(" "));
    }

    public String getDate() {
        WebElement date_element = this.waitForElementPresent(DATE_PICKER,"Cannot find Date picker by locator " + DATE_PICKER);
        return date_element.getAttribute("text");
    }
}
