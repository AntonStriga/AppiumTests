package lib.ui.factories;

import lib.Platform;
import lib.ui.android.AndroidRoomChatPageObject;
import lib.ui.ios.iOSRoomChatPageObject;
import lib.ui.pageObjects.RoomChatPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RoomChatPageObjectFactory
{
    public static RoomChatPageObject get(RemoteWebDriver driver)
    {
        if(Platform.getInstance().isAndroid()) {
            return new AndroidRoomChatPageObject(driver);
        } else {
            return new iOSRoomChatPageObject(driver);
        }
    }
}
