package lib.ui.ios;

import lib.ui.pageObjects.LoginPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSLoginPageObject extends LoginPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public iOSLoginPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
