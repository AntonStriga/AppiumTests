package lib.ui.android;

import lib.ui.pageObjects.RoomChatPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidRoomChatPageObject extends RoomChatPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "";
        MAIN_ICON_LOCATOR = "id:com.geolog:id/room_chat_tv_marker";
    }

    public AndroidRoomChatPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
