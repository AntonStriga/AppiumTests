package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidTasksPageObject;
import lib.ui.ios.iOSTasksPageObject;
import lib.ui.pageObjects.TasksPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TasksPageObjectFactory
{
    public static TasksPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidTasksPageObject(driver);
        } else {
            return new iOSTasksPageObject(driver);
        }
    }
}
