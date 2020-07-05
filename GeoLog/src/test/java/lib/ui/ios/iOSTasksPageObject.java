package lib.ui.ios;

import lib.ui.pageObjects.TasksPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSTasksPageObject extends TasksPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public iOSTasksPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
