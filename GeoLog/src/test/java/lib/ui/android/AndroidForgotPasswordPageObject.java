package lib.ui.android;

import lib.ui.pageObjects.ForgotPasswordPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidForgotPasswordPageObject extends ForgotPasswordPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "id:com.geolog:id/restore_password_tv_title";
        RESTORE_PASSWORD_DESCRIPTION_LOCATOR = "id:com.geolog:id/restore_password_tv_description";
        RESTORE_PASSWORD_ADMIN_LOCATOR = "id:com.geolog:id/restore_password_tv_admin";
        RESTORE_PASSWORD_PICTURE_LOCATOR = "id:com.geolog:id/restore_password_iv_pic";
        BACK_BUTTON_LOCATOR = "id:com.geolog:id/restore_password_iv_back";
    }

    public AndroidForgotPasswordPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
