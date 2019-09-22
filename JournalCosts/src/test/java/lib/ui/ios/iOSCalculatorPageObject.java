package lib.ui.ios;

import lib.ui.pageObjects.CalculatorPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSCalculatorPageObject extends CalculatorPageObject
{
    static {
        TITLE = "";
    }

    public iOSCalculatorPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
