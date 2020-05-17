package lib.ui.android;

import lib.ui.pageObjects.LoginPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidLoginPageObject extends LoginPageObject
{
    static {
        MAIN_TITLE_LOCATOR = "id:com.geolog:id/signin_tv_logo";
        MAIN_DESCRIPTION_LOCATOR = "id:com.geolog:id/signin_tv_description";
        LOGIN_FIELD_LOCATOR = "id:com.geolog:id/signin_et_email";
        LOGIN_FIELD_TITLE_LOCATOR = "id:com.geolog:id/signin_tv_email";
        PASSWORD_FIELD_LOCATOR = "id:com.geolog:id/signin_et_password";
        PASSWORD_FIELD_TITLE_LOCATOR = "id:com.geolog:id/signin_tv_password";
        ENTER_BUTTON_LOCATOR = "id:com.geolog:id/signin_btn_login";
        FORGOT_PASSWORD_BUTTON_LOCATOR = "id:com.geolog:id/signin_btn_forgot";
    }

    public AndroidLoginPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
