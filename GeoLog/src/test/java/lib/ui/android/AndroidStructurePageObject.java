package lib.ui.android;

import lib.ui.pageObjects.StructurePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidStructurePageObject extends StructurePageObject
{
    static {
        MAIN_TITLE_LOCATOR = "id:com.geolog:id/structure_toolbar_title";
        MAIN_ICON_LOCATOR = "id:com.geolog:id/clusters_toolbar_iv_marker";
        CLUSTER_ITEM_LOCATOR = "id:com.geolog:id/cluster_item_root";
        CLUSTER_ITEM_NAME_LOCATOR = "id:com.geolog:id/cluster_item_name";
        REQUESTS_BUTTON_LOCATOR = "id:com.geolog:id/bottom_navigation_panel_requests_item";
        TASKS_BUTTON_LOCATOR = "id:com.geolog:id/bottom_navigation_panel_tasks_item";
        ROOM_CHAT_BUTTON_LOCATOR = "id:com.geolog:id/bottom_navigation_panel_messages_item";
        PROFILE_BUTTON_LOCATOR = "id:com.geolog:id/bottom_navigation_panel_profile_item";

    }

    public AndroidStructurePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
