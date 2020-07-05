package lib.ui.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

abstract public class StructurePageObject extends MainPageObject
{
    public final String
            MAIN_TITLE = "Геолог";

    protected static String
            MAIN_TITLE_LOCATOR,
            MAIN_ICON_LOCATOR,
            CLUSTER_ITEM_LOCATOR,
            CLUSTER_ITEM_NAME_LOCATOR,
            REQUESTS_BUTTON_LOCATOR,
            TASKS_BUTTON_LOCATOR,
            ROOM_CHAT_BUTTON_LOCATOR,
            PROFILE_BUTTON_LOCATOR;

    public StructurePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    public String getTitle()
    {
        WebElement title_element = this.waitForTitleElement(MAIN_TITLE_LOCATOR);
        return title_element.getAttribute("text");
    }

    public Boolean isIconPresent()
    {
        this.waitForElementPresent(MAIN_ICON_LOCATOR, "Can not find title icon by locator: " + MAIN_ICON_LOCATOR);
        return true;
    }

    public void swipeClustersLeftToFindName(String Cluster_Name)
    {
        By by = this.generateLocatorByString(CLUSTER_ITEM_NAME_LOCATOR);

        int already_swipe = 0;
        while (already_swipe != 20) {
            List <WebElement> elements = driver.findElements(by);
            for (WebElement element: elements) {
                if (element.getAttribute("text").equals(Cluster_Name)) {
                    return;
                }
            }
            this.swipeElementLeft(elements.get(elements.size() - 1));
            ++already_swipe;
        }
        throw new Error("Can not find Cluster with name: " + Cluster_Name);
    }

    public void clickRequestsButton()
    {
        this.waitForElementAndClick(REQUESTS_BUTTON_LOCATOR, "Can not find Requests button by locator: " + REQUESTS_BUTTON_LOCATOR);
    }

    public void clickTasksButton()
    {
        this.waitForElementAndClick(TASKS_BUTTON_LOCATOR, "Can not find Tasks button by locator: " + TASKS_BUTTON_LOCATOR);

    }

    public void clickRoomChatButton()
    {
        this.waitForElementAndClick(ROOM_CHAT_BUTTON_LOCATOR, "Can not find Room chat button by locator: " + ROOM_CHAT_BUTTON_LOCATOR);

    }

    public void clickProfileButton()
    {
        this.waitForElementAndClick(PROFILE_BUTTON_LOCATOR, "Can not find Profile button by locator: " + PROFILE_BUTTON_LOCATOR);

    }
}
