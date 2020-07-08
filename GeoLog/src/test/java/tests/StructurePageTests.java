package tests;

import io.appium.java_client.AppiumDriver;
import lib.CoreTestCase;
import lib.ui.factories.*;
import lib.ui.pageObjects.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class StructurePageTests extends CoreTestCase
{
    @BeforeMethod
    public void precondition()
    {
        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.getDescription();
        LoginPageObject.clearLogin();
        LoginPageObject.setLogin(LoginPageObject.LOGIN);
        LoginPageObject.clearPassword();
        LoginPageObject.setPassword(LoginPageObject.PASSWORD);
        ((AppiumDriver)driver).hideKeyboard();
        LoginPageObject.clickEnterButton();
    }

    @Test ()
    public void iconVerification()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        Boolean title_icon = StructurePageObject.isIconPresent();

        assertTrue(
                title_icon,
                "Title Icon is not shown."
        );
    }

    @Test ()
    public void swipeClasters()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        StructurePageObject.getTitle();
        StructurePageObject.swipeClustersLeftToFindName("Клондайк");
    }

    @Test (groups = {"navigation"})
    public void navigateToRequestsPage()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        StructurePageObject.getTitle();
        StructurePageObject.clickRequestsButton();

        RequestsPageObject RequestsPajeObject = RequestsPajeObjectFactory.get(driver);
        Boolean title_icon = RequestsPajeObject.isIconPresent();

        assertTrue(
                title_icon,
                "Requests page is not opened."
        );
    }

    @Test (groups = {"navigation"})
    public void navigateToTasksPage()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        StructurePageObject.getTitle();
        StructurePageObject.clickTasksButton();

        TasksPageObject TasksPageObject = TasksPageObjectFactory.get(driver);
        Boolean title_icon = TasksPageObject.isIconPresent();

        assertTrue(
                title_icon,
                "Tasks page is not opened."
        );
    }

    @Test (groups = {"navigation"})
    public void navigateToRoomChatPage()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        StructurePageObject.getTitle();
        StructurePageObject.clickRoomChatButton();

        RoomChatPageObject RoomChatPageObject = RoomChatPageObjectFactory.get(driver);
        Boolean title_icon = RoomChatPageObject.isIconPresent();

        assertTrue(
                title_icon,
                "Tasks page is not opened."
        );
    }

    @Test (groups = {"navigation"})
    public void navigateToProfilePage()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        StructurePageObject.getTitle();
        StructurePageObject.clickProfileButton();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);
        Boolean title_icon = ProfilePageObject.isIconPresent();

        assertTrue(
                title_icon,
                "Profile page is not opened."
        );
    }

    @Test (groups = {"navigation"})
    public void navigateToStructurePage()
    {
        StructurePageObject StructurePageObject = StructurePageObjectFactory.get(driver);
        StructurePageObject.getTitle();
        StructurePageObject.clickProfileButton();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);
        ProfilePageObject.isIconPresent();

        StructurePageObject.clickStructureButton();
        Boolean title_icon = StructurePageObject.isIconPresent();

        assertTrue(
                title_icon,
                "Structure page is not opened."
        );
    }
}
