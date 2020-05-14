package lib.ui.ios;

import lib.ui.pageObjects.ForgotPasswordPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSForgotPasswordPageObject extends ForgotPasswordPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public iOSForgotPasswordPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
