package lib.ui.android;

import lib.ui.pageObjects.TasksPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidTasksPageObject extends TasksPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
        MAIN_ICON_LOCATOR = "id:com.geolog:id/room_chat_tv_title";
    }

    public AndroidTasksPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
