package lib.ui.ios;

import lib.ui.pageObjects.RoomChatPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSRoomChatPageObject extends RoomChatPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
    }

    public iOSRoomChatPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
